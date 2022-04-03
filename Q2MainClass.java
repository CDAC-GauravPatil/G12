package assignment.mar31ArrayLab;

public class Q2MainClass {


    public static void main(String[] args) {
        Q1ArrayQuestions q1=new Q1ArrayQuestions();
        q1.takeInput();
        q1.printArray();
        q1.evenCount();
        q1.reverseArray();
        int sumArr = q1.sumOfArray();
        System.out.println("Sum of Array : " + sumArr);

        q1.copyArrayInAnotherArray();

        q1.largestElementInArray();

        int z = 20;
        boolean isElementPresent = q1.checkElementInArray( z);
        System.out.println("Is "+z+" present in array : "+ isElementPresent);

        q1.sortingArrayUsingBubbleSort();
    }
}
