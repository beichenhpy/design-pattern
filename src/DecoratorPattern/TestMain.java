package DecoratorPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/5 11:35
 */
public class TestMain {
    public static void main(String[] args) {
        //定义初始化方法
        MediaPlayer defaultPlay = new DefaultPlay();
        //相当于告知增强哪个对象的哪个方法
        MediaPlayer addPlayer = new AddDecorator(defaultPlay);
        //未装饰增强
        defaultPlay.play();
        System.out.println("--------------增强后--------------");
        //装饰增强后
        addPlayer.play();
    }
}
