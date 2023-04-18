package com.ncc.JavaCore.Collection.Set;

import java.util.Set;


public class EnumSet {
    enum  Days{
        SUNDAY, MONDAY, TUESDAY, WEBNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Set<Days> set1 = java.util.EnumSet.of(Days.MONDAY, Days.TUESDAY);
        System.out.println(set1);

        Set<Days> set2 = java.util.EnumSet.allOf(Days.class);
        System.out.println(set2);

        Set<Days> set3 = java.util.EnumSet.noneOf(Days.class);

        System.out.println(set3);
    }
}
