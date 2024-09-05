package tools;

public class LoopAndCondition {
    private int n;
    private int o;
    private String stringToProcess;

    public void setNumberToProcess(int n) {
        this.n = n;
    }

    public void setSecondNumberToProcess(int o) {
        this.o = o;
    }

    public void setStringToProcess(String stringToProcess) {
        this.stringToProcess = stringToProcess;
    }

    public boolean multiplicationTableWasMade() {
        if (this.n < 2) {
            System.out.println("Please input number more than 1");
            return false;
        }
        int i = 1;
        while (i <= this.n) {
            for (int j = 1; j <= this.n; j++) {
                if(j == this.n) {
                    System.out.println(i * j);
                } else {
                    System.out.print((i * j) + " ");
                }
            }
            i++;
        }
        return true;
    }

    public boolean starTrianglePatternWasMade() {
        int i = 1;
        while (i <= this.n) {
            int starAmount = i;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
            i++;
        }
        return true;
    }

    public boolean theGuessIsRight() {
        if (this.n > this.o) {
            System.out.println("Too Low");
            return false;
        } else if (this.n < this.o) {
            System.out.println("Too High");
            return false;
        } else {
            System.out.println("You're right. Congrats!!");
            return true;
        }
    }

    public String swapTheCase() {
        StringBuilder swappedString = new StringBuilder();
        for (int i = 0; i < this.stringToProcess.length(); i++) {
            char currentChar = this.stringToProcess.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                swappedString.append(Character.toUpperCase(currentChar));
            } else {
                swappedString.append(Character.toLowerCase(currentChar));
            }
        }
        return swappedString.toString();
    }
}
