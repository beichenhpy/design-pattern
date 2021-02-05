package AdapterPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/5 13:46
 */
public class MainTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.batteryCharge(new V200ToV5Adapter(new HomePower()));
    }
}
