public class HiloTac extends Thread{
    public HiloTac() {
        super("TAC");
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