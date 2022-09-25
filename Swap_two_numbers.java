import java.util.Scanner;

public class Swap_two_numbers {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First number:");
        int a=sc.nextInt();
        System.out.print("Enter Second number:");
        int b=sc.nextInt();
        System.out.println("The value of First number entered by user is "+a+" and the value of Second number entered by user is "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping->");
        System.out.println("The value of First number after swapping is "+a+" and the value of Second number after swapping is "+b);


    }
}
