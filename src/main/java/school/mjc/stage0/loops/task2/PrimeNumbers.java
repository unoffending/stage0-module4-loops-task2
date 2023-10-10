package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if(printToInclusive >= 2)
        System.out.println(2);
        if(printToInclusive >= 3)
        System.out.println(3);
        if(printToInclusive >= 5)
        System.out.println(5);
        if(printToInclusive >= 7)
        System.out.println(7);
        int a = 10;
        while(a <= printToInclusive) {
            if((a % 2 != 0) && (a % 3 != 0) && (a % 4 != 0) && (a % 5 != 0) && (a % 6 != 0) && (a % 7 != 0) && (a % 8 != 0) && a % 9 != 0) {
            System.out.println(a);
        } a++;
        }
    }
}
