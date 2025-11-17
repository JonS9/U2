public class StrangeWord {

    private String word;

    public StrangeWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void bookend(String endChar, int num) { // (a)
        for (int i=0; i!=num; i++){
            this.word = endChar + this.word + endChar;
        }
    }


    public int followedBy(String searchChar) {
       int i = 0;
       int count = 0;
        while (i != this.word.length()-1) {
            String s = this.word.charAt(i) + "";
            String c = this.word.charAt(i+1) + "";
            if (s.equals(searchChar)) {
                if (!c.equals(searchChar)) {
                   count++;
                }
            }
            i++;
       }
        return count;
    }


    public String everyOther(int offSet) {
        String wordQ = "";
        for (int i=0; i!=this.word.length(); i++) {
            if (i % offSet == 0) {
                wordQ = wordQ + this.word.charAt(i);
            }
        }
        return wordQ;
    }

    public void wordPyramid() {
        int counter = 1;
        int lastIndex = 0;
        for (int i = 0; i+counter < word.length(); i = i + counter - 1) {
            String current = word.substring(i, i+counter);
            System.out.println(current);
            counter++;
            lastIndex = i + counter - 1;
        }
        System.out.println(word.substring(lastIndex));
    }
}
