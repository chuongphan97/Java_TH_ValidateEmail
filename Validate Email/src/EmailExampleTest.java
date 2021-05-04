public class EmailExampleTest {
    public static final String[] validEmail = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (int i = 0; i < validEmail.length; i++) {
            boolean isValid = emailExample.validate(validEmail[i]);
            System.out.println("Email is: " + validEmail[i] + " is valid: " + isValid);
        }

        for (int i = 0; i < invalidEmail.length; i++) {
            boolean isValid = emailExample.validate(invalidEmail[i]);
            System.out.println("Email is: " + invalidEmail[i] + " is valid: " + isValid);
        }
    }
}
