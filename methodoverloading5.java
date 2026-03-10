package Assignments;

class CalArea {
    int calcarea(int a) {
        return a *a;
    }
    double calcarea( double b, double c) {
        return b*c;
    }
    double calcarea(double b) {
        return Math.PI *b*b;
    }
    double calcarea(int x, double y) {
        return 0.5*x*y;
    }
}

public class methodoverloading5 {
	
	public static void main(String[] args) {
		
		CalArea calc = new CalArea();
        
        int Area1 = calc.calcarea(5);
        System.out.println("Area of the square:"+Area1);  
        
        double Area2=calc.calcarea(7.5,4.0);
        System.out.println("Area of the rectangle:"+Area2);
        
        double Area3=calc.calcarea(3.0);
        System.out.println("Area of the circle:"+Area3);
        
        double Area4 = calc.calcarea(8, 6.5);
        System.out.println("Area of the triangle:"+Area4);
}
}
