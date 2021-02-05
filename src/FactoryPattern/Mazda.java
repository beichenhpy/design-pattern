package FactoryPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/5 14:09
 */
public class Mazda implements Car{
    @Override
    public void run() {
        System.out.println("你开马自达，怪不得你塞车");
    }
}
