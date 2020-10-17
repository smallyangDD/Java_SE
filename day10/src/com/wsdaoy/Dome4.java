package com.wsdaoy;

import com.wsdaoy.bean.Start;
import com.wsdaoy.service.Task;

public class Dome4 {
    public static void main(String[] args) {
        new Start(new Task() {
            @Override
            public void task() {
                System.out.println("开始任务了！");
            }

        }).run();

        new Start(() -> System.out.println("任务2启动了！")).run();
    }
}
