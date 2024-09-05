package tools;

public class LoopAndCondition {
        private int n;

        public void setNumberToProcess(int n) {
            this.n = n;
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
}
