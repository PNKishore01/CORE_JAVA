import java.util.*;
class OneAL{

    public static void main(String[] args){

        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(90);
        l.add(60);
        l.add(30);//adding
        System.out.println(l);
        System.out.println("Size: " + l.size()); //size of list
        System.out.println("Empty or not: " + l.isEmpty());
        l.add(2,50);//adding at index
        l.remove(2);//removing with object
        System.out.println(l);
        l.add(70);
        l.remove(2);//removing with index
         System.out.println(l);
        System.out.println("Valur at index: " + l.get(2));//retriving(or)getting value
        System.out.println(l);
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);l2.add(4);l2.add(7);
         System.out.println(l2);
         System.out.println("Adding another list to l2: ");
        l2.addAll(l); //we can also mention specific index also l2.addAll(2,l);
         System.out.println(l2);
    }
}