package lib;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class DataGenerator {
    public static String getRandomEmail(){
        String timestamp = new SimpleDateFormat("yyyyMMHHmmss").format(new java.util.Date());
        return "test" + timestamp + "@example.com";
    }
    public static String getRandomEstabName(){
        String timestamp = new SimpleDateFormat("yyyyMMHHmmss").format(new java.util.Date());
        return "Rom, " + timestamp;
    }
    public static Map<String, String> getRegistrationData(){
        Map<String, String> data = new HashMap<>();
        data.put("email", DataGenerator.getRandomEmail());
        data.put("password", "123");
        data.put("username", "learnqa");
        data.put("firstName", "learnqa");
        data.put("lastName", "learnqa");

        return data;
    }

    public static Map<String, String> getRegistrationData(Map<String,String> nonDefaultValues){
        Map<String, String> defaultValue = DataGenerator.getRegistrationData();
        Map<String, String> userData = new HashMap<>();
        String [] keys = {"email", "password", "username", "firstName", "lastName"};
        for(String key : keys) {
            if (nonDefaultValues.containsKey(key)){
                userData.put(key, nonDefaultValues.get(key));
            }
            else{
                userData.put(key, defaultValue.get(key));
            }
        }
        return userData;
    }
}
