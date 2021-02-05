package SingletonPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 饿汉单例
 * @since 2021/2/5 14:24
 */
public class HungrySingleObject {
    private static final HungrySingleObject INSTANCE = new HungrySingleObject();
    /**
     * 防止外部使用new初始化
     */
    private HungrySingleObject(){
    }
    public static HungrySingleObject getInstance(){
        return INSTANCE;
    }

    public void print(){
        System.out.println("我是饿汉模式生成的单例对象");
    }
}
