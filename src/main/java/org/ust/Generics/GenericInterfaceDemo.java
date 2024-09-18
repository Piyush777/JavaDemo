package org.ust.Generics;

public class GenericInterfaceDemo {

    interface Pair<K,V>{
        public K getKey();
        public V getValue();
    }

    static class OrderedPair<K,V> implements Pair<K,V>{

        private K key;
        private V value;

        public OrderedPair(K key, V value){

            this.key=key;
            this.value=value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Pair<String,Integer> p1 = new OrderedPair<>("One",1);

        Pair<String,String> p2 = new OrderedPair<>("Hello","World");

        System.out.println("P1");
        System.out.println(p1.getKey() +" : "+ p1.getValue());

        System.out.println("P2");
        System.out.println(p2.getKey() +" : "+ p2.getValue());
    }
}
