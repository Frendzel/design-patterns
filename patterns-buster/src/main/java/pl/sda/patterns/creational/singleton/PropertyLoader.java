package pl.sda.patterns.creational.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Properties;

//TODO read connection.properties from the file
class PropertyLoader {

    private Properties properties = new Properties();

    public PropertyLoader() {
        this.load();
    }

    private void load() {
        try (InputStream stream = this.getClass().getClassLoader().getResourceAsStream("connection.properties")) {
            properties.load(stream);
            System.out.println("Successfully loaded file: connection.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //TODO look out, Accenture is asking about this 💩
    public void reflection() {
        Field[] declaredFields = this.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            System.out.println(field);
        }
    }

    public String getDb() {
        return properties.getProperty("db");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }

    public String getUser() {
        return properties.getProperty("user");
    }

    public String getAddress() {
        return properties.getProperty("address");
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
