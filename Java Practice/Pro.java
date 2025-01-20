import java.util.Scanner;
class Pro{
// System.out.println("Hello World");
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the first number");

// int num1 = sc.nextInt();

// System.out.println("Enter the second number");

// int num2 = sc.nextInt();

// int sum = num1 + num2;

// System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
public static void main(String[] args) {
    //type your code here
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int result= ((a+b-c*d / a) % b);
    System.out.printf("(a + b - c * d / a) %%b = %d", result);
    
    sc.close();
}
}