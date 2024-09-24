package bTap;

public class Main {


    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(1.1, 2.2);
        System.out.println(c1);
        System.out.println("real is: " + c1.getReal());
        System.out.println("imag is: " + c1.getImag());
        System.out.println("magnitude is: " + c1.magnitude());
        System.out.println("argument in radians is: " + c1.argumentInRadians());
        System.out.println("argument in degrees is: " + c1.argumentInDegrees());
        System.out.println("conjugate is: " + c1.conjugate());

        MyComplex c2 = new MyComplex(3.3, 4.4);
        System.out.println("c1 is " + c1);
        System.out.println("c2 is " + c2);
        System.out.println("c1 is equal to c2? " + c1.equals(c2));
        System.out.println("c1 is equal to c1? " + c1.equals(c1));
        System.out.println("c1 is real? " + c1.isReal());
        System.out.println("c1 is imaginary? " + c1.isImaginary());
        System.out.println("c2 is real? " + c2.isReal());
        System.out.println("c2 is imaginary? " + c2.isImaginary());


        System.out.println("c1 + c2 is " + c1.add(c2));
        System.out.println("c1 - c2 is " + c1.subtract(c2));
        System.out.println("c1 * c2 is " + c1.multiplyWith(c2));
        System.out.println("c1 / c2 is " + c1.divideBy(c2));
    }
}
