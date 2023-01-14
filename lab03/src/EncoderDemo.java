import java.util.Base64;

public class EncoderDemo {
    public static void main(String[] args) {
        String password = "P@ssword123!";
        String encodedPassword = EncoderUtil.encode(password);
        String decodedPassword = EncoderUtil.decode(encodedPassword);

        System.out.println("Initial password: " + password);
        System.out.println("Encoded password: " + encodedPassword);
        System.out.println("Decoded password: " + decodedPassword);

    }

}

class EncoderUtil {

    private EncoderUtil() {}

    public static String encode(String txt) {
        return Base64.getEncoder().encodeToString(txt.getBytes());
    }

    public static String decode(String encodedTxt) {
        return new String(Base64.getDecoder().decode(encodedTxt));
    }
}