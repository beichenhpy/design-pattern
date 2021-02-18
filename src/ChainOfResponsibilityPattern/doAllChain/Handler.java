package ChainOfResponsibilityPattern.doAllChain;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 处理接口 这里需要传入的参数/对象都为同一个 比如对同一个对象进行修改，添加等操作
 * @since 2021/2/18 14:04
 */
public interface Handler {
    /**
     * 处理方法
     * @param msg 处理信息
     */
    void doHandler(String msg);
}
