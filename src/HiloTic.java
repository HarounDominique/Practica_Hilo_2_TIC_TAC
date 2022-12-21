public class HiloTic extends Thread{
    public HiloTic() {
        super("TIC");
    }

    public void run(){
        while(true){
            System.out.println(getName());
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
