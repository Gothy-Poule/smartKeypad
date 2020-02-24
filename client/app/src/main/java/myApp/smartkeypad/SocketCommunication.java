package myApp.smartkeypad;

public class SocketCommunication implements Runnable
{
    public SocketCommunication(){}

    public void run()
    {
        try
        {
            /* -- If the connection between both socket is established -- */
            while(SocketConnection.socket.isConnected() == true)
            {
                /* -- and if the "text_command" var contains something -- */
                if (MainActivity.text_command.isEmpty() == false)
                {
                    /* -- then send the "text_command" var to the socket -- */
                    SocketConnection.dout.writeUTF(MainActivity.text_command);
                    MainActivity.text_command = "";
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
