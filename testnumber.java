
import java.util.Scanner;

public class testnumber {
    public static void main(String[] args) {
        int num1,num2,num3;
        System.out.println("Enter three number here:");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
       boolean num1ISlargest = (num1>num2) && (num1>num3);
       boolean num2IsLargest =  (num2>num1) && (num2>num3);
       boolean num3IsLargest = (num3>num1)  && (num3>num2);
       boolean allequal = (num1ISlargest==num2IsLargest==num3IsLargest);

        if(num1ISlargest)
            System.out.println("The Largest Number is " + num1);

        else if(num2IsLargest)
            System.out.println("The Largest Number is " + num2);

        else if (num3IsLargest)
            System.out.println("The Largest Number is " + num3);

        else 
            System.out.println("All numbers are equal ");


    
    }
}
