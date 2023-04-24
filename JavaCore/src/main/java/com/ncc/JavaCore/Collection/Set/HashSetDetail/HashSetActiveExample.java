//package com.ncc.JavaCore.Collection;
//
//import java.util.AbstractSet;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.HashSet;
//
//public class HashSetActiveExample<E> extends AbstractSet<E> implements Set<E>, Cloneable, java.io.Serializable {
//    private transient HashMap<E, Object> map;
//    private static final Object PRESENT = new Object();
//    public HashSetActiveExample(){
//        map =  new HashMap<>();
//    }
//    public HashSet(Collection<?  extends  E> c){
//        map = new HashMap<>(Math.max((int)(c.size()/.75f) + 1,16));
//    }
////    Nó được sử dụng để xây dựng HashSet trống có dung lượng ban đầu được chỉ định và hệ số tải được chỉ định.
//    public HashSet(int initialCapacity, float loadFactor){
//        map = new HashMap<>(initialCapacity, loadFactor);
//
//    }
////    Nó được sử dụng để xây dựng một HashSet trống với dung lượng ban đầu được chỉ định và hệ số tải mặc định là 0,7
//    public HashSet(int initialCapacity) {
//        map = new HashMap<>(initialCapacity);
//    }
//
//    HashSet(int initialCapacity, float loadFactor, boolean dummy) {
//        map = new LinkedHashMap<>(initialCapacity, loadFactor);
//    }
//
//}
