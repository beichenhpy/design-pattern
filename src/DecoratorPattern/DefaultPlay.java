package DecoratorPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 默认播放方法
 * @since 2021/2/5 11:23
 */
public class DefaultPlay implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("播放中。。。");
    }

    @Override
    public void delete() {
        System.out.println("删除音乐");
    }
}
