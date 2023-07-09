import java.util.Scanner;

public class LearnCoding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numb = sc.nextInt();

        if(numb == 0){
            System.out.println("Zero");
        }
        else {
            String result = (numb > 0) ? "Positive" : "Negative";

            System.out.println(result);
        }
    }
}