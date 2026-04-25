package Wrapper;

import javax.sound.midi.Soundbank;

public class WrapToPrim {
    public void wrToPrim(){
        Double a=45.67;
        double b=a;
        int c=(int)b;
        System.out.println("Primitive double: "+b);
        System.out.println("Primitive integer: "+c);
        System.out.println("Wrapper Double: "+a);
    }
    public static void main(String[] args) {
        WrapToPrim w=new WrapToPrim();
        w.wrToPrim();
    }
}