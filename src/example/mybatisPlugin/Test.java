package example.mybatisPlugin;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/19 10:06
 */
public class Test {
    public static void main(String[] args) {
        //单一拦截器
        PageInterceptor pageInterceptor = new PageInterceptor();
        //获取动态代理后的对象
        Service service  = (Service) pageInterceptor.plugin(new ServiceImpl());
        service.test();
        System.out.println("--------------------------------------------------");
        //多个拦截器时，可以使用责任链模式
        DictInterceptor dictInterceptor = new DictInterceptor();
        InterceptorChain chain = new InterceptorChain();
        chain.addInterceptor(pageInterceptor);
        chain.addInterceptor(dictInterceptor);
        Service service2 = (Service)chain.pluginAll(new ServiceImpl());
        service2.test();
    }
}
