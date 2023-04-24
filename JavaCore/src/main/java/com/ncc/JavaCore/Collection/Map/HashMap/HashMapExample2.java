//package com.ncc.JavaCore.Collection.Map.HashMap;
//
//import com.ncc.JavaCore.Collection.List.ArrayList;
//
//public class HashMapExample2 {
//
//    private class Data{
//        int key;
//        int value;
//        Data(int key, int value){
//            this.key = key;
//            this.value = value;
//        }
//
//        @Override
//        public boolean equals(Object other) {
//            if(other instanceof Data){
//                return this.key == ((Data)other).key;
//            }
//            return false;
//        }
//    }
//    private final int SIZE = 1000;
//    private ArrayList<Data> myBuckets[];
//    public HashSetExample2(){
//        myBuckets = new ArrayList[SIZE];
//        for (int i = 0; i < myBuckets.length; i++) {
//            myBuckets[i] = new ArrayList<>();
//        }
//
//    }
//    private int hashFunction(int key){
//        return key % SIZE;
//    }
//    public void put(int key, int value){
//
//        int hashValueIndex = hashFunction(key);
//        var bucket = myBuckets[hashValueIndex];
//        Data temp = new Data(key, 0);
//        int keyIndex = bucket.indexOf(temp);
//        if(keyIndex >= 0){
//            bucket.get(keyIndex).value = value;
//        }else{
//            bucket.add(temp);
//        }
//    }
//    public int get(int key){
//        return 1;
//
//    }
//
//    public static void main(String[] args) {
//        HashMapExample2 mExample2 = new HashMapExample2();
//        mExample2.put(1, 1);
//        mExample2.put(1, 2);
//        mExample2.put(10,2);
//    }
//
//
//}
