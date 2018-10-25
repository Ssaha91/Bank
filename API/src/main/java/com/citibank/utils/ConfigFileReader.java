package com.citibank.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;

    private String getPropertyFilePath() {
        String filePath = null;
        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            filePath = System.getProperty("user.dir") + "/configuration.properties";
        } else if (System.getProperty("os.name").toLowerCase().contains("win")) {
            filePath = System.getProperty("user.dir") + "\\configuration.properties";
        }
        return filePath;
    }

    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(getPropertyFilePath()));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("configuration.properties not found.");
        }
    }

    public String getEnvironment() {
        String driverPath = properties.getProperty("environment");
        if (driverPath!= null) return driverPath;
        else throw new RuntimeException("UATEnvironment not specified in the configuration.properties file.");
    }

}
