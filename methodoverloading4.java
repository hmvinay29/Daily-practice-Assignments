package Assignments;

class Calccc {
    int div(int a, int b) {
        return a / b;
    }
    double div(double a, double b, double c) {
        return a / b / c;
    }
    float div(float a, float b) {
        return a / b;
    }
    double div(int a, double b) {
        return a / b;
    }
}

public class methodoverloading4 {

	public static void main(String[] args) {
		Calccc calc = new Calccc();
        
        int intdiv = calc.div(5,10);
        System.out.println(intdiv);  
        
        double doublediv=calc.div(3.5, 4.5,5.5);
        System.out.println(doublediv);
        
        float floatdiv=calc.div(2.5f,3.5f);
        System.out.println(floatdiv);
        
        double mixeddiv = calc.div(4, 7.5);
        System.out.println(mixeddiv);
	}

}
