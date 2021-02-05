package SingletonPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/5 14:32
 */
public class MainTest {
    public static void main(String[] args) {
        HungrySingleObject hungrySingleObject = HungrySingleObject.getInstance();
        hungrySingleObject.print();
        LazySingleObject lazySingleObject = LazySingleObject.getInstanceUnsafe();
        lazySingleObject.print();
    }
}
