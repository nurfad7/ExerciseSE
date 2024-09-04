package tools;

public class BasicMath {
    private int numberToProcess;
    private int[] arrayNumberToProcess;
    private String stringToCalculate;

    public void setNumberToProcess(int numberToProcess) {
        this.numberToProcess = numberToProcess;
    }

    public void setArrayNumberToProcess(int[] arrayNumberToProcess) {
        this.arrayNumberToProcess = arrayNumberToProcess;
    }

    public void setStringToProcess(String stringToCalculate) {
        this.stringToCalculate = stringToCalculate;
    }

    public int calculateTheSum() {
        int sumResult = 0;
        String numberToSumInString = String.valueOf(this.numberToProcess);
        for (int i = 0; i < numberToSumInString.length(); i++) {
            char charFromNumber = numberToSumInString.charAt(i);
            String string = Character.toString(charFromNumber);
            sumResult += Integer.parseInt(string);
        }
        return sumResult;
    }

    public boolean isPrime() {
        if (this.numberToProcess <= 1) return false;
        if (this.numberToProcess == 2) return true;
        if (this.numberToProcess % 2 == 0) return false;
        for (int i = 3; i * i <= this.numberToProcess; i += 2) {
            if (this.numberToProcess % i == 0) return false;
        }
        return true;
    }

    public int findLargest() {
        if (this.arrayNumberToProcess == null || this.arrayNumberToProcess.length == 0) {
            System.out.println("Array is empty or null");
            return 0;
        }
        int largestNumber = this.arrayNumberToProcess[0];
        for (int i = 1; i < this.arrayNumberToProcess.length; i++) {
            if (this.arrayNumberToProcess[i] > largestNumber) {
                largestNumber = this.arrayNumberToProcess[i];
            }
        }
        return largestNumber;
    }

    public double calculateOperation() {
        double result = 0;
        String[] operationsArray = this.stringToCalculate.trim().split("\\s+");
        if (operationsArray.length == 3) {
            int firstNumber, secondNumber;
            try {
                firstNumber = Integer.parseInt(operationsArray[0]);
                secondNumber = Integer.parseInt(operationsArray[2]);
                switch (operationsArray[1]) {
                    case "+" : result = firstNumber + secondNumber; break;
                    case "-" : result = firstNumber - secondNumber; break;
                    case "/" : result = firstNumber / secondNumber; break;
                    case "*" : result = firstNumber * secondNumber; break;
                    case "%" : result = firstNumber % secondNumber; break;
                    default : System.out.println("Can't perform complex operation"); break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }
        } else {
            System.out.println("Can't perform complex operation");
        }
        return result;
    }

    public void generateFibonacci() {
        if (this.numberToProcess <= 0) {
            System.out.println("Number must be above 0.");
            return;
        }
        if (this.numberToProcess == 1) {
            System.out.println("0");
            return;
        }
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci sequence: ");
        System.out.print(a + " ");
        if (this.numberToProcess > 1) {
            System.out.print(b + " ");
        }
        for (int i = 2; i < this.numberToProcess; i++) {
            int nextNumber = a + b;
            System.out.print(nextNumber + " ");
            a = b;
            b = nextNumber;
        }
        System.out.println();
    }
}
