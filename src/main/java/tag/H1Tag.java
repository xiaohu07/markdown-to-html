package tag;

public class H1Tag extends Tag{
    private static final String opening = "<h1>";
    private static final String closing = "</h1>";

    public H1Tag() {
        super(opening, closing);
    }
}
