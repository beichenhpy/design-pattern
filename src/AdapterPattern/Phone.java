package AdapterPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 主实体类
 * @since 2021/2/5 13:36
 */
public class Phone {
    public void batteryCharge(V5Power v5Power){
        System.out.println("正在使用"+v5Power.getName()+"充电"+",电压为"+v5Power.getPower()+"V");
    }
}
