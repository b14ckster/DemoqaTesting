package context;

import java.util.HashMap;
import java.util.Map;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TestContext {

    public static final String DRIVER = "driver";
    private static TestContext instance;
    private Map<String, Object> context = new HashMap<>();

    public static TestContext getInstance() {
        if (instance == null) {
            instance = new TestContext();
        }
        return instance;
    }

    public void setTestObject(String key, Object object) {
        context.put(key, object);
    }

    public <T> T getTestObject(String key) {
        return (T) context.get(key);
    }

    public void cleanContext() {
        context.clear();
        instance = null;
    }
}
