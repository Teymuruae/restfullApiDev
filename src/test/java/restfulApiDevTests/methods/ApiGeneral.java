package restfulApiDevTests.methods;

import restfulApiDevTests.configs.ApiConfig;
import org.aeonbits.owner.ConfigFactory;

public class ApiGeneral {

    protected static ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
    protected final String basePath = apiConfig.getBasePath();
}