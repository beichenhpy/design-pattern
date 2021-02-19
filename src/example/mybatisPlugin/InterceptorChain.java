package example.mybatisPlugin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 拦截器链，用于生成所有动态代理类
 * @since 2021/2/19 10:07
 */
public class InterceptorChain {

    private final List<Interceptor> interceptorList = new ArrayList<>();

    /**
     * 添加拦截器
     * @param interceptor 拦截器
     */
    public void addInterceptor(Interceptor interceptor){
        interceptorList.add(interceptor);
    }

    public Object pluginAll(Object target){
        //遍历所有拦截器->不断修改生成的动态代理对象
        for (Interceptor interceptor : interceptorList) {
            target = interceptor.plugin(target);
        }
        return target;
    }

    /**
     * 返回一个不可修改集合，只能通过addInterceptor方法添加
     * 这样控制权就在自己手里
     */
    public List<Interceptor> getInterceptorList() {
        return Collections.unmodifiableList(interceptorList);
    }
}
