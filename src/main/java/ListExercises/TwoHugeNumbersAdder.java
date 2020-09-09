package ListExercises;

import ArithmeticOperations.Sum;

public class TwoHugeNumbersAdder {

    public static ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {
        //reverse lists
        ListNode<Integer> reversedA = ListOperations.reverseList(a);
        ListNode<Integer> reversedB = ListOperations.reverseList(b);
        ListNode<Integer> sumResult = new ListNode(0);
        ListNode<Integer> headResult = sumResult;
        Sum sum = Sum.createSum(0,0);

        while(reversedA != null || reversedB != null){
            int summandA = 0;
            int summandB = 0;
            summandA = assignNodeValueIfNodeNotNull(reversedA, summandA);
            summandB = assignNodeValueIfNodeNotNull(reversedB, summandB);
            sum = sumNodes(sum, summandA, summandB);
            sumResult = addPartialResultToTotal(sumResult, sum.getValue());
            reversedA = increaseNodeIfCurrentNotNull(reversedA);
            reversedB = increaseNodeIfCurrentNotNull(reversedB);
        }
        addExtraNodeIfCarry(sumResult, sum.getCarry());

        return ListOperations.reverseList(headResult.next);
    }

    private static Sum sumNodes(Sum sum, int summandA, int summandB) {
        int sumValue = summandA + summandB + sum.getCarry();
        sum = Sum.createSum(sumValue % 10000,sumValue / 10000);
        return sum;
    }

    private static ListNode<Integer> addPartialResultToTotal(ListNode<Integer> sumResult, int value) {
        ListNode<Integer> partialResult = new ListNode(value);
        partialResult.next = null;
        sumResult.next = partialResult;
        sumResult = partialResult;
        return sumResult;
    }


    private static int assignNodeValueIfNodeNotNull(ListNode<Integer> reversedA, int summandA) {
        if (reversedA != null) {
            summandA = reversedA.value;
        }
        return summandA;
    }

    private static ListNode<Integer> increaseNodeIfCurrentNotNull(ListNode<Integer> reversedA) {
        if (reversedA != null) {
            reversedA = reversedA.next;
        }
        return reversedA;
    }

    private static void addExtraNodeIfCarry(ListNode<Integer> sumResult, int carry) {
        if(carry > 0){
            sumResult = addPartialResultToTotal(sumResult, carry);
        }
    }



}
