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

    public int getSecondLargest() {
        if(this.arrayNumberToProcess.length == 0) {
            System.out.println("Array is empty");
            return 0;
        }
        int largestNumber = 0;
        int secondLargestNumber = 0;
        for (int i = 0; i < this.arrayNumberToProcess.length - 1; i++) {
            if (this.arrayNumberToProcess[i] < largestNumber) {
                if (this.arrayNumberToProcess[i] >= secondLargestNumber) {
                    secondLargestNumber = this.arrayNumberToProcess[i];
                }
            } else {
                secondLargestNumber = largestNumber;
                largestNumber = this.arrayNumberToProcess[i];
            }
        }
        return secondLargestNumber;
    }
}
