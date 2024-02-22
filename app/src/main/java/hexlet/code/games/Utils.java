package hexlet.code.games;

public class Utils {

    public static int randomIntValue(int leftBorder, int rightBorder) {
        return (int) (Math.random() * (rightBorder - leftBorder)) + leftBorder;
    }

    public static int randomIntValue() {
        final int left = 1;
        final int right = 26;
        return randomIntValue(left, right);
    }
}
