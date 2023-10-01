import java.util.*;

public class HS5_Union_And_Intsect {
    public static void main(String args[]) {
        HashSet<Integer> UnionSet = new HashSet<>();

        // Union.....
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        for (int i = 0; i < arr1.length; i++) {
            UnionSet.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            UnionSet.add(arr2[i]);
        }
        System.out.print("THE ELEMENTS IN UNION ARE ::: [ ");
        Iterator itr = UnionSet.iterator(); // Inbuilt Iterator In JCF.....
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("]");
        System.out.println("THE UNION OF 2 ARRAY CONTAINS ::: " + UnionSet.size() + " ELEMENS");
        System.out.println();

        // Intersection....
        UnionSet.clear();
        for (int i = 0; i < arr1.length; i++) {
            UnionSet.add(arr1[i]);
        }
        System.out.print("THE ELEMENTS IN INTERSECTION ARE ::: [ ");
        int IntSectCount = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (UnionSet.contains(arr2[i])) {
                IntSectCount++;
                System.out.print(arr2[i] + " ");
                UnionSet.remove(arr2[i]);
            }
        }
        System.out.println("]");
        System.out.println("THE INTERSECTION OF 2 ARRAY CONTAINS ::: " + IntSectCount + " ELEMENS");
    }
}
