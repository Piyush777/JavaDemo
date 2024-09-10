package org.ust.Abstraction;

import java.util.HashSet;

public class StringPractice {

    public static void main(String[] args) {

        String input = "critical;stable;critical;stable;critical";
        int count=0;
        /*
        String []result = input.split(";");
        int count=0;
        for(String output:result){
            if(output.equals("critical")){
                count++;
            }
        }
        System.out.println(count);

         */
        if(input.charAt(0)=='c'){
            count++;
        }
        for(int index=1;index<input.length();++index){
            if(input.charAt(index)==';'){
                if(input.charAt(index+1)=='c'){
                    count++;
                }
            }
        }
        System.out.println(count);


        int inputKeyboard[]={3,2,4,6};

        int x=2;int n=inputKeyboard.length;
        //x,x+1,x+2...x+n-1
        HashSet<Integer> numSet = new HashSet<>();

        for(int num:inputKeyboard){
            numSet.add(num);
        }
        count=0;
        for(int i=x;i<x+n;++i){
            if(!numSet.contains(i)){
                count++;
            }
        }
        System.out.println("Missing keyboard "+count);








    }
}
