package ChainOfResponsibilityPattern.StepChain;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 进行密码判断
 * @since 2021/2/18 16:46
 */
public class HandlerTwo extends Handler{
    @Override
    protected boolean canHandle(User user) {
        System.out.println("执行密码判断");
        return "foo123".equals(user.getPassword());
    }
}
