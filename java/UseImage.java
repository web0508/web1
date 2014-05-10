import java.awt.*;
import java.applet.Applet;
import java.net.*;
public class UseImage extends Applet {
	//load image
	Image testImage;
	public void init(){
		testImage=getImage(getDocumentBase(),"index.jpg");
	}
	public void paint(Graphics g) {
		g.drawImage(testImage,0,0,this);
	}
}