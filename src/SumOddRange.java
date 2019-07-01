public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        if (number < 1) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else return true;
    }

    public static int sumOdd(int start, int end) {
        if (start < 1 || end < 1 || start > end) {
            return -1;
        } else if (start == end && isOdd(start)) {
            return start;
        } else if (end == start) {
            return 0;
        }

        int sumOdd = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sumOdd += i;
            }
        }
        return sumOdd;
    }
}
