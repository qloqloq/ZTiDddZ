import java.util.Random;

public class PasswordGenerator {
    private final Random random;
    private final StringBuilder stringBuilder;
    private final String UPPER_CASE_REGEX = "[A-Z].*";
    private final String LOWER_CASE_REGEX = "[a-z].*";
    private final String NUMBER_REGEX = "[0-9].*";
    private final String SPECIAL_CHAR_REGEX = "(?!" + UPPER_CASE_REGEX + LOWER_CASE_REGEX + NUMBER_REGEX + ")";
    private final int MIN_PASSWORD_LENGTH = 8;

    public PasswordGenerator() {
        random = new Random();
        stringBuilder = new StringBuilder();
    }

    public String generatePassword() {
        int passwordLength = random.nextInt(20) + MIN_PASSWORD_LENGTH;

        while (stringBuilder.length() < passwordLength) {
            String password = stringBuilder.toString();
            if (!password.matches(UPPER_CASE_REGEX))
                addUpperCaseLetter();
            if (!password.matches(LOWER_CASE_REGEX))
                addLowerCaseLetter();
            if (!password.matches(NUMBER_REGEX))
                addNumber();
            if (!password.matches(SPECIAL_CHAR_REGEX))
                addSpecialChar();
            else
                randomChar('!', 93);
        }

        return stringBuilder.toString();
    }

    private void addNumber() {
        randomChar('0', 9);
    }

    public void addUpperCaseLetter() {
        randomChar('A', 26);
    }

    private void addLowerCaseLetter() {
        randomChar('a', 26);
    }

    private void addSpecialChar() {
        final String[] specialCharRanges = new String[]{"!", ":", "[", "{", "15", "7", "6", "4"};
        int randomIndex = random.nextInt(3);
        randomChar(specialCharRanges[randomIndex].toCharArray()[0], Integer.parseInt(specialCharRanges[randomIndex + 4]));
    }

    /**
     * Adds random char to StringBuilder. Random char is calculated based on ASCII encoding standard
     *
     * @param startChar defines start of range inclusive
     * @param bound defines end of range inclusive
     */

    private void randomChar(char startChar, int bound) {
        char randomChar = (char) (random.nextInt(bound) + startChar);
        stringBuilder.append(randomChar);
    }

}
