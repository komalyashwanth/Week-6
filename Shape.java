class Shape { // class shape
    void calculateArea( int a) { // method 1
        System.out.println("The area of Square is :" + (a*a) );
    }
    void calculateArea(int a , int b) { // method 2
        System.out.println("The area of rectangle is :" + (a*b));
    }
}
class circle extends Shape { // inheritance class
    void calculateArea(double a){ // method overloading
        System.out.println("The area of circle is :" + (3.14*a*a));
  } }
class main { // main program
    public static void main(String[] args) {
        
        // creating objects for class
        
        Shape s = new Shape();
        circle c = new circle();
        
        // calling methods   
        
        s.calculateArea(4);
        System.out.println("    ");
        s.calculateArea(4, 5);
        System.out.println("    ");
        c.calculateArea(2);
    }
}


