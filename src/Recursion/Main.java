package Recursion;

public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int result = factorial.fact(5);
        System.out.println(result);
        System.out.println(factorial.fact(50));
        System.out.println(factorial.fact(9));
        factorial.fact(500);
        factorial.fact(5000);
    }
}

//01717021090