package NumberProblems;

public class DigitsToWords {
    public static void main(String[] args) {
        numberToWords(3000);
    }

    static int reverse(int num) {
        int rev = 0;
        boolean negative = false;
        if (num < 0) {
            num *= -1;
            negative = true;
        }
        while (num > 0) {
            int last = num % 10;
            num /= 10;
            rev *= 10;
            rev += last;
        }
        if (negative) {
            rev *= -1;
        }
        return rev;
    }

    static void numberToWords(int num) {
        int count = getDigitCount(num);
        StringBuilder output = new StringBuilder();
        if (num < 0) {
            output.append("Invalid Value ");
            System.out.print(output.toString().trim());
            return;
        }
        num = reverse(num);
        while (count > 0) {
            int last = num % 10;
            num /= 10;
            output.append(digitToWords(last));
            --count;
        }
        System.out.print(output.toString().trim());

    }
    private static String digitToWords(int digit) {
        return switch (digit){
            case 0 -> "Zero ";
            case 1 -> "One ";
            case 2 -> "Two ";
            case 3 -> "Three ";
            case 4 -> "Four ";
            case 5 -> "Five ";
            case 6 -> "Six ";
            case 7 -> "Seven ";
            case 8 -> "Eight ";
            case 9 -> "Nine ";
            default -> throw new IllegalStateException("Unexpected value: " + digit);
        };
    }
    static int getDigitCount(int num){
        if(num<0){
            return -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num>0){
            num /= 10;
            ++count;
        }
        return count;
    }

}
