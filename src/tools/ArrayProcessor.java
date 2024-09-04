package tools;

public class ArrayProcessor {
    private int[] arrayNumberToProcess;

    public void setArrayNumberToProcess(int[] arrayNumberToProcess) {
        this.arrayNumberToProcess = arrayNumberToProcess;
    }

    public int[] bubbleSort() {
        int n = this.arrayNumberToProcess.length;
        boolean isNeededToSwapped;
        for (int i = 0; i < n - 1; i++) {
            isNeededToSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (this.arrayNumberToProcess[j] > this.arrayNumberToProcess[j + 1]) {
                    int temp = this.arrayNumberToProcess[j];
                    this.arrayNumberToProcess[j] = this.arrayNumberToProcess[j + 1];
                    this.arrayNumberToProcess[j + 1] = temp;
                    isNeededToSwapped = true;
                }
            }
            if (!isNeededToSwapped) {
                break;
            }
        }
        return this.arrayNumberToProcess;
    }

    public int getSecondSmallest() {
        if (this.arrayNumberToProcess.length < 2) {
            System.out.println("Array does not contain enough elements");
            return Integer.MAX_VALUE;
        }

        int smallestNumber = Integer.MAX_VALUE;
        int secondSmallestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < this.arrayNumberToProcess.length; i++) {
            if (this.arrayNumberToProcess[i] > smallestNumber) {
                if (this.arrayNumberToProcess[i] <= secondSmallestNumber) {
                    secondSmallestNumber = this.arrayNumberToProcess[i];
                }
            } else {
                secondSmallestNumber = smallestNumber;
                smallestNumber = this.arrayNumberToProcess[i];
            }
        }
        if (secondSmallestNumber == Integer.MAX_VALUE) {
            System.out.println("No second-smallest number found");
        }
        return secondSmallestNumber;
    }
}
