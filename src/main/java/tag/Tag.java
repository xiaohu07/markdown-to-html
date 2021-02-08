package tag;

public abstract class Tag {
    private String openingTag;
    private String closingTag;

    public Tag(String openingTag, String closingTag) {
        this.openingTag = openingTag;
        this.closingTag = closingTag;
    }

    public StringBuilder getStringWithTag(String input) {
        return new StringBuilder(openingTag + input + closingTag);
    }

    public String getOpeningTag() {
        return openingTag;
    }

    public Tag setOpeningTag(String openingTag) {
        this.openingTag = openingTag;
        return this;
    }

    public String getClosingTag() {
        return closingTag;
    }

    public Tag setClosingTag(String closingTag) {
        this.closingTag = closingTag;
        return this;
    }
}
