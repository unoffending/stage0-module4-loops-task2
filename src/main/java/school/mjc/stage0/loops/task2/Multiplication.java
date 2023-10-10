package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int zero = 0;
        if(multiplyByAndToInclusive > 0) {
            while(zero <= multiplyByAndToInclusive){
            int a = zero * (zero + 1);
            System.out.println(a);
            zero++;
            }
        }
        else if(multiplyByAndToInclusive < 0) {
            while(zero >= multiplyByAndToInclusive){
            int a = zero * (zero - 1);
            System.out.println(a);
            zero--;
            }
        }
    }
}

