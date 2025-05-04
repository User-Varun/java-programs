import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.ArrayList;



	
	
class FallingBrickGame
{
	static int x =250 , y = 1;
	static Can c1 = null;
	
	
	public static void main(String[] args) 
	{
		// demo of button element
		JFrame jf = new JFrame("Game");
		jf.setLayout(new BorderLayout());
		jf.setSize(500 , 500);
		
		Panel pn = new Panel();
		
		jf.add(pn , "South");
	
		JButton jb = new JButton(" << ");
		JButton jb1 = new JButton(" >> ");
		
		pn.add(jb);
		pn.add(jb1);
		c1 = new Can();
		jf.add(c1);
		jb.addActionListener(new XYZ());
		jb1.addActionListener(new XYZ());
		
		jf.setVisible(true);
		
	} // main method close 
	
	static class XYZ implements ActionListener{
	  public void actionPerformed(ActionEvent ae){
		JButton bt = (JButton)ae.getSource();
		
		String s1 = bt.getText();
		
		if(s1.equals(" << "))
		  {
			x = x-15;
		  }else{
			x = x+15;  
		  }
		  c1.repaint();
		
		
	  }	
	}
		
	static class Can extends Canvas implements Runnable{
		
		int r1 = 0 , g1= 0, b1 = 0;
		
		ArrayList<Brick> bricks = new ArrayList<>();
		
		
		Can(){
			Thread t1 = new Thread(this);
			t1.start();
		}
		
						
      public class Brick{
         int x , y;	
         int r1 , g1, b1;
			
       Brick(int x , int y , int r1 , int g1 , int b1){
	   
	   this.x = x;
       this.y = y;
       this.r1 = r1;
       this.g1 = g1;
       this.b1 = b1; 

     }
}
			
		
		public void paint(Graphics g){
			
			// old bricks 
			for (Brick brick : bricks) {
              Color col = new Color(brick.r1, brick.g1, brick.b1);
              g.setColor(col);
              g.fillRect(brick.x, brick.y, 20, 20);
			}
		
			// current bricks 
			Color col=new Color(r1 , g1 , b1);
			g.setColor(col);
			g.fillRect(x, y, 20, 20);
}
		
	
		
	
		public void run(){
			
			while(true){
			if(y < 400){
			 	y = y+ 2;
				
				
			}else if (y >= 400)
			{
				bricks.add(new Brick(x , y , r1 , g1 , b1));	
				
				// Reset new falling brick
                    x = (int) (Math.random() * 400);
                    y = 1;
                    r1 = (int) (Math.random() * 255);
                    g1 = (int) (Math.random() * 255);
                    b1 = (int) (Math.random() * 255);
			}
			
			
			repaint();
			
			
			try{
			  Thread.sleep(50);
             
			}catch(Exception tt){
				System.out.print(tt);
			}
			
		}
		
	}
		
	
	} // Can Close
	
} // GameDemo close
