package tag;

public class ParagraphTag extends Tag{
    private static final String opening = "<p>";
    private static final String closing = "</p>";

    public ParagraphTag() {
        super(opening, closing);
    }
}
