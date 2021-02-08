package converter;

public class EmptyLineConverter extends TagConverter{

    @Override
    public String convertToHtml(String input) {
        return isValidTag(input) ? NEW_LINE : input;
    }

    @Override
    public boolean isValidTag(String input) {
        return input.trim().length() == 0;
    }
}
