package diplomApi.configs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config.properties"
})
public interface ApiConfig extends Config {

    @Key("baseUrl")
    String getBaseUrl();
}
