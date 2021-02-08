package converter;

import java.util.List;

public abstract class TagConverter {
    public static final String NEW_LINE = "\n";

    public String convertToHtml(String input) {
        return null;
    }

    public String convertToHtml(List<String> inputs) {
        return null;
    }

    public boolean isValidTag(String input) {
        return true;
    }

    public boolean isValidTag(List<String> inputs) {
        return true;
    }
}
