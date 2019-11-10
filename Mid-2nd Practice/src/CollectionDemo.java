import java.util.*;
public class CollectionDemo {
    void simpleCollectionDemo() {
        Collection values = new ArrayList();
        values.add(10);
        values.add(12.09);
        values.add("pgluuu");
        System.out.println("Values Of Collection : " + values);
        System.out.println("\n Is this values is Empty : " + values.isEmpty());
        System.out.println("\n Size Of Values : " + values.size());
        System.out.println("\n Use of  contains method  : " + values.contains(10) );
    }
    void genericWithCollectionDemo(){
        Collection<Integer> myInt = new ArrayList<>();
        // myInt.add(24.4); - will generate Error as we are passing float_value
        myInt.add(10);
        myInt.add(5);
        myInt.add(12);
        myInt.add(01);
        System.out.println("\t \"Demo Of Collection with the help of Generic \" \n");
        System.out.println("Values : " + myInt);
        System.out.println("Size : " + myInt.size());
        System.out.println("It contains Only Integer Values ");
    }
    void demoOfMapWithCollection(){
        Map<Integer,String> menuType = new HashMap<>(); // try once with : TreeMap<>=HashMap<>
        menuType.put(1,"Yaduvanshi");
        menuType.put(5,"Pgluu");
        menuType.put(2,"Dil");
        menuType.put(10,"Rahul");
        System.out.println("\n\t ****  Demo of Map in Collection ********** \n");
        System.out.println("Values : " + menuType);
        System.out.println("Size  " + menuType.size());
    }

    public static void main(String[] args) {
        CollectionDemo demoBabu = new CollectionDemo();
        demoBabu.genericWithCollectionDemo();
        demoBabu.simpleCollectionDemo();
        demoBabu.demoOfMapWithCollection();
    }
}
