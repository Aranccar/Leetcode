import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String seom = "somestring";
        System.out.println(seom.substring(5, 9).equals("trin"));
    }

    public static int romanToInt(String s) {
        HashMap<String, Integer> priority = new HashMap<>();
        priority.put("I", 1);
        priority.put("X", 1);
        priority.put("C", 2);
        priority.put("M", 4);

        HashMap<String, Integer> romToInt = new HashMap<>();
        romToInt.put("I", 1);
        romToInt.put("V", 5);
        romToInt.put("X", 10);
        romToInt.put("L", 50);
        romToInt.put("C", 100);
        romToInt.put("D", 500);
        romToInt.put("M", 1000);

        String[] splited = s.split("");

        Integer sum = 0;

        for(int i = 0; i < splited.length - 1; i++){
            if(priority.get(splited[i+1]) != null && priority.get(splited[i]) < priority.get(splited[i+1])){
                sum = sum - romToInt.get(splited[i]);
            } else {
                sum += romToInt.get(splited[i]);
            }
        }
        return  sum;

    }

}
