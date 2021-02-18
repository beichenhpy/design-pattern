package ChainOfResponsibilityPattern.StepChain;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO
 * @since 2021/2/18 16:52
 */
public class User {
    private String name;
    private String password;

    public User(String name,String password){
        this.name = name;
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
