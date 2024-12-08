package context;

import java.util.HashMap;
import java.util.Map;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Class for saving data between steps in cucumber scenario (include driver).
 * It's singleton. Using constructor by lombok
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TestContext {

    /**
     * Key for object driver
     */
    public static final String DRIVER = "driver";

    /**
     * Global variable for access singleton
     */
    private static TestContext instance;

    /**
     * Map for delivering our context between steps
     */
    private Map<String, Object> context = new HashMap<>();

    /**
     * Method for getting your instance.
     * Implemented lazy initialization.
     */
    public static TestContext getInstance() {
        if (instance == null) {
            instance = new TestContext();
        }
        return instance;
    }

    /**
     * Put your data to save for future using. Any type inherited from Object class
     */
    public TestContext setTestObject(String key, Object object) {
        context.put(key, object);
        return this;
    }

    /**
     * Return your data. Any type inherited from Object class
     */
    public <T> T getTestObject(String key) {
        return (T) context.get(key);
    }

    /**
     * Using only after finish tests
     */
    public void cleanContext() {
        context.clear();
        instance = null;
    }
}
