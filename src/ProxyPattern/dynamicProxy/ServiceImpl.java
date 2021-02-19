package ProxyPattern.dynamicProxy;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/19 9:40
 */
public class ServiceImpl implements Service{
    @Override
    public void test() {
        System.out.println("被代理方法");
    }
}
