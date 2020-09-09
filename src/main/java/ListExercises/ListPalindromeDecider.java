package ListExercises;

public class ListPalindromeDecider extends ListOperations {
    public static boolean isListPalindrome(ListNode<Integer> l) {
        boolean isListPalindrome = true;
        ListNode<Integer> counter = l;
        if (l != null && l.next != null) {
            int listLength = getListLength(counter);
            int center = (listLength) / 2;

            ListNode<Integer> ReverseL = ListOperations.reverseList(ListOperations.copyList(l));
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
