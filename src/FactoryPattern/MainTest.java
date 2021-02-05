package FactoryPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/5 14:12
 */
public class MainTest {
    public static void main(String[] args) {
        Car benz = CarFactory.getCarRun(CarType.BENZ);
        benz.run();
        Car bmw = CarFactory.getCarRun(CarType.BWM);
        bmw.run();
        Car mazda = CarFactory.getCarRun(CarType.MAZDA);
        mazda.run();
    }
}
