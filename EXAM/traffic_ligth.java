package myproject;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class traffic_light extends Applet implements ActionListener{
	Button b1,b2,b3;
	
 public void init(){
	  b1=new Button("RED");
	  b2=new Button("YELLOW");
	  b3=new Button("GREEN");
	  add(b1);
	  add(b2);
	  add(b3);
	 
	  
 }
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   

   public void paint(Graphics g){
	   b1.setBounds(600,100,100,40);
	   b2.setBounds(500,100,100,40);
	   b3.setBounds(400,100,100,40);
	   g.setColor(Color.YELLOW);
	   g.fillOval(100, 200, 100, 130);
	   g.setColor(Color.GREEN);
	   g.fillOval(100, 300, 100, 130);
	   g.setColor(Color.RED);
	   g.fillOval(100, 400, 100, 130);
	   }
@Override
public void actionPerformed(ActionEvent e) {
	try{
		InputStreamReader read=new InputStreamReader(null, "E:\\1st.txt");
		OutputStreamWriter f1=new OutputStreamWriter(null, "E:\\number.txt");
		OutputStreamWriter f2=new OutputStreamWriter(null, "E:\\number2.txt");
        int i;
		if(i.(reader.read())!= null){
        	if(i%2=0){
        		f1.write(i);
        		else{
        			f2.write(i);
        		
        		
        	}
        }
		
	

	
	}
   
}
}
}

