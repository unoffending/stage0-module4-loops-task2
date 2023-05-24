package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int zero = -1;
        if(multiplyByAndToInclusive > 0) {
            while(multiplyByAndToInclusive > zero) {
                zero++;
                System.out.println(multiplyByAndToInclusive * zero);
            } 
        } else if(multiplyByAndToInclusive < 0) {
            zero = multiplyByAndToInclusive;
            while(zero <= 0) {
                System.out.println(multiplyByAndToInclusive * zero);
                zero++;
            }
        }
    }
}
