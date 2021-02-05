package AdapterPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 转换器-->相当于是为了满足Phone条件而创建的实现类（针对旧方法如果使用了A_interface，一旦业务变动需要使用B_interface 那么就需要新建此适配器，实现A_interface 引入 B_interface）
 * @since 2021/2/5 13:41
 */
public class V200ToV5Adapter implements V5Power{

    private final V200Power v200Power;

    public V200ToV5Adapter(V200Power v200Power){
        this.v200Power = v200Power;
    }
    @Override
    public Integer getPower() {
        System.out.println("经过转换后由"+v200Power.getPower()+"转换为5V");
        return 5;
    }

    @Override
    public String getName() {
        return "匹配"+v200Power.getName()+"的电源适配器";
    }
}
