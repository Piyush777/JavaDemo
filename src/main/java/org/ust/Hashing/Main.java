package org.ust.Hashing;

import java.util.HashMap;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Apple",10);
        hashMap.put("Banana",20);
        hashMap.put("Orange",30);

        int value1,value2,value3;
        value1= hashMap.get("Orange");
        value2= hashMap.get("Banana");
        value3= hashMap.get("Apple");

        System.out.println(value1+" "+value2+" "+ value3);

        boolean isAppleExists = hashMap.containsKey("Apple");
        boolean isKiwiExists  = hashMap.containsKey("Kiwi");
        System.out.println("Is Apple present ? "+ isAppleExists);
        System.out.println("Is Kiwi present ? "+ isKiwiExists);

        Integer valueApple = hashMap.get("Apple");
        Integer valueKiwi = hashMap.get("Kiwi");

        if(Objects.nonNull(valueApple)){
            System.out.println("value of Apple "+ valueApple);
        }else{
            System.out.println("Apple not present");
        }

        if(Objects.nonNull(valueKiwi)){
            System.out.println("value of Kiwi "+ valueKiwi);
        }else{
            System.out.println("Kiwi not present");
        }

        System.out.println(hashMap);

        for(String key: hashMap.keySet()){

            System.out.println(key+" "+ (hashMap.get(key)+5));
        }

    }
}