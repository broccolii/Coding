import java.util.*;



public class Main {

    public static void main(String[] args) {
       int i = 1;
       int a = i;
       i = 2;

       Number i1 = new Number();
       i1.i = 1234;

       Number i2 = new Number();
       i2.i = 1111;

       i1 = i2;

        System.out.println("i1: " + i1.i + "\n" + "i2: " + i2.i);

        i2.i = 222222;

        System.out.println("-----------------");

        System.out.println("i1: " + i1.i + "\n" + "i2: " + i2.i);


        System.out.println("--------------");

       System.out.println("i1: " + i1);
       System.out.println("i2: " + i2);
    }
}

class Number {
    int i;
}