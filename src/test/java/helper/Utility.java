package helper;

import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;

public class Utility {
    public static File getJSONSchemaData(String JSONFile) {
        return new File("src/test/java/helper/JSONSchemaData/" + JSONFile);
    }

    //random email
    public static String generateRandomEmail(){
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" +  "_-.";
        String email = "";
        String temp = RandomStringUtils.randomAlphanumeric(10); // panjang minimal karakter
        email = temp + "@testdata.com";
        return email;
    }

}
