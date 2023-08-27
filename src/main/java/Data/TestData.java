package Data;

import org.apache.commons.lang3.RandomStringUtils;

public class TestData {

   public final static String LOGIN_DEFAULT = "bmwusertest";
    public final static String PASSWORD_DEFAULT = "Bmwusertest123456";
    public static final String LOGIN_INVALID = "LOGININVALID";
    public static final String PASSWORD_INVALID = "PASSWORDINVALID";
    public static final String EXIST_EMAIL = "hirgoff@gmail.com";

    public static String generateRandomString(int length) {
        String HigerCaseLetters = "ABCZ";
        return RandomStringUtils.randomAlphanumeric(length)+HigerCaseLetters;
    }

    public static String generateRandomEmail() {
        String randomPart = generateRandomString(10);
        String domain = "gmail.com";
        return randomPart + "@" + domain;
    }

    public static void main(String[] args) {
        String randomLogin = generateRandomString(10);
        String randomPassword = generateRandomString(12);
        String randomEmail = generateRandomEmail();

        System.out.println("Random Login: " + randomLogin);
        System.out.println("Random Password: " + randomPassword);
        System.out.println("Random Email: " + randomEmail);
    }
}

