public class ThreadSend extends Thread{
    private final String msg;
    Sender sender;
    
    ThreadSend(String m,  Sender obj)
    {
        msg = m;
        sender = obj;
    }

    public void run()
    {
        synchronized(sender)
        {
            sender.send(msg);
        }
    }
}
