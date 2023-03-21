import java.security.ProtectionDomain;
import java.util.*;

class IntCmp implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 == 0 && o2 % 2 != 0 ) return -1;
        if (o1 % 2 != 0 && o2 % 2 == 0 ) return  1;
        return 0;
    }
}
public class Main {


    static void f(int x, int y, int r){
        if (r > 15) {
            f(x + r, y, r / 2);
            f(x - r, y, r / 2);
            f(x, y - r, r / 2);
            f(x, y + r, r / 2);
        }
        System.out.println("x="+x+",y="+y+",r="+r);
    }

    public static void main(String[] args) {

        TreeMap<String,String> map = new TreeMap<>();
     //   SortedMap<String,String> subMap =  map.subMap("D","R");

        TreeMap<String,String> subMap = new TreeMap<>();
        for(Map.Entry<String,String> m: map.entrySet()) {
            if(m.getKey().charAt(0) >= 'D' &&
                m.getKey().charAt(0) < 'R') {
                subMap.put(m.getKey(),m.getValue());
            }
        }




        int[] d = {600, 500, 100, 5, 2, 1};
        System.out.println(Arrays.binarySearch(d, 1));


        f(500,500,100);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(80);
        treeSet.add(2);
        treeSet.add(2);
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(6);
        // 2 6 80
        for(Integer i: treeSet) {
            System.out.println(i); // 2 6 80
        }
        System.out.println("------------");
        TreeSet<Integer> treeSet1 = new TreeSet<>(new IntCmp());
        for(int i=1;i<=10;i++) {
            treeSet1.add(i);
        }
        for(Integer i: treeSet1) {
            System.out.println(i);
        }




        ArrayList<String> list2 = new ArrayList<>();

        int[] x = new int[5];
        for(int i=0; i< x.length;  i++) {
            System.out.println(x[i]); // 0 0 0 0 0
        }

        Integer[] y = new Integer[5];
        for(int i=0; i< x.length;  i++) {
            System.out.println(y[i]); // null ....
        }

        Object[] objects = new Object[3];
        objects[0] = 123;
        objects[1] = "w234234";
        objects[2] = 344.4f;

        Product[] products = new Product[3];
        products[0] = new Apple();
        products[1] = new Banana();

        A arr = new A();
        arr.add(2); arr.add(1); arr.add(3);
        for (Integer k : arr){
            System.out.println(k);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(Integer i: arrayList) {

        }
        LinkedList linkedList = new LinkedList();


    }
}
class A implements Iterable<Integer>{
    ArrayList<Integer> a = new ArrayList<>();
    void add(Integer e) {
        a.add(e);
    }

    @Override
    public Iterator<Integer> iterator() {
        return a.iterator();
    }
}
class Product {

}
class Apple extends Product {

}
class Banana extends Product {

}
