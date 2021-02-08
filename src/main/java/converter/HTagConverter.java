package converter;

import java.util.*;
import tag.*;

public class HTagConverter extends TagConverter{
    private static final Map<String, Tag> H_TAG_MAP = new HashMap<>();
    private final AnchorTagConverter anchorTagConverter = new AnchorTagConverter();


    public HTagConverter() {
        updateHTagMap();
    }

    private void updateHTagMap() {
        H_TAG_MAP.put("#", new H1Tag());
        H_TAG_MAP.put("##", new H2Tag());
        H_TAG_MAP.put("###", new H3Tag());
        H_TAG_MAP.put("####", new H4Tag());
        H_TAG_MAP.put("#####", new H5Tag());
        H_TAG_MAP.put("######", new H6Tag());
    }

    @Override
    public String convertToHtml(String input) {
        int spaceIndex = input.indexOf(' ');
        String sign = input.substring(0, spaceIndex);
        String remain = input.substring(spaceIndex + 1);
        remain = anchorTagConverter.convertToHtml(remain);
        return H_TAG_MAP.get(sign).getStringWithTag(remain).append(NEW_LINE).toString();
    }

    @Override
    public boolean isValidTag(String input) {
        if (input.indexOf(' ') > -1) {
            return H_TAG_MAP.containsKey(input.substring(0, input.indexOf(' ')));
        }
        return false;
    }
}
