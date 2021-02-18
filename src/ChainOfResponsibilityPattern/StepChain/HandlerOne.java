package ChainOfResponsibilityPattern.StepChain;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 进行用户名验证
 * @since 2021/2/18 16:46
 */
public class HandlerOne extends Handler{
    protected boolean canHandle(User user) {
        System.out.println("执行用户名验证");
        return "foo".equals(user.getName());
    }

    @Override
    protected void doHandler(User user) {
        if (canHandle(user)){
            System.out.println("验证成功执行");
            doNextHandler(user);
        }else {
            System.out.println("验证失败");
        }
    }
}
