class MySmpThread extends Thread{
    public static int myCount = 3;
    public void run(){
        while(MySmpThread.myCount <= 3){
            try{
                System.out.println("sri chaitanya: "+(++MySmpThread.myCount));
                Thread.sleep(100);
            } catch (Exception e) {
                //System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    }
}
public class RunThread {
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
       // MySmpThread mst = new MySmpThread();
       // mst.start();
        while(MySmpThread.myCount <= 3){
            try{
                System.out.println("Main Thread: "+(++MySmpThread.myCount));
                Thread.sleep(100);
            } catch (Exception e){
                //System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        //System.out.println("End of fee structure.");
    }
}

