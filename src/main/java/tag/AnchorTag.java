package tag;

public class AnchorTag extends Tag {
    private static final String opening = "<a";
    private static final String closing = "</a>";
    private static final String openingHref = " href=\"";
    private static final String closingHref = "\">";

    public AnchorTag() {
        super(opening, closing);
    }

    // TODO: Handle special characters like $
    public StringBuilder getStringWithTags(String hyperLink, String text) {
        return new StringBuilder(opening + openingHref + hyperLink + closingHref + text + closing);
    }
}
