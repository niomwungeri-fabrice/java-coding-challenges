package edu.miu.technicalInterview.OneOOP.poly;


public class BMW implements Car{

    @Override
    public void start() {
       System.out.println("Implementation of how to start a bmw car");
    }

    @Override
    public void stop() {
        System.out.println("Implementation of how to stop a bmw car");
    }
    
}
