package Exception;
import java.util.Scanner;

public class TestQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Array of Length 5");
        Integer arr[] = new Integer[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("give the index value of the element that you want to fetch");
        int n = sc.nextInt();

        try{
            System.out.println("element at index"+n+" is "+arr[n]);
        } catch (Exception e){
            System.out.println("please provide the correct index");
        }

        System.out.println("program ends Here");
    }
}
