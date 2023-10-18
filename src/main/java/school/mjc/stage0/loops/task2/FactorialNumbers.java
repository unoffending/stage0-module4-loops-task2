package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
    if(printToInclusive >= 0)
        System.out.println(1); 
	if(printToInclusive >= 1)
        System.out.println(1);
	int a = 2;
	int b = 2;
	while(b <= printToInclusive) {
		System.out.println(a);
		b++;
		a = a * b;
	}
    }
}
