package example.mybatisPlugin;

import java.lang.reflect.Method;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 动态代理包裹对象
 * @since 2021/2/19 9:50
 */
public class Invocation {

    /**
     * 目标对象
     */
    private Object target;
    /**
     * 执行的方法
     */
    private Method method;
    /**
     * 方法的参数
     */
    private Object[] args;


    public Invocation(Object target, Method method, Object[] args) {
        this.target = target;
        this.method = method;
        this.args = args;
    }
    /**
     * 执行目标对象的方法
     */
    public Object process() throws Exception{
        return method.invoke(target,args);
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }


}
