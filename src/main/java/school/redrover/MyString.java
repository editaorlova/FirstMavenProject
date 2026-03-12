package school.redrover;

import org.apache.commons.lang3.StringUtils;

public class MyString {

    public static String abbriative(String text, int maxWIdth) {
        return StringUtils.abbreviate(text, maxWIdth);
        }
}
