package Exception;

class NegativeAgeException extends Exception {
        public NegativeAgeException(String m) {
            super(m);
        }
}

public class AgeValidator {

    public static void checkAge(int age) throws NegativeAgeException {
        if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative.");
        } else {
                System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        int age = -1;

        try {
                checkAge(age);
        } catch (NegativeAgeException e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}
