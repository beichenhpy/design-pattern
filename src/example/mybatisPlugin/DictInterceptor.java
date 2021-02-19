package example.mybatisPlugin;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 模拟添加数据字典拦截器
 * @since 2021/2/19 10:14
 */
public class DictInterceptor implements Interceptor{
    @Override
    public Object intercept(Invocation invocation) throws Exception {
        System.out.println("查询字典");
        Object process = invocation.process();
        System.out.println("设置字典字段");
        return process;
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target,this);
    }
}
