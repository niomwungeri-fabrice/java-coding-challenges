package edu.miu.technicalInterview.OneOOP.poly;

public class Tesla implements Car{
    @Override
    public void start() {
       System.out.println("Implementation of how to start a tesla car");
    }

    @Override
    public void stop() {
        System.out.println("Implementation of how to stop a tesla car");
    }

     protected void drive(){
        System.out.println("---88888888888---");
    }
}
