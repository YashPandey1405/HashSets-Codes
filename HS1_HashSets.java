import java.util.*;

public class HS1_HashSets {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();

        // Insert-->O(1).....
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(4);
        set.add(1);
        set.add(2);
        // System.out.println("Insert --> THE HASHSET IS ::: " + set);

        // Remove-->O(1).....
        // System.out.println();
        // System.out.println("Remove --> 2 ::: " + set.remove(2));
        // System.out.println("Remove --> 3 ::: " + set.remove(3));
        // System.out.println("Remove --> THE HASHSET IS ::: " + set);

        // Size-->O(1).....
        // System.out.println("THE SIZE OF HASHSET IS ::: " + set.size());

        // IsEmpty-->O(1).....
        // set.clear(); // To Make Our Hashset Empty.....
        // System.out.println("HASHSET IS EMPTY ::: " + set.isEmpty());

        // Iteration On HashSet [Method(I)]--> Using Inbuilt Iterater in JCF....
        // System.out.print("THE ELEMENTS IN HASHSET ARE ::: ");
        // Iterator itr = set.iterator(); // Inbuilt Iterator In JCF.....
        // while (itr.hasNext()) {
        // System.out.print(itr.next() + " ");
        // }
        // System.out.println();

        // Iteration On HashSet [Method(II)]--> Using Advanced Iterater in JCF....
        // System.out.print("THE ELEMENTS IN HASHSET ARE ::: ");
        // for (Integer Element : set) { // Use Of For-Each Loop For Iteration....
        // System.out.print(Element + " ");
        // }
        // System.out.println();
    }
}
