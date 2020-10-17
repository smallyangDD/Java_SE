package com.wsdaoy;

import com.wsdaoy.bean.Worker;

import java.util.ArrayList;

public class Test07 {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        Worker w1 = new Worker("bz001", "黄渤", 45);
        Worker w2 = new Worker("bz002", "孙红雷", 48);
        Worker w3 = new Worker("bz003", "罗志祥", 35);

        workers.add(w1);
        workers.add(w2);
        workers.add(w3);

        findMaxAge(workers);
    }

    public static void findMaxAge(ArrayList<Worker> workers){
        Worker maxAgeWorker = workers.get(0);
        for (int i = 1; i < workers.size(); i++) {
            if(workers.get(i).getAge() > maxAgeWorker.getAge()){
                maxAgeWorker = workers.get(i);
            }
        }
        maxAgeWorker.show();
    }
}
