package test;

import java.util.ArrayList;

public class ThreadTestTwo {

    public static void main(String [] args){
        ThreadTwoUtil threadTwoUtil = new ThreadTwoUtil();
        threadTwoUtil.start();
    }
}

class ThreadTwoUtil extends Thread{

     public void run() {
         try {

             while(true){
                 Thread.sleep(2000);
                 synchronized (this){
                     System.out.println("1");
                 }
             }
         } catch (InterruptedException e) {
             e.printStackTrace();
         }


    }

}
