package DecoratorPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 增强原播放方法 (此方法还可以被增强)
 * @since 2021/2/5 11:26
 */
public class AddDecorator extends PlayDecorator{

    public AddDecorator(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public void play(){
        System.out.println("加大音量");
        super.play();
        System.out.println("恢复音量");
    }
}
