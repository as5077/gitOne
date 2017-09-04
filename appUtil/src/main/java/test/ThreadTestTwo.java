package test;

import java.util.ArrayList;

public class ThreadTestTwo {

    public static void main(String [] args){
        ThreadTwoUtil threadTwoUtil = new ThreadTwoUtil();
        Thread thread = new Thread(threadTwoUtil);
        thread.start();
        ArrayList<String> arrayList = new ArrayList<String>(20);

    }
}

class ThreadTwoUtil implements Runnable{

     public void run() {
        System.out.println("1");
    }

}
