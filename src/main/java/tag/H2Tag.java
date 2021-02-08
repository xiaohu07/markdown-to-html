package tag;

public class H2Tag extends Tag{
    private static final String opening = "<h2>";
    private static final String closing = "</h2>";

    public H2Tag() {
        super(opening, closing);
    }
}
