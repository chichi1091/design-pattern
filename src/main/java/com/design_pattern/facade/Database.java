package com.design_pattern.facade;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Database {
    private Database() {
    }

    @SneakyThrows
    public static Properties getProperties(String dbName) {
        String path = new File(".").getAbsoluteFile().getParent();
        String fileName = path + "/src/main/java/com/design_pattern/facade/" + dbName + ".txt";
        Properties prop = new Properties();
        prop.load(new FileReader(fileName));
        return prop;
    }
}
