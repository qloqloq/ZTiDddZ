import java.util.Base64;

public class Encoder {

    public String encode(String txt) {
        validateInput(txt);
        return Base64.getEncoder().encodeToString(txt.getBytes());
    }

    public String decode(String encodedTxt) {
        validateInput(encodedTxt);
        return new String(Base64.getDecoder().decode(encodedTxt));
    }

    private void validateInput(String txt) {
        if (txt == null)
            throw new RuntimeException("Input must not be null");
    }
}
