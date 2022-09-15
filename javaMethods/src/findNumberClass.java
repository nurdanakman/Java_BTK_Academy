public class findNumberClass {

    public static void findNumber() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int selectedNumber = 9;
        boolean isInclude = false;

        for (int number : numbers) {
            if (selectedNumber == number) {
                isInclude = true;
                break;
            }
        }
        if (isInclude) {
            System.out.println("Array is include " + selectedNumber);
        } else {
            System.out.println("Array is not include " + selectedNumber);
        }
    }
}
