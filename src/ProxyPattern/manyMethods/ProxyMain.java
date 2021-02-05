package ProxyPattern.manyMethods;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/5 10:58
 */
public class ProxyMain {
    public static void main(String[] args) {
        //未代理
        Production realProduction = new RealProduction(10);
        realProduction.sell();
        System.out.println();
        //代理
        Production proxyProduction = new ProxyProduction(15);
        proxyProduction.sell();
    }
}
