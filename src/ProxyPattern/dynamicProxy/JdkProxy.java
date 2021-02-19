package ProxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 只能代理接口 JDK代理的newProxyInstance需要interfaces接口实现类
 * @since 2021/2/19 9:25
 */
public class JdkProxy implements InvocationHandler {

    private final Object target;

    public JdkProxy(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理了信息");
        return method.invoke(target,args);
    }

    /**
     * 方便获取到动态代理后的对象
     * @param target 传入准备被代理对象
     * @return 返回代理后的对象
     */
    public static Object wrap(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),new JdkProxy(target));
    }
}
