package ac.testingplace.testdata.jsons;

import ac.testingplace.pages.RequestPage;
import ac.testingplace.testdata.StringRelatedClass;
import com.fasterxml.jackson.databind.JsonNode;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.FileReader;
import org.testng.annotations.Test;

public class JsonFileReader extends JsonJacksonFormat {
   /* public void readJsonFile() {
        try {
            String a=new StringRelatedClass().CreateRequest("reqdata");
            System.out.println(a);
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(a);

            String name= jsonNode.get("Shift").asText();
            System.out.println(name);
        } catch (Exception e) {
            e.printStackTrace();*/


       public void readJsonFile() {
           try {
               String jsonData = getJsonData("RequestDataProvider.json");

               ObjectMapper objectMapper = new ObjectMapper();
               AddRequest Request = objectMapper.readValue(jsonData, AddRequest.class);

               RequestPage requestpage = new RequestPage();
               requestpage.EnterData(
                       Request.getRequestTitle(),
                       Request.getRole(),
                       Request.getSpecialty(),
                       Request.getRequestType(),
                       Request.getRequestDescription(),
                       Request.getFacility(),
                       Request.getDepartment()
               );

               requestpage.Data(
                       Integer.parseInt(Request.getStartDate().replace("/", "")),
                       Integer.parseInt(Request.getNoOfPositions()),
                       Request.getHiringManager(),
                       Float.parseFloat(Request.getBillRate()),
                       Request.getShift(),
                       Integer.parseInt(Request.getShiftsPerWeek()),
                       Integer.parseInt(Request.getHoursPerShift()),
                       Integer.parseInt(Request.getShiftTimings())
               );

               requestpage.Approvers(Request.getTimesheetApprovers());
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
   }


