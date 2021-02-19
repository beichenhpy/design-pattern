package example.mybatisPlugin;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 具体的拦截器 模拟分页
 * @since 2021/2/19 9:48
 */
public class PageInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Exception {
        System.out.println("查询count数");
        Object process = invocation.process();
        System.out.println("重新设置内容");
        return process;
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target,this);
    }
}
