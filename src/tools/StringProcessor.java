package tools;

public class StringProcessor {
    private String stringToProcess;
    private String secondStringToProcess;

    public void setStringToProcess(String stringToProcess) {
        this.stringToProcess = stringToProcess;
    }

    public void setSecondStringToProcess(String secondStringToProcess) {
        this.secondStringToProcess = secondStringToProcess;
    }

    public String reverseTheString() {
        StringBuilder wordInReverse = new StringBuilder();
        for (int i = this.stringToProcess.length() - 1; i >= 0; i--) {
            wordInReverse.append(this.stringToProcess.charAt(i));
        }
        return wordInReverse.toString();
    }

    public int countTheVowels() {
        int countedVowels = 0;
        for (int i = 0; i <= this.stringToProcess.length() - 1; i++) {
            switch (this.stringToProcess.toLowerCase().charAt(i)) {
                case 'a':
                case 'i':
                case 'u':
                case 'e':
                case 'o':
                case 'w':
                case 'y':
                    countedVowels++;
                    break;
                default:
                    break;
            }
        }
        return countedVowels;
    }

    public boolean isAnagram() {
        if (this.stringToProcess.length() != this.secondStringToProcess.length()){
            return false;
        }

        this.stringToProcess = this.stringToProcess.toLowerCase();
        this.secondStringToProcess = this.secondStringToProcess.toLowerCase();

        for (int i = 0; i <= this.stringToProcess.length() - 1; i++) {
            String currentChar = Character.toString(this.stringToProcess.charAt(i));
            String replacedString = this.secondStringToProcess.replaceFirst(currentChar, "");
            if (replacedString.equals(this.secondStringToProcess)) {
                return false;
            } else {
                this.secondStringToProcess = replacedString;
            }
        }
        return true;
    }

    public boolean isAnagram2() {
        this.stringToProcess = this.stringToProcess.toLowerCase();
        this.secondStringToProcess = this.secondStringToProcess.toLowerCase();

        if (this.stringToProcess.length() != this.secondStringToProcess.length()){
            return false;
        }

        int[] charCount1 = new int[256];
        int[] charCount2 = new int[256];

        for (int i = 0; i < this.stringToProcess.length(); i++) {
            charCount1[this.stringToProcess.charAt(i)]++;
            charCount2[this.secondStringToProcess.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false;
            }
        }
        return true;
    }
}
