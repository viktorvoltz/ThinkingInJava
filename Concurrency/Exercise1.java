class Runner1 implements Runnable{
    public Runner1(){
        System.out.println("Runner Const1");
    }

    @Override
    public void run(){
        for(int i = 0; i < 3; i++){
            System.out.println("execution1");
            Thread.yield();
        }
        System.out.println("done1");
        return;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
		Thread t = new Thread(new Runner1());
		t.start();
	}
}
