package ChainOfResponsibilityPattern.StepChain;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 进行密码验证
 * @since 2021/2/18 16:46
 */
public class HandlerTwo extends Handler{
    protected boolean canHandle(User user) {
        System.out.println("执行密码验证");
        return "foo123".equals(user.getPassword());
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
