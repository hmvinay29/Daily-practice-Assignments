package Assignments;

class CalPeri {
    int calcperi(int a) {
        return 4 *a;
    }
    double calcperi( double b, double c) {
        return 2*(b+c);
    }
    double calcperi(double b) {
        return Math.PI *2*b;
    }
    double calcperi(int x, int y, int z) {
        return x+y+z;
    }
}

public class methodoverloading6 {
	
	public static void main(String[] args) {
		
		CalPeri calc = new CalPeri();
        
        int peri1 = calc.calcperi(4);
        System.out.println("Area of the square:"+peri1);  
        
        double peri2=calc.calcperi(7.5,3.5);
        System.out.println("Area of the rectangle:"+peri2);
        
        double peri3=calc.calcperi(2.0);
        System.out.println("Area of the circle:"+peri3);
        
        double peri4 = calc.calcperi(3,4,5);
        System.out.println("Area of the triangle:"+peri4);
}
}
