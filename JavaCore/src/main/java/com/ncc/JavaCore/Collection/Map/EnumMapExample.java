package com.ncc.JavaCore.Collection.Map;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedList;

public class EnumMapExample {
    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

    public static void main(String[] args) {
        // Khởi tạo một đối tượng EnumMap mới với kiểu key là enum Day và value là String
        EnumMap<Day, String> enumMap = new EnumMap<Day, String>(Day.class);

        // Thêm các phần tử vào EnumMap
        enumMap.put(Day.MONDAY, "Thứ hai là ngày đầu tuần");
        enumMap.put(Day.TUESDAY, "thứ ba là ngày thứu hai cộng một");
        enumMap.put(Day.WEDNESDAY, "thứ 4 là một số xấu");
        enumMap.put(Day.THURSDAY, "thứ 5 xuwsg đág nghỉ làm");
        enumMap.put(Day.FRIDAY, "thứ 6 là ngày gần cuối đc nghỉ ");
        enumMap.put(Day.SATURDAY, "Saturday yayyyy");
        enumMap.put(Day.SUNDAY, "sau sunday thì phải đi làm");




        // Hiển thị EnumMap
        System.out.println("EnumMap: " + enumMap);

        // Lấy giá trị tương ứng với key Day.MONDAY
        String dayName = enumMap.get(Day.MONDAY);
        System.out.println("Day name of MONDAY: " + dayName);

        // Xóa phần tử có key Day.WEDNESDAY
        enumMap.remove(Day.WEDNESDAY);

        // Hiển thị EnumMap sau khi xóa phần tử
        System.out.println("EnumMap after removing WEDNESDAY: " + enumMap);
    }
}
