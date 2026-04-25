package Wrapper;
import java.util.*;

public class AutoBoxing {
    public void boxing(){
        List<Integer> l=new ArrayList<>();
        System.out.println("Enter Array elements");
        Scanner s=new Scanner(System.in);
        for (int i=0; i<5; i++){
            int a=s.nextInt();
            l.add(a);
        }
        System.out.println("Array: "+l);
        int c=0;
        for (Integer n:l){
            c+=n;
        }
        System.out.println("Sum: "+c);

    }

    public static void main(String[] args) {
        AutoBoxing a=new AutoBoxing();
        a.boxing();
    }
}