package data;

import utils.DataHandler;

import java.io.File;

public class Constants {
    private Constants() {
    }

    public static final String URL = DataHandler.readFromPropertiesFile(new File("data.properties"),"url");
    public static final String PASSWORD = DataHandler.readFromPropertiesFile(new File("data.properties"), "password");
    public static final String WELCOME = "Welcome";
    public static final String SIGN_UP_SUCCESS = "Sign up successful.";
    public static final String LOGIN_EMAIL = DataHandler.readFromPropertiesFile(new File("data.properties"), "email");
}
