package com.s3zden.HttpServer.config;

public class ConfigurationManager {
    public static ConfigurationManager myConfigurationManager;

    private ConfigurationManager() {

    }
    public static ConfigurationManager getInstance(){
        if (myConfigurationManager == null){
            myConfigurationManager = new ConfigurationManager();}
        return myConfigurationManager;
    }
}
