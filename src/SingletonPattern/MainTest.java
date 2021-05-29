package SingletonPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/5 14:32
 */
public class MainTest {
    public static void main(String[] args) {
        InnerSingleObject instance = InnerSingleObject.getInstance();
        InnerSingleObject instance1 = InnerSingleObject.getInstance();
        System.out.println(instance1);
        System.out.println(instance);
    }
}
