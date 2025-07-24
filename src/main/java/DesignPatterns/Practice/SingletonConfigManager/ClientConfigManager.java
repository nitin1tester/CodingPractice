package DesignPatterns.Practice.SingletonConfigManager;

public class ClientConfigManager {

    public static void main(String[] args) {
        ConfigManager cm1 = ConfigManager.getInstance();
        cm1.sampleMethord("test1");
        ConfigManager cm2 = ConfigManager.getInstance();
        cm2.sampleMethord("Test2");
        System.out.println(cm1==cm2);
    }

}
