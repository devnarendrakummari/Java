import java.util.Scanner;
public class LearnCoding {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        String result = age >=18 ? "Vote" : "Can not Vote";

        System.out.println(result);

    }
}