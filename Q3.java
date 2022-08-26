import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number: ");
        Scanner input =new Scanner(System.in);
        num=input.nextInt();

        if (num<0)
            System.out.println("The number is negative.");
        else if(num==0)
            System.out.println("The number is ziro.");
        else
            System.out.println("The number is positive.");
    }
}
