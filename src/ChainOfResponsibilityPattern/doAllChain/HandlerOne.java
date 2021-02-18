package ChainOfResponsibilityPattern.doAllChain;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/18 14:34
 */
public class HandlerOne implements Handler{
    @Override
    public void doHandler(String msg) {
        //可以添加判断是否执行handler
        System.out.println("do something one"+msg);
    }
}
