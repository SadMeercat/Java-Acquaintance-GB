import java.util.Scanner;

// Написать программу вычисления n-ого треугольного числа.
class Programm
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Print n: ");
        int n = in.nextInt();
        int t = 0;

        for (int i = 1; i <= n; i++) {
            t += i;
        }

        System.out.print("Your number: " + t);
    }
}