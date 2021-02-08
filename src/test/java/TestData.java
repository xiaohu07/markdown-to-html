import converter.TagConverter;

public class TestData {
    private static final String H1 = "This is an h1.";
    private static final String H2 = "This is an h2.";
    private static final String H3 = "This is an h3.";
    private static final String H4 = "This is an h4.";
    private static final String H5 = "This is an h5.";
    private static final String H6 = "This is an h6.";
    public static final String TEXT_1 = "Just a random text";
    public static final String TEXT_2 = "Another random text";
    public static final String INVALID_TEXT = "It should be invalid";
    public static final String EMPTY_SPACE = "   ";

    public static final String MD_H1 = "# " + H1;
    public static final String MD_H2 = "## " + H2;
    public static final String MD_H3 = "### " + H3;
    public static final String MD_H4 = "#### " + H4;
    public static final String MD_H5 = "##### " + H5;
    public static final String MD_H6 = "###### " + H6;
    public static final String MD_H1_INVALID = "#" + INVALID_TEXT;
    public static final String MD_LINK_1 = "[Google](http://google.com)";
    public static final String MD_LINK_2 = "[invalid link](nothing@com)";


    public static final String MD_EMPTY_LINE = TagConverter.NEW_LINE;
    public static final String MD_EMPTY_LINE_2 = EMPTY_SPACE + TagConverter.NEW_LINE;


    public static final String HTML_H1 = "<h1>" + H1 + "</h1>";
    public static final String HTML_H2 = "<h2>" + H2 + "</h2>";
    public static final String HTML_H3 = "<h3>" + H3 + "</h3>";
    public static final String HTML_H4 = "<h4>" + H4 + "</h4>";
    public static final String HTML_H5 = "<h5>" + H5 + "</h5>";
    public static final String HTML_H6 = "<h6>" + H6 + "</h6>";
    public static final String HTML_LINK_1 = "<a href=\"http://google.com\">Google</a>";
    public static final String HTML_LINK_2 = "<a href=\"nothing@com\">invalid link</a>";
    public static final String HTML_TEXT_1 = "<p>Just a random text</p>";
    public static final String HTML_TEXT_2 = "<p>Another random text</p>";
    public static final String HTML_H1_INVALID = "<p>#It should be invalid</p>";


    public static String getMultiLinksInH1Md() {
        return MD_H1 + MD_LINK_1 + TEXT_1 + MD_LINK_2;
    }

    public static String getMultiLinksInHtmlH1() {
        return "<h1>" + H1 + HTML_LINK_1 + TEXT_1 + HTML_LINK_2 + "</h1>";
    }

    public static String getH1AndTextMd() {
        return MD_H1 + MD_EMPTY_LINE + TEXT_1;
    }

    public static String getH1AndPHtml() {
        return HTML_H1 + TagConverter.NEW_LINE + HTML_TEXT_1;
    }

    public static String getMultipleTextLinesInMd() {
        return TEXT_1 + MD_EMPTY_LINE + TEXT_2;
    }

    public static String getMultipleTextLinesInPHtml() {
        return "<p>" + TEXT_1 + TagConverter.NEW_LINE + TEXT_2 + "</p>";
    }


    public static String getMultipleTextsAndBlankLinesInMd() {
        return TEXT_1 + MD_EMPTY_LINE + MD_EMPTY_LINE_2 + TEXT_2;
    }

    public static String getMultiplePsAndEmptyLinesInHtml() {
        return HTML_TEXT_1 + TagConverter.NEW_LINE + TagConverter.NEW_LINE + HTML_TEXT_2;
    }

    public static String getNonEmptyLineWithLinkInMd() {
        return MD_LINK_1 + MD_EMPTY_LINE_2;
    }

    public static String getPAndAnchorInHtml() {
        return "<p>" + HTML_LINK_1 + EMPTY_SPACE + "</p>";
    }

}
