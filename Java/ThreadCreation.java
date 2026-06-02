class threads extends Thread{
    public void run(){
        for(int i=1;i<=20;i++)
        {
            System.out.println("Hello");
        }
   
    }
}
class ThreadCreation{
    public static void main(String args[])
    {
        Thread t1=new threads();
        t1.start();
        Thread t2=new threads();
        t2.start();
    }
}
