package ds.predefined;

import oops.Dog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollDemo {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>(); // stores only unique values
        nums.add(10);
        nums.add(20);
        nums.add(20);
        nums.add(50);
        System.out.println(nums.size());

        Set<String> cities = new HashSet<>();
        cities.add("chennai");
        cities.add("madurai");
        cities.add("chennai");

        Set<Dog> dogSet = new HashSet<>();

        dogSet.add(new Dog("xyz", 23));

        HashMap<Integer, String> hash = new HashMap<>(); // key, value store
        hash.put(10, "Ritheen");
        hash.put(20, "Arjun");
        hash.put(25, "Raja");

       List<String> v =  hash.values().stream().distinct().toList();
        for(String s : v)
            System.out.println(s);

        System.out.println( hash.get(25));


        HashMap<String, String> hash1 = new HashMap<>();
        hash1.put("c1", "Chennai");
        hash1.put("c2", "salem");
        hash1.put("s3", "madurai");


        HashMap<String, Dog> hashObj = new HashMap<>();
        Dog d1 = new Dog("abc", 12);
        hashObj.put("f1", d1);


    }
}
