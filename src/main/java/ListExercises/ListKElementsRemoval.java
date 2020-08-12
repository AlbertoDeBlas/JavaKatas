package ListExercises;

public class ListKElementsRemoval {

    // Singly-linked lists are already defined with this interface:

//
   public ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {

        ListNode<Integer> result = new ListNode(0);
        ListNode<Integer> temp = result;
        while(l != null){
            if(l.value != k){
                temp.next= l;
                temp = temp.next;
            }else{
                temp.next = l.next;
            }
            l = l.next;
        }

        return  result.next;
    }



    void printList(ListNode<Integer> l){
        System.out.println("-------list-----");
        while(l != null){
            System.out.println(l.value);
            l = l.next;
        }
    }


}
