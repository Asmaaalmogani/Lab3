import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int num1,num2,num3;
        System.out.println("Enter three numbers: ");
        Scanner input =new Scanner(System.in);
        num1=input.nextInt();
        num2=input.nextInt();
        num3=input.nextInt();

        if ((num1==num2)&&(num1==num2))
            System.out.println("All the same.");
        else if((num1!=num2)&&(num1!=num3)&&(num2!=num3))
            System.out.println("All different");
        else
            System.out.println("Neither");
    }
}
