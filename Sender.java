import java.nio.file.Path;

import static java.lang.Thread.sleep;

public class Sender {
    public void send(String msg)
    {
        System.out.println("Sending\t"  + msg );
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Exception");
        }
        System.out.println("\n" + msg + "Sent");
    }
}

