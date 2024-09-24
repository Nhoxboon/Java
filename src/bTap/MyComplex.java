package bTap;

public class MyComplex {
    private double real;
    private double imag;


    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    public boolean isReal() {
        return imag == 0;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public boolean isImaginary() {
        return real == 0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return this.real == another.real && this.imag == another.imag;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argumentInRadians() {
        return Math.atan2(imag, real);
    }

    public int argumentInDegrees() {
        return (int) Math.toDegrees(Math.atan2(imag, real));
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }

    public MyComplex add(MyComplex another) {
        return new MyComplex(this.real + another.real, this.imag + another.imag);
    }

    public MyComplex subtract(MyComplex another) {
        return new MyComplex(this.real - another.real, this.imag - another.imag);
    }

    public MyComplex multiplyWith(MyComplex another) {
        return new MyComplex(this.real * another.real - this.imag * another.imag, this.real * another.imag + this.imag * another.real);
    }

    public MyComplex dividedBy(MyComplex another) {
        double denominator = another.real * another.real + another.imag * another.imag;
        return new MyComplex((this.real * another.real + this.imag * another.imag) / denominator, (this.imag * another.real - this.real * another.imag) / denominator);
    }
}
