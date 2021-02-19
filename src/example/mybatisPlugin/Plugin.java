package example.mybatisPlugin;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO jdk动态代理 为了模板不侵入 选择intercept来处理逻辑
 * @since 2021/2/19 9:45
 */
public class Plugin implements InvocationHandler {

    private final Object target;
    private final Interceptor interceptor;

    public Plugin(Object target,Interceptor interceptor){
        this.target = target;
        this.interceptor = interceptor;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //将代理类转换为包装代理类
        Invocation invocation = new Invocation(target,method,args);
        //执行拦截器的方法，其中使用了invocation.process == method.invoke 并且还在前后都可以添加处理方法
        return interceptor.intercept(invocation);
    }

    /**
     * 方便获取到动态代理后的对象
     * @param target 传入准备被代理对象
     * @return 返回代理后的对象
     */
    public static Object wrap(Object target,Interceptor interceptor){
        //这里由于需要引入拦截器，因此要在构造方法添加
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),new Plugin(target,interceptor));
    }
}
