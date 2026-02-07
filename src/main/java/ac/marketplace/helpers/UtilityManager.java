package ac.testingplace.helpers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class UtilityManager {

    private UtilityManager () {
        throw new IllegalStateException("Utility class");
    }
    public static String getCurrentDateTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM dd, hh:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        return dateTimeFormatter.format(localDateTime);
    }
    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(1000L * milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
    public static String randomEmail () {
        return "random-" + UUID.randomUUID() + "@example.com";
    }
}