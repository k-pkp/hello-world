public class SortMyNumbersPlease {

    public static void doTheSortingThing(int[] theNumbers) {
        int theLength = theNumbers.length;
        boolean somethingWasSwapped = true;
        while (somethingWasSwapped) {
            somethingWasSwapped = false;
            for (int j = 0; j < theLength - 1; j++) {
                if (theNumbers[j] > theNumbers[j + 1]) {
                    int temporaryValue = theNumbers[j + 1];
                    theNumbers[j + 1] = theNumbers[j];
                    theNumbers[j] = temporaryValue;
                    somethingWasSwapped = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] listOfNumbers = {5, 1, 4, 2, 8};
        System.out.println("Before sorting:");
        for (int number : listOfNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        SortMyNumbersPlease.doTheSortingThing(listOfNumbers);

        System.out.println("After sorting:");
        for (int value : listOfNumbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
