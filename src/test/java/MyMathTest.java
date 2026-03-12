import org.testng.Assert;
import org.testng.annotations.Test;
import school.redrover.MyMath;

public class MyMathTest {

    @Test
    public void testSum() {
        int result = MyMath.sum(2,2);

        Assert.assertEquals(result, 4);
    }

    @Test
    public void testSub() {
        int result = MyMath.sub(10,5);

        Assert.assertEquals(result,5);
    }

    @Test
    public void testDevide() {
        int result = MyMath.divide(15,3);

        Assert.assertEquals(result, 5);
    }

    @Test
    public void testMultyplay() {
        int result =  MyMath.multyplay(10,2);

        Assert.assertEquals(result, 20);
    }
}
