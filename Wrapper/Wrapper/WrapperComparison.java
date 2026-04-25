package Wrapper;

public class WrapperComparison {
    public void wrapCompare(){
        Integer a=100;
        Integer b=100;
        Integer c=200;
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(a==c);
    }

    public static void main(String[] args) {
        WrapperComparison w=new WrapperComparison();
        w.wrapCompare();
    }
}