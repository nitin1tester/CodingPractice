package DesignPatterns.Practice.SingletonConfigManager;

public class ConfigManager {

    private static ConfigManager instance;

    private ConfigManager(){
        System.out.println("This is ConfigManager constructor");
    }

    public static ConfigManager getInstance(){
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public void sampleMethord(String input){
        System.out.println("This is sampleMethord "+ input);
    }
}
