package ChainOfResponsibilityPattern.StepChain;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 这种需要指定下一个责任到谁 需要设置下一个Handler 所以只能使用抽象类或者使用接口每次在实现类中引入Handler接口
 * 这种没有HandlerChain类，直接在抽象子类或者接口实现类中进行下一步骤执行
 * @since 2021/2/18 14:45
 */
public abstract class Handler {
    /**
     * 下一个Handler是谁 需要调用者传入
     */
    protected Handler nextHandler;

    /**
     * 下一个Handler是谁 需要调用者传入
     *
     * @param nextHandler 下一步责任执行者
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }


    /**
     * 处理函数
     *
     * @param user 用户
     */
    public void doNextHandler(User user) {
        //处理下一级责任
        if (nextHandler != null) {
            nextHandler.doHandler(user);
        }
    }


    /**
     * 用户自定义执行handler
     * @param user user
     */
    abstract protected void doHandler(User user);
}
