package StaticMemberPractice;

public class Configuration {
    public static String configValue;
    static {
        configValue = "This is config value";
    }
    public static void main(String[] args) {
        System.out.println("Config value is :" + configValue );
    }
}
