package SingletonPattern;

/**
 * @author beichenhpy
 * @version 0.0.1
 * @apiNote DoubleCheckSingleObject description：双检锁
 * @since 2021/5/29 5:11 下午
 */
public class DoubleCheckSingleObject {
    private volatile static DoubleCheckSingleObject instance;

    private DoubleCheckSingleObject() {
    }

    public static DoubleCheckSingleObject getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleObject.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleObject();
                }
            }
        }
        return instance;
    }

}

