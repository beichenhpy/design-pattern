package ProxyPattern.manyMethods;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 代理方法
 * @since 2021/2/5 10:57
 */
public class ProxyProduction extends AbstractProduction{

    private final Integer price;

    public ProxyProduction(Integer price){
        this.price = price;
    }

    @Override
    public void sell() {
        System.out.println("代理包装了商品");
        Production production = new RealProduction(price);
        production.sell();
    }
}
