package ProxyPattern.manyMethods;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 真正执行方法
 * @since 2021/2/5 10:55
 */
public class RealProduction extends AbstractProduction{
    private final Integer price;
    public RealProduction(Integer price){
        this.price = price;
    }
    @Override
    public void sell() {
        System.out.println("卖了"+price+"钱");
    }
}
