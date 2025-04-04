class calculator5{
    public int add(int a, int b) {
        return a + b;

    }

public double add(double a , double b) {
    return a + b;

   }

public int add(int a , int b , int c) {
    return a + b + c;

   }
}

public class calculator{
    public static void main(String[] args){
        calculator5 calc = new calculator5();
        System.out.println(calc.add(3,6));
        System.out.println(calc.add(34.5,46.4));
        System.out.println(calc.add(5,10,15));
    }
}