public class EncoderDemo {

    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        String password = "P@ssword123!";

        String encodedPassword = encoder.encode(password);
        String decodedPassword = encoder.decode(encodedPassword);

        System.out.println("Password: " + password);
        System.out.println("Encoded password: " + encodedPassword);
        System.out.println("Decoded password: " + decodedPassword);

    }
}
