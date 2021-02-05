package ProxyPattern.oneMethod;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/5 9:11
 */
public class ProxyMain {
    public static void main(String[] args) {
        //未代理
        Production personalProduction = new PersonalProduction(10);
        personalProduction.sell();
        System.out.println();
        //代理过的
        Production businessProduction = new BusinessProduction(15);
        businessProduction.sell();
    }
}
