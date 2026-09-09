import java.text.NumberFormat;
import java.util.Scanner;
public class Base_Convertor {
    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = sc.nextLine();

        System.out.print("Enter its base (2, 8, 10, or 16): ");
        int base = sc.nextInt();

        if (base != 2 && base != 8 && base != 10 && base != 16) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        try {
            long decimal = Long.parseLong(number, base);

            System.out.println("Binary: " + Long.toBinaryString(decimal));
            System.out.println("Decimal: " + decimal);
            System.out.println("Octal: " + Long.toOctalString(decimal));
            System.out.println("Hexadecimal: " + Long.toHexString(decimal).toUpperCase());
        } catch (NumberFormatException e){
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
