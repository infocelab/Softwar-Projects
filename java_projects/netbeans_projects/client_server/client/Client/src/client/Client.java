package client;

// Client.java
// Set up a Client that will read information sent
// from a Server and display the information.

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class Client extends JFrame implements ActionListener{
	
   private JTextArea display;
   private JButton send;
   private JButton read;
  
   private Socket conn;
   private DataInputStream input;
   private DataOutputStream output;
   private JTextField sendmsg;
   
   java.util.Timer timer = new java.util.Timer();
   
   public Client()
   {
      super( "Client" );
      display = new JTextArea();
      send = new JButton("Send");
      read = new JButton("Read");
      sendmsg = new JTextField();
      send.addActionListener(this);
      read.addActionListener(this);
      JScrollPane scroll = new JScrollPane(display);
      JPanel p = new JPanel();
      p.add(send);
    //  p.add(read);
      getContentPane().add("North",sendmsg);
      getContentPane().add("Center",scroll);
      getContentPane().add("South",p);
      
      addWindowListener(new WindowAdapter() {
      
      	public void windowClosing(WindowEvent ev){

	      	timer.cancel();
	      	System.exit(0);
      	}
      });
      setSize( 300, 500 );
      setVisible( true );
      
      try {
	      
	      conn = new Socket("10.131.73.114",100);
	      display.append("Connecting to server....\n");
	      input = new DataInputStream(conn.getInputStream());
	      output = new DataOutputStream(conn.getOutputStream());
	      display.append("Connected to server....\n");
	   
      }
      catch(Exception ex){
	      timer.cancel();
	      JOptionPane.showMessageDialog(null,ex.toString());
      }
      
     TimerTask task = new TimerTask() 
     {
       public void run() 
       {
         ReadFromServer();
       }
     };
     
     timer.schedule(task, 0, 2000);
   }
   
   public void actionPerformed(ActionEvent e)
   {
	 if(e.getActionCommand().equals("Send"))
     {
	   try{
	 
	 	output.writeUTF(sendmsg.getText());
	    display.append("Sending message to client...\n");
	       
	  }
	    catch(Exception ex){
	      timer.cancel();
	      JOptionPane.showMessageDialog(null,ex.toString());
     }
        
     }//end if
 }
	public void ReadFromServer()
	{
	      try
		  {
			display.append("Reading from server . . .\n");          
			String msg = input.readUTF();
			System.out.println(msg);
		    display.append("Server: " + String.valueOf(msg) + "\n");
	     
		  }
		  catch(Exception ex)
		  {
		  	timer.cancel();
		  	JOptionPane.showMessageDialog(null,ex.toString());
	      }
	}   
	   
	public static void main( String args[] )
	{
	  Client c = new Client();    
	  c.show();
	    
	}
}
