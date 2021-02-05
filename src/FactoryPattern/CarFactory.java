package FactoryPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/5 14:10
 */
public class CarFactory {
    public static Car getCarRun(CarType carType){
        switch (carType){
            case BWM:
                return new Bmw();
            case BENZ:
                return new Benz();
            case MAZDA:
                return new Mazda();
            default:
                return new TrashCar();
        }
    }
}
