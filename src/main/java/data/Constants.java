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
    public static final String PRODUCT_ADDED_TO_CART = "Product added.";
    public static final String NAME_FOR_SHIPPING = "alexandru";
    public static final String COUNTRY_FOR_SHIPPING = "Romania";
    public static final String CITY_FOR_SHIPPING = "Sibiu";
    public static final String CARD_NUMBER = "44221355132";
    public static final String MONTH = "july";
    public static final String YEAR = "1998";
    public static final String PURCHASE_SUCCESFUL = "Thank you for your purchase!";
}
