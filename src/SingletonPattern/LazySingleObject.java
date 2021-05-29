package SingletonPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 懒汉单例
 * @since 2021/2/5 14:34
 */
public class LazySingleObject {
    private LazySingleObject(){}

    private static LazySingleObject instance;

    /**
     * 线程不安全
     * @return 对象
     */
    public static LazySingleObject getInstanceUnsafe() {
        if (instance == null){
           instance = new LazySingleObject();
        }
        return instance;
    }
    /**
     * 线程安全 但是比较慢
     * @return 对象
     */
    public static synchronized LazySingleObject getInstanceSafe() {
        if (instance == null){
            instance = new LazySingleObject();
        }
        return instance;
    }


    public void print(){
        System.out.println("我是懒汉模式生成的单例对象");
    }
}
