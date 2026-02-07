package ac.testingplace.configs;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.aeonbits.owner.ConfigCache;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class ConfigManager {
    public static Configuration getConfig() {
        ConfigCache.clear();
        return ConfigCache.getOrCreate(Configuration.class);
    }
}