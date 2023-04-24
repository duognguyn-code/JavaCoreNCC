package com.ncc.JavaCore.Interface;

public interface MoveInterface {
     public void  run123456();
//     Một class implement interface MoveInterface nó không bắt buộc phải implement phương thức default
     default void log(String str){
          System.out.println("This method is default implementation" + str);
     }
//     Phương thức static rất hữu ích trong việc cung cấp các phương thức tiện ích, ví dụ như là kiểm tra null, sắp xếp tập hợp, v.v…
//     Phương thức static giúp chúng ta bảo mật, không cho phép class implements từ nó có thể override
     static void myStaticMethod() {
          System.out.println("Đây là phương thức tĩnh trong interface.");
     }
}
