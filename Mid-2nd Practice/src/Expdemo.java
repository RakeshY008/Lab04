import java.util.*;
public class Expdemo {
    void func1(){
        try {
            int var1 = 10;
            int var2 = 0;
            int var = var1 / var2;
            System.out.println("Division " + var);
        }
        catch (Exception e){
            System.out.println("Problem : " + e);
        }
    }
    void func2(){
        System.out.println("But .........  Func2 is Working..... ");
    }

    public static void main(String[] args) {
        Expdemo myObj = new Expdemo();
        myObj.func1();
        myObj.func2();
    }
}
