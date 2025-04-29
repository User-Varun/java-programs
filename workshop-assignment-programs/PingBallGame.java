
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.*;

class PingBallGame
{
	public static void main(String[] args) 
	{
		JFrame jf = new JFrame("Game");
		jf.setLayout(new BorderLayout()); // how we have to set the components , if borderLayout then only 5 componets can be placed;
		
		jf.setSize(500 , 500);
		Can c1 = new Can();
		jf.add(c1);
		jf.setVisible(true); // show the frame
		// code till here , generate a 500*500px frame
		
	}
	
	// for running Thread , used runnable interface
 static	class Can extends Canvas implements Runnable
	{
	   
		int x =100 , y = 250;
		
		Can(){
		 Thread t1 = new Thread(this);
	   t1.start();
		}
		
		public  void paint(Graphics g){
			g.drawRect(100 ,100 ,300 ,300);
			g.fillOval(x , y , 30 ,30);
		}
		
		
		public void run(){
		   	
			int cp = 0;
			
			while(true){
				
				if(cp == 0 ){
                 
			        x = x+2;
					y = y-2;
					
					  if(x == 250){
						cp++;  
					  }
					   
				}else if(cp == 1){
					
					x = x+2;
					y = y+2;
					
					   if(x == 400){
						cp++;   
					   }
					
					
				}else if(cp == 2){
					
					x = x-2;
					y = y+2;
					
					 if(x == 250){
						 
						 cp++;
					 }
				}else if(cp == 3){
					   x = x-2;
					   y = y-2;
					   
					    if(x == 100){
						  cp = 0;	
						}
					 }	
					 
				try{
				
				
				Thread.sleep(50);
				repaint();
				
			}catch(Exception tt){}
			
			
			}
			
			
		}
		
		
	} // Can class Close
} // FrameDemo close


