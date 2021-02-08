import static org.junit.Assert.*;

import org.junit.*;

public class UnitTest {

    private Controller controller;

    @Before
    public void setUp() {
        controller = new Controller();
    }

    @Test
    public void givenMdH1_thenExpectHtmlH1() {
        assertEquals(TestData.HTML_H1, controller.mdToHtml(TestData.MD_H1));
    }

    @Test
    public void givenMdH2_thenExpectHtmlH2() {
        assertEquals(TestData.HTML_H2, controller.mdToHtml(TestData.MD_H2));
    }

    @Test
    public void givenMdH3_thenExpectHtmlH3() {
        assertEquals(TestData.HTML_H3, controller.mdToHtml(TestData.MD_H3));
    }

    @Test
    public void givenMdH4_thenExpectHtmlH4() {
        assertEquals(TestData.HTML_H4, controller.mdToHtml(TestData.MD_H4));
    }

    @Test
    public void givenMdH5_thenExpectHtmlH5() {
        assertEquals(TestData.HTML_H5, controller.mdToHtml(TestData.MD_H5));
    }

    @Test
    public void givenMdH6_thenExpectHtmlH6() {
        assertEquals(TestData.HTML_H6, controller.mdToHtml(TestData.MD_H6));
    }

    @Test
    public void givenMdText1_thenExpectHtmlP() {
        assertEquals(TestData.HTML_TEXT_1, controller.mdToHtml(TestData.TEXT_1));
    }

    @Test
    public void givenInvalidMdH1_thenExpectHtmlP() {
        assertEquals(TestData.HTML_H1_INVALID, controller.mdToHtml(TestData.MD_H1_INVALID));
    }

    @Test
    public void givenMdH1AndText_thenExpectHtmlH1AndP() {
        assertEquals(TestData.getH1AndPHtml(), controller.mdToHtml(TestData.getH1AndTextMd()));
    }

    @Test
    public void givenMultipleLinksInMdH1_thenExpectHtmlH1HasAnchors() {
        assertEquals(TestData.getMultiLinksInHtmlH1(), controller.mdToHtml(TestData.getMultiLinksInH1Md()));
    }

    @Test
    public void givenMultipleTextLinesInMd_thenExpectHtmlHasOnlyOneP() {
        assertEquals(TestData.getMultipleTextLinesInPHtml(), controller.mdToHtml(TestData.getMultipleTextLinesInMd()));
    }

    @Test
    public void givenMultipleTextAndBlankLinesInMd_thenExpectHtmlHasMultiplePsAndEmptyLines() {
        assertEquals(TestData.getMultiplePsAndEmptyLinesInHtml(), controller.mdToHtml(TestData.getMultipleTextsAndBlankLinesInMd()));
    }

    @Test
    public void givenNoneEmptyLineWithLinkInMd_thenExpectHtmlHasPAndAnchor() {
        assertEquals(TestData.getPAndAnchorInHtml(), controller.mdToHtml(TestData.getNonEmptyLineWithLinkInMd()));
    }
}
