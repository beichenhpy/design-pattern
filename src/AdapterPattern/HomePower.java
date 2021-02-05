package AdapterPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 200V实现类
 * @since 2021/2/5 13:44
 */
public class HomePower implements V200Power{
    @Override
    public Integer getPower() {
        return 200;
    }

    @Override
    public String getName() {
        return "家用电源";
    }
}
