package ac.testingplace.pages;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class FilterDataReader extends AdvancedFilter {
    private static final Properties properties = new Properties();
        static {
            try {
                //System.out.println("Working Directory = " + System.getProperty("user.dir"));
                FileReader fileReader = new FileReader(STR."\{System.getProperty("user.dir")}\\src\\test\\java\\ac\\testingplace\\helperclass\\FilterData.properties");
                properties.load(fileReader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static String getTestData(String key) {
            return properties.getProperty(key);
        }
    }

