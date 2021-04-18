public class ReverseInteger {
    public long reverse(long x) {
        if (x == 0 || x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }

        boolean isNegative = false;
        int result;

        if (x < 0) {
            isNegative = true;
            x *= -1;
        }

        StringBuilder leftToRight = new StringBuilder();

        String.valueOf(x).chars().forEach(leftToRight::appendCodePoint);

        StringBuilder rightToLeft = new StringBuilder(leftToRight).reverse();

        try {
            result = Integer.parseInt(rightToLeft.toString());
        } catch (NumberFormatException e) {
            return 0;
        }

        if (isNegative) {
            result *= -1;
        }

        return result;
    }
}
