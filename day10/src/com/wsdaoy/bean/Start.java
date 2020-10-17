package com.wsdaoy.bean;

import com.wsdaoy.service.Task;

public class Start {
    private Task task;

    public Start (Task task){
        this.task = task;
    }

    public void run(){
        //执行task任务
        task.task();
    }
}
