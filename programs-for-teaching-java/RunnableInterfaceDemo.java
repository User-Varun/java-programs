class th1 implements Runnable{
    public void run(){
        while(true){
            System.out.print("hello");

        }
        
    }
}

class th2 implements Runnable{
    public void run() {
        while (true) {
            System.out.println("Bye");
        }
    }
}

class RunnableInterfaceDemo {
    public static void main(String args[]) {
        th1 t1 = new th1();
        th2 t2 = new th2();
        

        Thread p1 = new Thread(t1);
        Thread p2 = new Thread(t2);

        p1.start();
        p2.start();
    }
}