package ProxyPattern.dynamicProxy;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/19 9:38
 */
public class Test {
    public static void main(String[] args) {
        Service service = (Service) JdkProxy.wrap(new ServiceImpl());
        service.test();
    }
}
