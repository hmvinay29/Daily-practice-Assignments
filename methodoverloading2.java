package Assignments;

class Calc {
    int sub(int a, int b) {
        return a - b;
    }
    double sub(double a, double b, double c) {
        return a - b - c;
    }
    float sub(float a, float b) {
        return a - b;
    }
    double sub(int a, double b) {
        return a - b;
    }
}

public class methodoverloading2 {

	public static void main(String[] args) {
		Calc calc = new Calc();
        
        int intsum = calc.sub(5,10);
        System.out.println(intsum);  
        
        double doublesum=calc.sub(3.5, 4.5,5.5);
        System.out.println(doublesum);
        
        float floatsum=calc.sub(2.5f,3.5f);
        System.out.println(floatsum);
        
        double mixedsum = calc.sub(4, 7.5);
        System.out.println(mixedsum);
	}

}
