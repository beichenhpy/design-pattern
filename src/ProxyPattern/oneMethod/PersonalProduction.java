package ProxyPattern.oneMethod;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 个人卖商品
 * @since 2021/2/5 9:02
 */
public class PersonalProduction implements Production{
    /**
     * 售价
     */
    private final Integer price;

    public PersonalProduction(Integer price){
        this.price = price;
    }
    @Override
    public void sell() {
        System.out.println("卖"+price+"元");
    }
}
