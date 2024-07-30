import java.util.ArrayList;
import java.util.Scanner;
public class Wordakshari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        ArrayList<String> words = new ArrayList<String>();
        
        while (!(word = scan.nextLine()).equals("####")) {
            words.add(word);
        }

        if (!words.isEmpty()) {
            System.out.println(words.get(0));
            
            for (int i = 1; i < words.size(); i++) {
                String ele = words.get(i);
                String pre_ele = words.get(i - 1);
                char lastChar = pre_ele.charAt(pre_ele.length() - 1);
                
                if (ele.charAt(0) == lastChar) {
                    System.out.println(ele);
                } else {
                    break;
                }
            }
        }
    }
} 
