package myApp.smartkeypad;

import java.io.*;
import java.net.*;


class SocketConnection implements Runnable
{
    public static Socket socket;
    public static DataOutputStream dout;
    public static InetSocketAddress socketAddress;

    public SocketConnection(){}

    public void run()
    {
        /* -- Choosing the ip address and the port on which the client will connect on the server -- */
        socketAddress = new InetSocketAddress("192.168.42.126", 31415);

        try
        {
            /* -- Creating the socket and connect to the server socket -- */
            socket = new Socket();
            socket.connect(socketAddress);

            /* -- Making the text sent on the socket -- */
            dout = new DataOutputStream(socket.getOutputStream());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}