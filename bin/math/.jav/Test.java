import draw.*;
import java.awt.*;
import maths.*;
public class Test extends Canvas
{
	Frame f1=new Frame();
	public Test()
	{
		this.setBounds(0,0,500,500);
		this.setVisible(true);
		f1.add(this);
		f1.add(AWT.lempty);
		f1.setSize(500,500);
		f1.setResizable(false);
		f1.setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.white);
		g.fillRect(0,0,500,500);
		for(int i=0;i<=500;i+=10)
			Draw.fillCircle(g,new Circle(new maths.Point(i,250),5),Color.blue);
	}
	public static void main(String[] args)
	{
		Test t=new Test();
	}
}
