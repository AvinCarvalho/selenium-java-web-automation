package ac.testingplace.configs;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;

@LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/main/resources/config/config.properties"})
public interface Configuration extends Config  {
    @Key("new_report")
    String newReport();
    @Key("target")
    String target();
    @Key("browser")
    String browser();
    @Key("email_id")
    String EmailId();
    @Key("password_field")
    String PasswordField();

    @Key("headless")
    Boolean headless();

    @Key("base_url")
    String baseUrl();

    @Key("timeout")
    int timeout();

    @Key("grid.url")
    String gridUrl();

    @Key("grid.port")
    String gridPort();

    @Key("faker.locale")
    String faker();
}