package myApp.smartkeypad;

import android.content.Context;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity
{
    /* -- Every ImageView as buttons from the content.main layout -- */
    private ImageView button_firefox;         private ImageView button_scribus;

    private ImageView button_files;       private ImageView button_atom;            private ImageView button_textEditor;

    private ImageView button_terminal;    private ImageView button_gimp;            private ImageView button_packageManager;

    private ImageView button_vsCode;      private ImageView button_inkScape;        private ImageView button_settings;

    private ImageView button_calc;        private ImageView button_libreOffice;     private ImageView button_mobileFiles;

    private Context context;

    /* -- Every String for button's onClick method -- */
    public static String text_firefox = "firefox";              public static String text_scribus = "scribus";          public static String text_mobileFiles = "mobile files can't be opened";

    public static String text_files = "files";                  public static String text_atom = "atom";                public static String text_textEditor = "gedit";

    public static String text_terminal = "terminal";            public static String text_gimp = "gimp";                public static String text_packageManager = "synaptic";

    public static String text_vsCode = "visual studio code";    public static String text_inkScape = "inkScape";        public static String text_settings = "settings";

    public static String text_calc = "calculator";              public static String text_libreOffice = "libre office";

    public String toast = "is starting...";
    public static String text_command;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* -- Establish the connection of the client socket -- */
        Thread socketConnection = new Thread(new SocketConnection());
        socketConnection.start();

        context = this.getApplicationContext();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /* -- ImageView button from layout -- */
        button_firefox = (ImageView) findViewById(R.id.icons_mozilla);
        button_scribus = (ImageView) findViewById(R.id.icons_scribus);

        button_files = (ImageView) findViewById(R.id.icons_files);
        button_atom = (ImageView) findViewById(R.id.icons_atom);
        button_textEditor = (ImageView) findViewById(R.id.icons_texteditor);

        button_terminal = (ImageView) findViewById(R.id.icons_terminal);
        button_gimp = (ImageView) findViewById(R.id.icons_gimp);
        button_packageManager = (ImageView) findViewById(R.id.icons_packagemanager);

        button_vsCode = (ImageView) findViewById(R.id.icons_vscode);
        button_inkScape = (ImageView) findViewById(R.id.icons_inkscape);
        button_settings = (ImageView) findViewById(R.id.icons_settings);

        button_calc = (ImageView) findViewById(R.id.icons_calculator);
        button_libreOffice = (ImageView) findViewById(R.id.icons_libreoffice);
        button_mobileFiles = (ImageView) findViewById(R.id.icons_mobile);

        /* -- Prepare the communication side of the client socket -- */
        final Thread socketCommunication = new Thread(new SocketCommunication());

        /* -- Button to send "FIREFOX" text to the communication side of the socket -- */
        button_firefox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                /* -- If the communication side of the socket is alive -- */
                if(socketCommunication.isAlive() == true)
                {
                    /* -- send firefox, make a toast to appear on the application -- */
                    text_command = "firefox";
                    Toast.makeText(getApplicationContext(), text_firefox +" "+ toast, Toast.LENGTH_SHORT).show();

                    /* -- and close the communication side of the socket -- */
                    socketCommunication.interrupt();
                }
                /* -- But if the communication side of the socket is already interrupted -- */
                else
                {
                    /* -- start the communication side of the socket first -- */
                    socketCommunication.start();
                    text_command = "firefox";
                    Toast.makeText(getApplicationContext(), text_firefox +" "+ toast, Toast.LENGTH_SHORT).show();

                    socketCommunication.interrupt();
                }
            }
        });

        /* -- Button to send "SCRIBUS" text to the communication side of the socket -- */
        button_scribus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* -- If the communication side of the socket is alive -- */
                if(socketCommunication.isAlive() == true)
                {
                    /* -- send scribus, make a toast to appear on the application -- */
                    text_command = "scribus";
                    Toast.makeText(getApplicationContext(), text_scribus +" "+ toast, Toast.LENGTH_SHORT).show();

                    /* -- and close the communication side of the socket -- */
                    socketCommunication.interrupt();
                }
                /* -- But if the communication side of the socket is already interrupted -- */
                else
                {
                    /* -- start the communication side of the socket first -- */
                    socketCommunication.start();
                    text_command = "scribus";
                    Toast.makeText(getApplicationContext(), text_scribus +" "+ toast, Toast.LENGTH_SHORT).show();

                    socketCommunication.interrupt();
                }
            }
        });
        /* -- ________________________________________________________________________________________ -- */

        /* -- Button to send "FILES" text to the communication side of the socket -- */
        button_files.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* -- If the communication side of the socket is alive -- */
                if(socketCommunication.isAlive() == true)
                {
                    /* -- send files, make a toast to appear on the application -- */
                    text_command = "files";
                    Toast.makeText(getApplicationContext(), text_files +" "+ toast, Toast.LENGTH_SHORT).show();

                    /* -- and close the communication side of the socket -- */
                    socketCommunication.interrupt();
                }
                /* -- But if the communication side of the socket is already interrupted -- */
                else
                {
                    /* -- start the communication side of the socket first -- */
                    socketCommunication.start();
                    text_command = "files";
                    Toast.makeText(getApplicationContext(), text_files +" "+ toast, Toast.LENGTH_SHORT).show();

                    socketCommunication.interrupt();
                }
            }
        });

        /* -- Button to send "ATOM" text to the communication side of the socket -- */
        button_atom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* -- If the communication side of the socket is alive -- */
                if(socketCommunication.isAlive() == true)
                {
                    /* -- send atom, make a toast to appear on the application -- */
                    text_command = "atom";
                    Toast.makeText(getApplicationContext(), text_atom +" "+ toast, Toast.LENGTH_SHORT).show();

                    /* -- and close the communication side of the socket -- */
                    socketCommunication.interrupt();
                }
                /* -- But if the communication side of the socket is already interrupted -- */
                else
                {
                    /* -- start the communication side of the socket first -- */
                    socketCommunication.start();
                    text_command = "atom";
                    Toast.makeText(getApplicationContext(), text_atom +" "+ toast, Toast.LENGTH_SHORT).show();

                    socketCommunication.interrupt();
                }
            }
        });

        /* -- Button to send "TEXTEDITOR" text to the communication side of the socket -- */
        button_textEditor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* -- If the communication side of the socket is alive -- */
                if(socketCommunication.isAlive() == true)
                {
                    /* -- send textEditor, make a toast to appear on the application -- */
                    text_command = "textEditor";
                    Toast.makeText(getApplicationContext(), text_textEditor +" "+ toast, Toast.LENGTH_SHORT).show();

                    /* -- and close the communication side of the socket -- */
                    socketCommunication.interrupt();
                }
                /* -- But if the communication side of the socket is already interrupted -- */
                else
                {
                    /* -- start the communication side of the socket first -- */
                    socketCommunication.start();
                    text_command = "textEditor";
                    Toast.makeText(getApplicationContext(), text_textEditor +" "+ toast, Toast.LENGTH_SHORT).show();

                    socketCommunication.interrupt();
                }
            }
        });
        /* -- ________________________________________________________________________________________ -- */

        /* -- Button to send "TERMINAL" text to the communication side of the socket -- */
        button_terminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* -- If the communication side of the socket is alive -- */
                if(socketCommunication.isAlive() == true)
                {
                    /* -- send terminal, make a toast to appear on the application -- */
                    text_command = "terminal";
                    Toast.makeText(getApplicationContext(), text_terminal +" "+ toast, Toast.LENGTH_SHORT).show();

                    /* -- and close the communication side of the socket -- */
                    socketCommunication.interrupt();
                }
                /* -- But if the communication side of the socket is already interrupted -- */
                else
                {
                    /* -- start the communication side of the socket first -- */
                    socketCommunication.start();
                    text_command = "terminal";
                    Toast.makeText(getApplicationContext(), text_terminal +" "+ toast, Toast.LENGTH_SHORT).show();

                    socketCommunication.interrupt();
                }
            }
        });

        /* -- Button to send "GIMP" text to the communication side of the socket -- */
        button_gimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* -- If the communication side of the socket is alive -- */
                if(socketCommunication.isAlive() == true)
                {
                    /* -- send gimp, make a toast to appear on the application -- */
                    text_command = "gimp";
                    Toast.makeText(getApplicationContext(), text_gimp +" "+ toast, Toast.LENGTH_SHORT).show();

                    /* -- and close the communication side of the socket -- */
                    socketCommunication.interrupt();
                }
                /* -- But if the communication side of the socket is already interrupted -- */
                else
                {
                    /* -- start the communication side of the socket first -- */
                    socketCommunication.start();
                    text_command = "gimp";
                    Toast.makeText(getApplicationContext(), text_gimp +" "+ toast, Toast.LENGTH_SHORT).show();

                    socketCommunication.interrupt();
                }
            }
        });

        /* -- Button to send "PACKAGEMANAGER" text to the communication side of the socket -- */
        button_packageManager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* -- If the communication side of the socket is alive -- */
                if(socketCommunication.isAlive() == true)
                {
                    /* -- send packageManager, make a toast to appear on the application -- */
                    text_command = "packageManager";
                    Toast.makeText(getApplicationContext(), text_packageManager +" "+ toast, Toast.LENGTH_SHORT).show();

                    /* -- and close the communication side of the socket -- */
                    socketCommunication.interrupt();
                }
                /* -- But if the communication side of the socket is already interrupted -- */
                else
                {
                    /* -- start the communication side of the socket first -- */
                    socketCommunication.start();
                    text_command = "packageManager";
                    Toast.makeText(getApplicationContext(), text_packageManager +" "+ toast, Toast.LENGTH_SHORT).show();

                    socketCommunication.interrupt();
                }
            }
        });
        /* -- ________________________________________________________________________________________ -- */

        /* -- Button to send "VSCODE" text to the communication side of the socket -- */
        button_vsCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* -- If the communication side of the socket is alive -- */
                if(socketCommunication.isAlive() == true)
                {
                    /* -- send vsCode, make a toast to appear on the application -- */
                    text_command = "vsCode";
                    Toast.makeText(getApplicationContext(), text_vsCode +" "+ toast, Toast.LENGTH_SHORT).show();

                    /* -- and close the communication side of the socket -- */
                    socketCommunication.interrupt();
                }
                /* -- But if the communication side of the socket is already interrupted -- */
                else
                {
                    /* -- start the communication side of the socket first -- */
                    socketCommunication.start();
                    text_command = "vsCode";
                    Toast.makeText(getApplicationContext(), text_vsCode +" "+ toast, Toast.LENGTH_SHORT).show();

                    socketCommunication.interrupt();
                }
            }
        });

        /* -- Button to send "INKSCAPE" text to the communication side of the socket -- */
        button_inkScape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* -- If the communication side of the socket is alive -- */
                if(socketCommunication.isAlive() == true)
                {
                    /* -- send inkScape, make a toast to appear on the application -- */
                    text_command = "inkScape";
                    Toast.makeText(getApplicationContext(), text_inkScape +" "+ toast, Toast.LENGTH_SHORT).show();

                    /* -- and close the communication side of the socket -- */
                    socketCommunication.interrupt();
                }
                /* -- But if the communication side of the socket is already interrupted -- */
                else
                {
                    /* -- start the communication side of the socket first -- */
                    socketCommunication.start();
                    text_command = "inkScape";
                    Toast.makeText(getApplicationContext(), text_inkScape +" "+ toast, Toast.LENGTH_SHORT).show();

                    socketCommunication.interrupt();
                }
            }
        });

        /* -- Button to send "SETTINGS" text to the communication side of the socket -- */
        button_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* -- If the communication side of the socket is alive -- */
                if(socketCommunication.isAlive() == true)
                {
                    /* -- send settings, make a toast to appear on the application -- */
                    text_command = "settings";
                    Toast.makeText(getApplicationContext(), text_settings +" "+ toast, Toast.LENGTH_SHORT).show();

                    /* -- and close the communication side of the socket -- */
                    socketCommunication.interrupt();
                }
                /* -- But if the communication side of the socket is already interrupted -- */
                else
                {
                    /* -- start the communication side of the socket first -- */
                    socketCommunication.start();
                    text_command = "settings";
                    Toast.makeText(getApplicationContext(), text_settings +" "+ toast, Toast.LENGTH_SHORT).show();

                    socketCommunication.interrupt();
                }
            }
        });
        /* -- ________________________________________________________________________________________ -- */

        /* -- Button to send "CALC" text to the communication side of the socket -- */
        button_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* -- If the communication side of the socket is alive -- */
                if(socketCommunication.isAlive() == true)
                {
                    /* -- send calc, make a toast to appear on the application -- */
                    text_command = "calc";
                    Toast.makeText(getApplicationContext(), text_calc +" "+ toast, Toast.LENGTH_SHORT).show();

                    /* -- and close the communication side of the socket -- */
                    socketCommunication.interrupt();
                }
                /* -- But if the communication side of the socket is already interrupted -- */
                else
                {
                    /* -- start the communication side of the socket first -- */
                    socketCommunication.start();
                    text_command = "calc";
                    Toast.makeText(getApplicationContext(), text_calc +" "+ toast, Toast.LENGTH_SHORT).show();

                    socketCommunication.interrupt();
                }
            }
        });

        /* -- Button to send "LIBREOFFICE" text to the communication side of the socket -- */
        button_libreOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* -- If the communication side of the socket is alive -- */
                if(socketCommunication.isAlive() == true)
                {
                    /* -- send libreOffice, make a toast to appear on the application -- */
                    text_command = "libreOffice";
                    Toast.makeText(getApplicationContext(), text_libreOffice +" "+ toast, Toast.LENGTH_SHORT).show();

                    /* -- and close the communication side of the socket -- */
                    socketCommunication.interrupt();
                }
                /* -- But if the communication side of the socket is already interrupted -- */
                else
                {
                    /* -- start the communication side of the socket first -- */
                    socketCommunication.start();
                    text_command = "libreOffice";
                    Toast.makeText(getApplicationContext(), text_libreOffice +" "+ toast, Toast.LENGTH_SHORT).show();

                    socketCommunication.interrupt();
                }
            }
        });

        /* -- Button to send "MOBILEFILES" text to the communication side of the socket -- */
        button_mobileFiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), text_mobileFiles +" "+ toast, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
