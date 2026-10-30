
package leetcode;

public class PracticeTest {
    public static void main(String[] args) {

        AddDigits addDigits = new AddDigits();
        DoubleReversal doubleReversal = new DoubleReversal();

        System.out.println("Задача 258:");
        System.out.println(addDigits.addDigits(38)); // 2
        System.out.println(addDigits.addDigits(0));  // 0

        System.out.println("Задача 2119:");
        System.out.println(doubleReversal.isSameAfterReversals(526));  // true
        System.out.println(doubleReversal.isSameAfterReversals(1800)); // false
        System.out.println(doubleReversal.isSameAfterReversals(0));    // true
    }
}
