//ShowStatus.java
import java.applet.*;
import java.applet.Applet;
import java.awt.Event.*;
public class ShowStatus extends Applet
{
	int count=0;
	public void init()
	{
		
	}
	public boolean mouseClicked(MouseEvent e)
	{
		count++;
		getAppletContext().showStatus("Hello,You had clicked it"+count+"times!");
		return true;
	}
};