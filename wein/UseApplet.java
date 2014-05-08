import java.awt.*;
import java.applet.Applet;
import java.util.Date;
public class UseApplet extends Applet
{
	String strTime=new String();
	public void init()
	{
		
	}
	public void start()
	{
		Date d=new Date();
		strTime=d.toString();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Now the time is:"+strTime,20,30);
	}
};