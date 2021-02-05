package ProxyPattern.oneMethod;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 商人从个人手中买来，相当于代理了个人
 * @since 2021/2/5 9:05
 */
public class BusinessProduction implements Production{
    private final Production production;

    public BusinessProduction(Integer price){
        production = new PersonalProduction(price);
    }
    @Override
    public void sell() {
        //包装
        System.out.println("商人包装了商品");
        production.sell();
    }
}
