import java.awt.*;
import java.applet.*;

public class Max extends Applet
{
     TextField T1,T2,T3;

      public void init(){
          T1 = new TextField(10);
          T2 = new TextField(10);
          T3 = new TextField(10);

          add(T1);
          add(T2);
          add(T3);

          T1.setText("0");
          T2.setText("0");
          T3.setText("0");
        }

        public void paint(Graphics g){
             int m, a, x,result;
             String str;

             g.drawString("Enter 3 Values to Check the Maximum ",10,50);

             str=T1.getText();
             m=Integer.parseInt(str);
             str=T2.getText();
             a=Integer.parseInt(str);
             str=T3.getText();
             x=Integer.parseInt(str);

              g.setColor(Color.red);
              if (m>a) {
                  if (m>x)
                      result=m;
                  else
                      result=x;
                }
            else{
                  if (a>x) 
                      result=a;
                  else
                      result=x;
              }
              g.drawString("Maximnum of 3 No is "+result,10,70);
              showStatus("MAXIMUM OF 3 NUMBERS");
            }

            public boolean action(Event e, Object o){
                  repaint();
                  return true;
            }
}

/* <applet code="Max.class" height=150 width=400>
   </applet> */