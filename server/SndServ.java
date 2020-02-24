import java.io.*;
import java.net.*;
import java.util.*;

public class SndServ
{
	public static void main(String[] args)
	{
		ServerSocket serverSocket;
		Socket clientConnection;
		int portSocket = 31415; // < the port of the server socket

		try
		{
			/* -- The port on which the socket will connect -- */
			serverSocket = new ServerSocket(portSocket);
			System.out.println("Server started...");

			System.out.println("Waiting a client...");

			/* -- Accepting the connection between both socket (client and server) -- */
			clientConnection = serverSocket.accept();
			System.out.println("Client connected...");

			/* -- Managing data from get in or get out the server socket -- */
			DataInputStream din = new DataInputStream(clientConnection.getInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dout = new DataOutputStream(clientConnection.getOutputStream());

			dout.flush();

			String text;

			/* -- Opening the terminal -- */
			Runtime app = Runtime.getRuntime();

			/* -- While both socket are connected together -- */
			while(clientConnection.isConnected() == true)
			{
				/* -- read text received on the server and print in -- */
				text = din.readUTF();
				System.out.println(text);

				/* -- and if the text is equal to "firefox" then open it by writing the command on the terminal -- */
				if(text.equals("firefox"))
				{
					try
					{
						System.out.println("Opening mozilla firefox...");
						app.exec("firefox");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				} else{}

				/* -- and if the text is equal to "scribus" then open it by writing the command on the terminal -- */
				if(text.equals("scribus"))
				{
					try
					{
						System.out.println("Opening scribus...");
						app.exec("scribus");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				} else{}
/* -- ________________________________________________________________________________________ -- */

				/* -- and if the text is equal to "files" then open it by writing the command on the terminal -- */
				if(text.equals("files"))
				{
					try
					{
						System.out.println("Opening files...");
						app.exec("nautilus");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				} else{}

				/* -- and if the text is equal to "atom-beta" then open it by writing the command on the terminal -- */
				if(text.equals("atom-beta"))
				{
					try
					{
						System.out.println("Opening atom-beta...");
						app.exec("atom-beta");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				} else{}

				/* -- and if the text is equal to "textEditor" then open it by writing the command on the terminal -- */
				if(text.equals("textEditor"))
				{
					try
					{
						System.out.println("Opening textEditor...");
						app.exec("gedit");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				} else{}
/* -- ________________________________________________________________________________________ -- */

				/* -- and if the text is equal to "terminal" then open it by writing the command on the terminal -- */
				if(text.equals("terminal"))
				{
					try
					{
						System.out.println("Opening terminal...");
						app.exec("gnome-terminal");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				} else{}

				/* -- and if the text is equal to "gimp" then open it by writing the command on the terminal -- */
				if(text.equals("gimp"))
				{
					try
					{
						System.out.println("Opening gimp...");
						app.exec("gimp");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				} else{}

				/* -- and if the text is equal to "packageManager" then open it by writing the command on the terminal -- */
				if(text.equals("packageManager"))
				{
					try
					{
						System.out.println("Opening packageManager...");
						app.exec("synaptic");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				} else{}
/* -- ________________________________________________________________________________________ -- */

				/* -- and if the text is equal to "vsCode" then open it by writing the command on the terminal -- */
				if(text.equals("vsCode"))
				{
					try
					{
						System.out.println("Opening vsCode...");
						app.exec("code");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				} else{}

				/* -- and if the text is equal to "inkScape" then open it by writing the command on the terminal -- */
				if(text.equals("inkScape"))
				{
					try
					{
						System.out.println("Opening inkScape...");
						app.exec("inkcape");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				} else{}

				/* -- and if the text is equal to "settings" then open it by writing the command on the terminal -- */
				if(text.equals("settings"))
				{
					try
					{
						System.out.println("Opening settings...");
						app.exec("unity-control-center");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				} else{}
/* -- ________________________________________________________________________________________ -- */

				/* -- and if the text is equal to "calc" then open it by writing the command on the terminal -- */
				if(text.equals("calc"))
				{
					try
					{
						System.out.println("Opening calculator...");
						app.exec("gnome-calculator");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				} else{}

				/* -- and if the text is equal to "libreOffice" then open it by writing the command on the terminal -- */
				if(text.equals("libreOffice"))
				{
					try
					{
						System.out.println("Opening libreOffice...");
						app.exec("libreoffice");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				} else{}

				/* -- and if the text is equal to "mobileFiles" then open it by writing the command on the terminal -- */
				if(text.equals("mobileFiles"))
				{
					try
					{
						System.out.println("Opening mobileFiles...");
						app.exec("mobileFiles");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				} else{}
			}
		/*	din.close();
			clientConnection.close();
			serverSocket.close();*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}