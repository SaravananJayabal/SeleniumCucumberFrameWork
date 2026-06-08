package utilities;

import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader {
    private static JSONObject jsonObject;

    static {

        try {

            String content =
                    new String(
                            Files.readAllBytes(
                                    Paths.get(
                                            "src/test/resources/testdata/LoginData.json")));

            jsonObject = new JSONObject(content);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static String getValue(String key) {

        return jsonObject.getString(key);
    }
}
