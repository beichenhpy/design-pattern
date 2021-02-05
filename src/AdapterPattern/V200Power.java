package AdapterPattern;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 200v电源
 * @since 2021/2/5 13:33
 */
public interface V200Power {
    /**
     * 获取电压
     * @return 电压值
     */
    Integer getPower();

    /**
     * 获取电源名
     * @return 电源名
     */
    String getName();
}
