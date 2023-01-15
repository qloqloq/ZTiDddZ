public class PasswordGeneratorDemo {

    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String password = passwordGenerator.generatePassword();
        System.out.println("Generated password: " + password);
    }

}