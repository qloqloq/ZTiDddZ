import java.util.Base64;

public class EncoderUtil {

    private EncoderUtil() {}

    public static String encode(String txt) {
        validateInput(txt);
        return Base64.getEncoder().encodeToString(txt.getBytes());
    }

    public static String decode(String encodedTxt) {
        validateInput(encodedTxt);
        return new String(Base64.getDecoder().decode(encodedTxt));
    }

    private static void validateInput(String txt) {
        if (txt == null)
            throw new RuntimeException("Input must not be null");
    }
}
