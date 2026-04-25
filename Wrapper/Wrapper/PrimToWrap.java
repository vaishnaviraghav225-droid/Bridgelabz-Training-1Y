package Wrapper;

import java.util.Scanner;

public class PrimToWrap {
    public void prmToW(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int a= s.nextInt();
        Integer b=a;
        System.out.println("Primitive: "+a);
        System.out.println("Wrapper: "+b);
    }

    public static void main(String[] args) {
        PrimToWrap p=new PrimToWrap();
        p.prmToW();
    }
}