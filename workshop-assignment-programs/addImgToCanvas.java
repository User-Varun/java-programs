import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class addImgToCanvas {
    public static void main(String[] args) {
        Frame frame = new Frame("Canvas Image Example");
        Can canvas = new Can();
        
        frame.add(canvas);
        frame.setSize(500, 500);
        frame.setVisible(true);
        
        // Optional: start the Runnable thread
        Thread t = new Thread(canvas);
        t.start();
    }

    static class Can extends Canvas implements Runnable {
        BufferedImage img;

        public Can() {
            try {
             img = ImageIO.read(new File("C:\\Users\\admin\\Desktop\\photo.png"));// load image in constructor
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void run() {
            // You can use this method to update something if needed.
            // Currently empty.
        }

        public void paint(Graphics g) {
            if (img != null) {
                g.drawImage(img, 100, 100, this);
            }
        }
    } // Can class close
} // addImgToCanvas class close
