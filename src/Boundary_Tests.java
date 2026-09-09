public class Boundary_Tests {
    public static void main(String[] args) {
        //Test 1: Zero
        int zero = 0;

        System.out.println("TEST 1: ZERO");
        System.out.println("Decimal:" + zero);
        System.out.println("Binary: " + Integer.toBinaryString(zero));
        System.out.println("Hex: " + Integer.toHexString(zero));

        //Test 2: Largest 32-bit
        long maxUnsigned = 0xFFFFFFFFL;
        System.out.println("TEST 2: MAX UNSIGNED VALUE");
        System.out.println("Decimal: " + maxUnsigned);
        System.out.println("Binary: " + Long.toBinaryString(maxUnsigned));
        System.out.println("Hex: " + Long.toHexString(maxUnsigned));

        //Test 3: Negative two's-complement
        int negative = -5;
        System.out.println();
        System.out.println("TEST 3: NEGATIVE TWO'S COMPLEMENT VALUE");
        System.out.println("Decimal: " + negative);
        System.out.println("Binary: " + Integer.toBinaryString(negative));
        System.out.println("Hex: " + Integer.toHexString(negative));



    }
}
