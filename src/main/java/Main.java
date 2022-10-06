import java.util.Scanner;

public class Main {
    public static void main (String args[]){



        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("enter the three sides of Triangle");

        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();

        if (a+b>c && b+c>a && c+a>b){
            System.out.println("Triangle possible");
            if (a==b && b==c)
                System.out.println("Equilateral");
                else if (a==b || b==c || c==a)
                System.out.println("isosceles");
                else
                System.out.println("scalene");
            }
        }
    }
