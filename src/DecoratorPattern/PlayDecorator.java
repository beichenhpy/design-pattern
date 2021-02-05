package DecoratorPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 基础装饰器 用于简化多次实现接口的方法--（比如只想要增强play方法，那么只需要在抽象类中实现好接口的其他方法，子类就不用实现了）
 * @since 2021/2/5 11:24
 */
public abstract class PlayDecorator implements MediaPlayer{
    private final MediaPlayer mediaPlayer;
    public PlayDecorator(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play(){
        mediaPlayer.play();
    }

    @Override
    public void delete(){
        mediaPlayer.delete();
    }
}
