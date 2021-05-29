package SingletonPattern;

/**
 * @author beichenhpy
 * @version 0.0.1
 * @apiNote InnerSingleObject description：inner class implement Single Object
 * @since 2021/5/29 5:15 下午
 */
public class InnerSingleObject {
    //inner class lazy load
    private static class SingletonHolder{
        private static final InnerSingleObject INSTANCE = new InnerSingleObject();
    }

    private InnerSingleObject(){

    }

    public static InnerSingleObject getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
