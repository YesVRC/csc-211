package main.java;

public class MathMethods {
    private int a;
    private int b;

    public MathMethods(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(){
        return a + b;
    }

    public int average(){
        return add() / 2;
    }

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }
}
