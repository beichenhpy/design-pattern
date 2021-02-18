package ChainOfResponsibilityPattern.StepChain;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/18 16:39
 */
public class Test {
    public static void main(String[] args) {
        Handler handler = new HandlerOne();
        Handler handler1 = new HandlerTwo();
        handler.setNextHandler(handler1);
        handler.handle(new User("fo","foo12"));
    }
}
