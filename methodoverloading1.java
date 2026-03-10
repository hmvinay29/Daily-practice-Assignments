package Assignments;

class Cal {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b, double c) {
        return a + b + c;
    }
    float add(float a, float b) {
        return a + b;
    }
    double add(int a, double b) {
        return a + b;
    }
}
public class methodoverloading1 {
	
	    public static void main(String[] args) {

	        Cal calc = new Cal();
	        
	        int intsum = calc.add(5,10);
	        System.out.println(intsum);  
	        
	        double doublesum=calc.add(3.5, 4.5,5.5);
	        System.out.println(doublesum);
	        
	        float floatsum=calc.add(2.5f,3.5f);
	        System.out.println(floatsum);
	        
	        double mixedsum = calc.add(4, 7.5);
	        System.out.println(mixedsum);
	}
}
