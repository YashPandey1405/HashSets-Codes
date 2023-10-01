import java.util.*;

public class HS3_LinkedHashSets {
    public static void main(String args[]) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Insert-->O(1).....
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(4);
        set.add(1);
        set.add(2);
        // System.out.println("Insert --> THE LINKED-HASHSET IS ::: " + set);

        // Remove-->O(1).....
        // System.out.println();
        // System.out.println("Remove --> 2 ::: " + set.remove(2));
        // System.out.println("Remove --> 3 ::: " + set.remove(3));
        // System.out.println("Remove --> THE LINKED-HASHSET IS ::: " + set);
        // System.out.println();

        // Size-->O(1).....
        // System.out.println("THE SIZE OF LINKED-HASHSET IS ::: " + set.size());

        // IsEmpty-->O(1).....
        // // set.clear(); // To Make Our Linked-Hashset Empty.....
        // System.out.println("LINKED-HASHSET IS EMPTY ::: " + set.isEmpty());
        // System.out.println();

        // Iteration On Linked-HashSet [Method(I)]--> Using Inbuilt Iterater in JCF....
        // System.out.print("THE ELEMENTS IN LINKED-HASHSET ARE ::: ");
        // Iterator itr = set.iterator(); // Inbuilt Iterator In JCF.....
        // while (itr.hasNext()) {
        // System.out.print(itr.next() + " ");
        // }
        // System.out.println();

        // Iteration On Linked-HashSet [Method(II)]--> Using Advanced For Loop....
        // System.out.print("THE ELEMENTS IN LINKED-HASHSET ARE ::: ");
        // for (Integer Element : set) { // Use Of For-Each Loop For Iteration....
        // System.out.print(Element + " ");
        // }
        // System.out.println();
    }
}