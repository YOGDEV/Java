import javax.swing.*;
import java.awt.*;

class Ab extends Canvas
{
 public void paint(Graphics g)
{
 g.setColor(Color.black);
g.fillOval(190,40,50,50);//right ear
g.fillOval(40,40,50,50);//left ear
g.fillOval(40,50,200,200);//face black
g.fillOval(150,150,400,400);//body
g.setColor(Color.white);
g.fillOval(135,150,10,10);//nose
g.fillOval(80,100,50,50);//eye boll white
g.fillOval(150,100,50,50);//eye boll white
g.setColor(Color.red);
g.fillOval(100,130,20,20);//eyeboll red
g.fillOval(170,130,20,20);//eyeboll red
g.setColor(Color.white);
g.drawArc(90,130,100,100,0,-180);//smile
}

public static void main(String[] args)
{
Ab d=new Ab();
JFrame f=new JFrame();
f.setSize(300,400);
f.setVisible(true);
f.add(d);

}
}
