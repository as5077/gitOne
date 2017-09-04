package publicUtil;

/**
 * Created by suibian on 2017/8/24.
 */
public class PublicUtil {
    public void  test(){
        System.out.println("1111");
    }

    public static void main(String [] args){
        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(">>>>>>>");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}


class Test extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("!!!!!!!!");
    }
}