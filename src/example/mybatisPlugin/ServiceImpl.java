package example.mybatisPlugin;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 被代理实现类
 * @since 2021/2/19 9:43
 */
public class ServiceImpl implements Service{
    @Override
    public void test() {
        System.out.println("被代理类");
    }
}
