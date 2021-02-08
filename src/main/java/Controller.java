import converter.EmptyLineConverter;
import converter.HTagConverter;
import converter.ParagraphTagConverter;
import converter.TagConverter;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Controller {
    private final HTagConverter hTagConverter = new HTagConverter();
    private final ParagraphTagConverter paragraphTagConverter = new ParagraphTagConverter();
    private final EmptyLineConverter emptyLineConverter = new EmptyLineConverter();


    public String mdToHtml(String md) {
        List<String> mdStrings = new BufferedReader(new StringReader(md)).lines().collect(Collectors.toList());
        return convertByLine(mdStrings).toString();
    }

    private StringBuilder convertByLine(List<String> mdStrings) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> pStringList = new LinkedList<>();
        for (String input : mdStrings) {
            if (hTagConverter.isValidTag(input)) {
                stringBuilder.append(hTagConverter.convertToHtml(input));
            } else if (emptyLineConverter.isValidTag(input)) {
                stringBuilder.append(paragraphTagConverter.convertToHtml(pStringList));
                stringBuilder.append(emptyLineConverter.convertToHtml(input));
                pStringList.clear();
            } else {
                pStringList.add(input);
            }
        }

        if (paragraphTagConverter.isValidTag(pStringList)) {
            stringBuilder.append(paragraphTagConverter.convertToHtml(pStringList));
        }

        // Remove the last newline character at the end
        stringBuilder.setLength(stringBuilder.length() - TagConverter.NEW_LINE.length());

        return stringBuilder;
    }
}
