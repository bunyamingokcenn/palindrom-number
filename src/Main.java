import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void isPalindrom(int number) {
        int temp = number, lastNumber, reverseNumber = 0;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber) {
            System.out.println(number + " palindrom sayıdır.");
        } else {
            System.out.println(number + " palindrom sayı değildir.");
        }

    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Palindrom kontrol için sayı giriniz: ");
        int result = input.nextInt();

        isPalindrom(result);
    }
}