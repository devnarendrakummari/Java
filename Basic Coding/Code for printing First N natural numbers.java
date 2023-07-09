import java.util.Scanner;
public class LearnCoding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 1;

        do{
            System.out.print(i + " ");
            i++;
        }while (i<=num);
    }
}