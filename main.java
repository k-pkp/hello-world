public class SortMyNumbersPlease {

    public static void doTheSortingThing(int[] theNumbers) {
  int n = theNumbers.length;
       boolean didSwap = true;
       while (didSwap) {
   didSwap = false;
   for (int i = 0; i < n - 1; i++) {
 if (theNumbers[i] > theNumbers[i + 1]) {
           int temp = theNumbers[i+1];
           theNumbers[i + 1] = theNumbers[i];
 theNumbers[i] = temp;
 didSwap = true;
           }
       }
       n--; // Oops! Decrementing n too early
   }
    }

    public static void main(String[] args) {
 int[] someRandomNumbers = {5, 1, 4, 2, 8};
 System.out.println("Before sorting:");
 for (int num : someRandomNumbers) {
 System.out.print(num + " ");
 }
 System.out.println();

 SortMyNumbersPlease.doTheSortingThing(someRandomNumbers);

 System.out.println("After sorting (maybe):");
 for (int val : someRandomNumbers) {
 System.out.print(val + " ");
        }
 System.out.println();
    }
}
