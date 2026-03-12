import org.testng.Assert;
import org.testng.annotations.Test;
import school.redrover.MyString;

public class MyStringTest {

    @Test
    public void testMyString() {
        String abbriative = MyString.abbriative("Привет всем кто живет на луне!",10);

        Assert.assertEquals(abbriative, "Привет ...");
    }
}
