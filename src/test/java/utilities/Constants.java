package utilities;

public class Constants {
    private Constants() {
    }

    public static final String URL =
            ConfigReader.getProperty("sausceurl");

    public static final String USERNAME =
            JsonReader.getValue("username");

    public static final String PASSWORD =
            JsonReader.getValue("password");
}
