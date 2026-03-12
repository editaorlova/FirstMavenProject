import org.apache.commons.lang3.StringUtils;
import school.redrover.lecture12.Temperature;

public class Main {
    public static void main(String[] args) {
            Temperature zero = new Temperature(0,"C");
            System.out.println(zero);
        System.out.println(zero.degrees());
        System.out.println(zero.scale());
        System.out.println(zero.equals(new Temperature(0, "C")));
        System.out.println(zero.equals(zero == new Temperature(0, "C")));
        System.out.println(zero.issTooCold());

        System.out.println(StringUtils.abbreviate("This is our lecture", 8));
    }
}
