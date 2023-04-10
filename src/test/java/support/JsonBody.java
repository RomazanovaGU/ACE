package support;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonValue;
import java.util.ArrayList;
import lib.DataGenerator;

public class JsonBody {
    public static JsonObject createFirstBodyJson() {

        JsonObject jsonObject = Json.createObjectBuilder()
                .add("ace_settings", Json.createObjectBuilder()
                        .add("notify_email_copying_process", Json.createArrayBuilder()
                                .add("galina.romazanova@revelsystems.com"))
                        .add("mulesoft_topic_arn", "arn:aws:sns:us-east-1:591398714894:ace-mulesoft-webhook-topic-dev")
                        .add("secure_key", "mulesoftmulesoftmulesoft")
                )
                .add("CustomerData", Json.createObjectBuilder()
                        .add("ns_internal_id", "4706532")
                        .add("ruid", "123456789")
                        .add("deployedBy", "galina.romazanova@revelsystems.com")
                        .add("est_number", "1")
                        .add("verticalType", "TSR")
                        .add("url", "corp-qa1.revelup.com")
                        .add("opportunityID", "123456789012345678")
                        .add("recordID", "14069967")
                        .add("establishmentName", DataGenerator.getRandomEstabName())
                        .add("contactName", "Kate White")
                        .add("contactEmail", DataGenerator.getRandomEmail())
                )
                .add("Settings", Json.createArrayBuilder()
                        .add(""))
                .add("HardwareDeployment", Json.createArrayBuilder()
                        .add("Ingenico IPP350 - TriPOS/Vantiv EMV (Assembly)")
                        .add("IDTech Stationary Swipe Mercury (Package)")
                        .add("IDTech Stationary Swipe Unencrypted (Package)")
                        .add("IDTech Stationary Swipe Unencrypted (Package)"))
                .add("CopyOptions", Json.createObjectBuilder()
                        .add("copyEstablishmentNumber", 40)
                        .add("copyEstablishmentSettings", Json.createArrayBuilder()
                                .add("Station, Peripherals, & Revenue Centers")
                                //.add("") - some other copy options
                        )
                )
                .add("TotalTerminals", Json.createObjectBuilder()
                        .add("QtyCustomerDisplay", "2")
                        .add("QtyKitchenDisplay", "2")
                        .add("QtyMobilePOS", "1")
                        .add("QtyStationaryPOS", "1")
                        .add("callerIdEnabled", "0")
                )
                .add("DeploymentType", "newlocation")
                .add("HardwareSettings", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder()
                                .add("configurationnotes", "192.168.22.141")
                                .add("lineid", "1")
                                .add("configuredName", "PrimCardSwipe1")
                                .add("productName", "Ingenico iSMP4 - TriPOS/Vantiv EMV")
                                .add("port", "12000")
                                .add("configurationType", "WorldPayEMV")
                                .add("MAC", (JsonValue) null)
                                .add("model", (JsonValue) null)
                                .add("prints", (JsonValue) null)
                                .add("hardwareType", "Card Swipe")
                        )
                        .add(Json.createObjectBuilder()
                                 .add("configurationnotes", "192.168.22.142")
                                 .add("lineid", "1")
                                 .add("configuredName", "PrimCardSwipe2")
                                 .add("productName", "Ingenico iSMP4 - TriPOS/Vantiv EMV")
                                 .add("port", "12000")
                                 .add("configurationType", "WorldPayEMV")
                                 .add("MAC", (JsonValue) null)
                                 .add("model", (JsonValue) null)
                                 .add("prints", (JsonValue) null)
                                 .add("hardwareType", "Card Swipe")
                        )
                )
                .build();
        return jsonObject;
    }
}
