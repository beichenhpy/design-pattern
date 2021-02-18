package ChainOfResponsibilityPattern.StepChain;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 进行用户名判断
 * @since 2021/2/18 16:46
 */
public class HandlerOne extends Handler{
    @Override
    protected boolean canHandle(User user) {
        System.out.println("执行用户名判断");
        return "foo".equals(user.getName());
    }
}
