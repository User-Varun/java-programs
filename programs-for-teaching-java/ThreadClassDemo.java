class th1 extends Thread{
    public void run(){
        while(true){
            System.out.print("hello");

        }
        
    }
}

class th2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Bye");
        }
    }
}

class ThreadClassDemo {
    public static void main(String args[]) {
        th1 t1 = new th1();
        th2 t2 = new th2();
        
        t1.start();
        t2.start();
    }
}