package ListExercises;

public class ListPalindromeDecider {
    public static boolean isListPalindrome(ListNode<Integer> l) {
        boolean isListPalindrome = true;
        ListNode<Integer> counter = l;
        if (l != null && l.next != null) {
            int listLength = 0;
            while(counter.next != null){
                listLength++;
                counter = counter.next;
            }
            int center = (listLength+1) / 2;

            ListNode<Integer> ReverseL = ListReverse.reverseList(ListReverse.copyList(l));

            isListPalindrome = compareBeginEndList(l, ReverseL, center);
        }


        return isListPalindrome;
    }


    public static boolean compareBeginEndList(ListNode<Integer> l, ListNode<Integer> ReverseL, int center){
        for(int i = 0; i < center; i++){
            if(!l.value.equals(ReverseL.value)){
                return false;
            }
            l = l.next;
            ReverseL = ReverseL.next;

        }
        return true;
    }

}
