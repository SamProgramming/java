import java.awt.*;
import java.applet.Applet;
public class MyApplet extends Applet{
	public void paint(Graphics g)
	{
		int a=1;
		int b=29;
		int c=a+b;
		String s="sum="+String.valueOf(c);
		g.drawString(s,100,100);
		
	}
	
}