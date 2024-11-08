package Exception;

public class TestQ2 {

    public static void divison(int num, int den) throws ArithmeticException{
        double result = num/den;
        System.out.println(result);
    }

    public static void main(String[] args) {
        try {
            divison(12,0);
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }

}
