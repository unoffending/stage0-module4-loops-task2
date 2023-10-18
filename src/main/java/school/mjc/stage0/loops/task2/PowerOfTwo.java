package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
    if(power < 0) {
        System.out.println("too much power");
        } else {
            System.out.println(1);
            if(power >= 1)
            System.out.println(2);
            int a = 2;
            int b = 2;
            while(b <= power) {
                System.out.println(a * 2);
                a = a * 2;
                b++;
            }
        }
    }
}
