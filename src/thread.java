/**
 * Created by danawacomputer on 2017-05-16.
 */
public class thread {
    public static void main(String[] args){
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }

    static class ThreadEx1_1 extends Thread{
        public void run(){
            for(int i = 0; i < 5; i++){
                System.out.println(getName());
            }
        }
    }

    static class ThreadEx1_2 implements Runnable{

        @Override
        public void run() {
            for(int i=0; i<5; i++){
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
