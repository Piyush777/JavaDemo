package org.ust.Hashing;

import java.util.HashSet;

public class FindPairs {

    public static void main(String[] args) {

        int arr[]={-2,1,3,2,4,5,0,-1,6,7};
        HashSet<Integer> hashSet = new HashSet<>();
        int targetSum = 5;
        for(int num: arr){
            if(hashSet.contains(targetSum-num)){
                System.out.println(num+" "+ (targetSum-num));
                hashSet.add(num);
            }else{
                hashSet.add(num);
            }
        }
    }
}
