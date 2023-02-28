package fa.training.hashsetdemo;

import java.util.HashSet;
import java.util.Set;

/**
 * Get data from HashSet
 *
 * @author SonDT21
 */

public class HashSetCreationExample {
    /**
     * Create a HashSet
     */

    public void createHashSet() {
        System.out.println("createHashSet() !!!");
        Set<String> brands = new HashSet<>();

        brands.add("Wilson");
        brands.add("Nike");
        brands.add("Volvo");
        brands.add("IBM");
        brands.add("IBM");

        int nOfElements = brands.size();
        System.out.format("The set contains %d elements%n", nOfElements);
        System.out.println(brands);
    }
}