package act.conf;

import java.util.List;
import java.util.Map;

/**
 * Defines ConfigKey properties
 */
public interface ConfigKey {

    String KEY_COMMON_CONF_TAG = "commonConfTag";

    String key();

    Object defVal();

    <T> T val(Map<String, ?> configuration);

    <T> List<T> implList(String key, Map<String, ?> configuration, Class<T> c);
}
