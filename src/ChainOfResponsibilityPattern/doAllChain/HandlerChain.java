package ChainOfResponsibilityPattern.doAllChain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 按照客户端要求放入需要的处理（调用方式1）看起来是只要放入List就全部执行
 * @since 2021/2/18 14:10
 */
public class HandlerChain {
    /**
     * 定义责任链顺序数组
     */
    private final List<Handler> handlerList = new ArrayList<>();

    /**
     * 添加责任处理
     * @param handler 处理
     * @return 返回当前责任链
     */
    public HandlerChain addHandler(Handler handler){
        handlerList.add(handler);
        return this;
    }

    /**
     * 执行责任链
     * @param msg msg
     */
    public void doAllHandlers(String msg){
        for (Handler handler : handlerList) {
            handler.doHandler(msg);
        }
    }
}
