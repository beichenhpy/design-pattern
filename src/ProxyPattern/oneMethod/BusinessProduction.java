package ProxyPattern.oneMethod;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 商人从个人手中买来，相当于代理了个人
 * @since 2021/2/5 9:05
 */
public class BusinessProduction implements Production{
    /**
     * 商人定义的售价
     */
    private final Integer price;

    public BusinessProduction(Integer price){
        this.price = price;
    }
    @Override
    public void sell() {
        //包装
        System.out.println("商人包装了商品");
        //调用真正的sell
        Production production = new PersonalProduction(price);
        production.sell();
    }
}
