package support;

import com.github.javafaker.Faker;

public class utilities {
    public static String generateRandomEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }
    public static String generateRandomeAddress() {
        Faker faker = new Faker();
        return faker.internet().macAddress();
    }
}
