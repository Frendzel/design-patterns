package pl.sda.patterns.creational.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class PropertyLoader {

    private Properties properties = new Properties();

    void init() throws IOException {
        InputStream stream = this.getClass().getClassLoader()
                .getResourceAsStream("connection.properties");
        this.properties.load(stream);
        stream.close();
    }


    String getUser() {
        return properties.getProperty("user");
    }

    String getAddress() {
        return properties.getProperty("address");
    }

    String getPassword() {
        return properties.getProperty("password");
    }

    String getDb() {
        return properties.getProperty("db");
    }
}
