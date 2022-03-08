package edu.miu.technicalInterview.OneOOP.poly;

public class MainApp {
     public static void main(String[] args) {
       Car bmw = new BMW();
       Car tesla = new Tesla();

       bmw.start();
       tesla.start();

       bmw.stop();
       tesla.stop();

       new Tesla().drive();
    }  
}
