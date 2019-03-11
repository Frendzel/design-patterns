package pl.sda.patterns.creational.singleton;

import java.io.IOException;

public class ThreadSafeSingleton {
    private static PropertyLoader instance;

    private ThreadSafeSingleton() {
    }

    public synchronized static PropertyLoader getInstance() throws IOException {
        if (instance == null) {
            instance = new PropertyLoader();
        }
        instance.init();
        return instance;
    }
}
