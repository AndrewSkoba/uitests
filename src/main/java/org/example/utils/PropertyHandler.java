package org.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandler {

    private Properties properties;

    public void load(String resourceName) {
        properties = new Properties();

        String rootPath = Thread.currentThread().getContextClassLoader().getResource(resourceName).getPath();
        System.out.println("resourceName: " + resourceName + "; Property path: " + rootPath);
        try {
            properties.load(new FileInputStream(rootPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getProperty(String key) {
        return (String) properties.get(key);
    }
}
