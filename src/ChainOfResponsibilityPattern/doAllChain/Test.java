package ChainOfResponsibilityPattern.doAllChain;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/18 14:07
 */
public class Test {
    public static void main(String[] args) {
        //这里和添加handler的顺序时有关的
        HandlerChain handlerChain = new HandlerChain()
                .addHandler(new HandlerOne())
                .addHandler(new HandlerTwo());
        handlerChain.doAllHandlers("——————执行");
    }
}
