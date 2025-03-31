package runnableInterface;

public class RunnableInterfaceDemo extends Thread {
    public void main(String[] args) {

        NumberPrinter numberPrinter = new NumberPrinter();
        Thread thread = new Thread(numberPrinter);

        thread.start();
    }
    class NumberPrinter implements Runnable{
        @Override
        public void run() {

            for (int i = 1; i < 6; i++) {
                System.out.println(i);

                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
