import java.util.Scanner;
public class ASCII_Decimal {
    public static void main(String[] args) {
       System.out.println("Enter String");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        for (Character ch : s.toCharArray()) {
            System.out.println((int)ch);
        }
        in.close();
    }
}
