public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        String[] sss = s.split(" ");
        return sss[sss.length - 1].length();

    }
}
