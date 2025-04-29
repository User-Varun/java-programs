import java.awt.*;
import  java.awt.event.*;
import  javax.swing.*;

class  DrawLineWhenMousePressed
{
	public static void main(String[] args) 
	{
		JFrame jf = new JFrame("MouseDemo");
		jf.setLayout(new BorderLayout());
		jf.setSize(500 , 500);
		Can c1 = new Can();
		
		jf.add(c1);
		
		jf.setVisible(true);
		
	}
	
	static class Can extends Canvas
	{
		int x1 , y1 , x2 , y2;
		
		Can(){
			addMouseListener(new XYZ());
		}
		
		
		public void paint(Graphics g){
			g.drawLine(x1 , y1 , x2 , y2);
		}
		
		
		class XYZ extends MouseAdapter
		{
			
 			public void mousePressed(MouseEvent me){
				x1 = me.getX();
				y1 = me.getY();
				repaint();
				
			}
			
			
			public void mouseReleased(MouseEvent me){
				x1 = me.getX();
				y1 = me.getY();
				repaint();
				
			}
			
		}
	} // can class close
} // MouseDemo close
