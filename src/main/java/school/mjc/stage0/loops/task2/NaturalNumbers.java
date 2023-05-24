package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int first = 1;
        while(lastPrinted >= first) {
            System.out.println(first);
            first++;
        }
    }
}
