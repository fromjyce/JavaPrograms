package DSAPrograms;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLL {
    public boolean isPalindrome(ListNode head) {
        @SuppressWarnings({ "rawtypes", "unchecked" })
        List<Integer> list = new ArrayList();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        
        int left = 0;
        int right = list.size()-1;
        while(left < right && list.get(left) == list.get(right)) {
            left++;
            right--;
        }
        return left >= right;
    }
}
