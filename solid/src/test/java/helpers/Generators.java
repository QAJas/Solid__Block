package helpers;
//import com.github.javafaker.Faker;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

public class Generators {


    public static String getUniqueId() {
        return String.format(UUID.randomUUID().toString().substring(0, 5), System.currentTimeMillis() / 1000);
    }

    public static String Num() {
        String numb = RandomStringUtils.randomNumeric(3);
        return (numb);
    }
    public static String Name () {
        String name = RandomStringUtils.randomAlphabetic(5);
        return (name);
    }

    public static String generateMail() {
        return String.format("sb.qa.test21+" + Num() + "@gmail.com");
    }

    public static String phonenumer() {
        String generatedString = RandomStringUtils.randomNumeric(10);
        return (generatedString);
    }

    public static String randomeNum() {
        String generatedString = RandomStringUtils.randomNumeric(10);
        return (generatedString);
    }


}

