package support;

import java.util.HashMap;
import java.util.Map;

public class HeadersHelper {
    public static Map headerForAuth(){
        Map <String, String > newApiKey = new HashMap<>();
        newApiKey.put("API-AUTHENTICATION", "cbef7373fc554d129091c7105478c3cc:3425b052d5b94057be1582619355f1360c65502738af41cdb22a64aa2bb3bbb7");
     return  newApiKey;
    }

}
