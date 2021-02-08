package converter;

import java.util.List;
import tag.ParagraphTag;

public class ParagraphTagConverter extends TagConverter {
    ParagraphTag paragraphTag = new ParagraphTag();
    AnchorTagConverter anchorTagConverter = new AnchorTagConverter();

    @Override
    public String convertToHtml(List<String> inputs) {
        return convertToParagraph(inputs);
    }

    @Override
    public boolean isValidTag(List<String> inputs) {
        return !inputs.isEmpty();
    }

    private String convertToParagraph(List<String> inputs) {
        StringBuilder sb = new StringBuilder();
        sb.append(paragraphTag.getOpeningTag());
        String input;
        for (int i = 0; i < inputs.size(); i++) {
            input = anchorTagConverter.convertToHtml(inputs.get(i));
            sb.append(input);
            if (i == inputs.size() - 1) {
                sb.append(paragraphTag.getClosingTag());
            }
            sb.append(NEW_LINE);
        }
        return sb.toString();
    }
}
