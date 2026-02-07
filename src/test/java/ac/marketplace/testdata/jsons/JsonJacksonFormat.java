package ac.testingplace.testdata.jsons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class JsonJacksonFormat {
    // @JsonProperty
    // @JsonCreator

    @JsonIgnoreProperties(ignoreUnknown = true)
    public String getJsonData(String DataString) throws FileNotFoundException {
       /* ObjectMapper mapper = new ObjectMapper();
        try {
            File Data = new File("src/main/resources/config/RequestDataProvider.json");
            System.out.println(Data);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            AddRequest Request = mapper.readValue(Data, AddRequest.class);
            String Fa = Request.getRequestTitle();
            System.out.println(Fa);
        } catch (Exception e) {
            e.printStackTrace(); */

            File f = new File("src/test/java/ac/testingplace/testdata/jsons/RequestDataProvider.json");
            FileReader fr;
            fr = new FileReader(f);
            JSONTokener jt = new JSONTokener(fr);
            org.json.JSONObject data;
            {
                try {
                    data = new JSONObject(jt);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
             DataString = data.toString();
           System.out.println(DataString);
            return DataString;
        }
      //  return DataString;
    }
//}