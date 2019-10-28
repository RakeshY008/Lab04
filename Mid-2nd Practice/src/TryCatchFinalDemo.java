public class TryCatchFinalDemo {
    void Func() {
        try {
            int var1 = 12;
            int var2 = 0;
            int var = var1 / var2;
            System.out.println(var);
        } catch (Exception x) {
            System.out.println("We Found Error : \n\n" + x);
            TryCatchFinalDemo checkObj = new TryCatchFinalDemo();
            checkObj.Funcx();
        } finally {
            System.out.println("After try...catch.... \'finally\' part get Executed  \n\n");
        }
    }
    void Funcx(){
        System.out.println("\nCatch Block is Executing .. \n\n");
        }

    public static void main(String[] args) {
        TryCatchFinalDemo myObj = new TryCatchFinalDemo();
        myObj.Func();
    }
    }


