public class HW_3 {
    public static void main(String[] args) {
        double[] array = {8.5, 2.3, -4.1, 2.6, -3.2, 6.7, 7.8, -1.4, 7.7, -3.9, 5.1, 2.4, 3.3, 1.2, 4.5};
        boolean foundFirstNegative = false;
        double sum = 0;
        int count = 0;


        for (double number : array) {
            if (number < 0 && !foundFirstNegative) {
                foundFirstNegative = true;
            } else if (foundFirstNegative && number > 0) {
                sum += number;
                count++;
            }
        }
        System.out.println(sum / count);
    }
}
