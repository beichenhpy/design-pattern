package ProxyPattern.manyMethods;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 抽象类实现不需要代理的方法
 * @since 2021/2/5 10:55
 */
public abstract class AbstractProduction implements Production{
    /**
     * 实现接口的方法，这样子类不用实现此接口
     */
    @Override
    public void make(){
        //do make
    }

    /**
     * 抽象类的普通方法-可以在子类中用 this调用
     */
    public void print(){
        System.out.println("print");
    }
//    /**
//     * 此抽象方法必须由子类实现
//     */
//    public abstract void printAbstract();
}
