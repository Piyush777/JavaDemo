package org.ust.Hashing;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        boolean add10FirstTime = hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        boolean add10SecondTime =hashSet.add(10);
        boolean add10ThirdTime =hashSet.add(10);



        boolean is10Present = hashSet.contains(10);
        boolean is50Present = hashSet.contains(50);

        System.out.println("is10Present ? "+is10Present);
        System.out.println("is50Present ? "+is50Present);

        for(int key: hashSet){
            System.out.println(key);
        }
    }
}
