package converter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tag.AnchorTag;

public class AnchorTagConverter extends TagConverter{
    private static final String LINK_REGEX = "\\[(.*?)]\\((.*?)\\)";
    private final Pattern LINK_PATTERN = Pattern.compile(LINK_REGEX);
    private final AnchorTag anchorTag;

    public AnchorTagConverter() {
        anchorTag = new AnchorTag();
    }

    @Override
    public String convertToHtml(String input) {
        return isValidTag(input) ? convertAnchorTag(input) : input;
    }

    @Override
    public boolean isValidTag(String input) {
        return LINK_PATTERN.matcher(input).find();
    }

    private String convertAnchorTag(String input) {
        Matcher matcher = LINK_PATTERN.matcher(input);
        if (matcher.find()) {
            String text = matcher.group(1);
            String hyperLink = matcher.group(2);
            String anchorTagText = anchorTag.getStringWithTags(hyperLink, text).toString();
            input = matcher.replaceFirst(anchorTagText);
            return convertAnchorTag(input);
        }

        return input;
    }


}
