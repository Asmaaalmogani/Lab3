import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a month:");
        a=input.nextInt();
        if(a== 1)
                System.out.println("31 days");
        else if(a== 2)
            System.out.println("28 days");
        else if(a== 3)
            System.out.println("31 days");
        else if(a== 4)
            System.out.println("30 days");
        else if(a== 5)
            System.out.println("30 days");
        else if(a== 6)
            System.out.println("30 days");
        else if(a== 7)
            System.out.println("31 days");
        else if(a== 8)
            System.out.println("31 days");
        else if(a== 9)
            System.out.println("30 days");
        else if(a== 10)
            System.out.println("31 days");
        else if(a== 11)
            System.out.println("30 days");
        else if(a== 12)
            System.out.println("31 days");
            else
                System.out.println("there is no month with this number.");
        }

    }
