package com.ncc.JavaCore.Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountThread countThread = new CountThread();
        countThread.start();
//        ĐỢI 1S NHÉ
        Thread.sleep(10000);

        System.out.println("kết thúc chương trình");


    }

}
class CountThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                // đợi 100ms giữa mỗi lần đếm
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
//    Khi thread run nó sẽ có nhiều trạng thái thực thi khác nhau :
//    New: Thread được tạo ra nhưng chưa được bắt đầu thực thi
//    Runnable : Thread đã được bắt đầu thực thi và đang chạy theo lịch của hệ thống
//    Blocked: Thread bị chặn bởi một tài nguyên hoặc một hoạt động đợi, chặng hạn như đợi một lock
//    Waiting : thread đang đợi tín hiệu từ một thread khác để tiếp tục thực thi
//    Time Waiting: thread đang đợi một khoảng thời gian nhất định để tiếp tục thực thi
//    Terminated: Thread đã kết thúc thực thi và không bắt đầu lại
}
