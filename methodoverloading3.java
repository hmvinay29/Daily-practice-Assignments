package Assignments;

class Calcc {
    int mul(int a, int b) {
        return a * b;
    }
    double mul(double a, double b, double c) {
        return a * b * c;
    }
    float mul(float a, float b) {
        return a * b;
    }
    double mul(int a, double b) {
        return a * b;
    }
}

public class methodoverloading3 {

	public static void main(String[] args) {
		Calcc calc = new Calcc();
        
        int intsum = calc.mul(5,10);
        System.out.println(intsum);  
        
        double doublesum=calc.mul(3.5, 4.5,5.5);
        System.out.println(doublesum);
        
        float floatsum=calc.mul(2.5f,3.5f);
        System.out.println(floatsum);
        
        double mixedsum = calc.mul(4, 7.5);
        System.out.println(mixedsum);
	}

}
