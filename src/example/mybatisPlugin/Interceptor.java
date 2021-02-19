package example.mybatisPlugin;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 拦截器接口 用于执行动态代理方法，方便再前后添加逻辑不影响动态代理类 还可以进行对代理对象进行动态生成
 * @since 2021/2/19 9:47
 */
public interface Interceptor {
    /**
     * 拦截处理动态代理的方法
     * @param invocation 代理包裹对象
     * @return 返回代理后的对象
     * @throws Exception 异常
     */
    Object intercept(Invocation invocation) throws Exception;

    /**
     * 因为wrap需要参数很多，所以添加个plugin方法进行包装代理类
     * @param target 目标代理类
     * @return 返回动态代理后的
     */
    Object plugin(Object target);
}
