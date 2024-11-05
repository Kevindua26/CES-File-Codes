//WAP to demonstrate the lifecycle of applet
import java.applet.Applet;
import java.awt.Graphics;
public class Q71 extends Applet{
    // <applet code="Q71.class" width="300" height="300"></applet>



    // Called once when the applet is first loaded
    @Override
    public void init() {
        System.out.println("Applet initialized.");
    }

    // Called each time the applet becomes active
    @Override
    public void start() {
        System.out.println("Applet started.");
    }

    // Called when the applet is inactive or hidden
    @Override
    public void stop() {
        System.out.println("Applet stopped.");
    }

    // Called when the applet is destroyed
    @Override
    public void destroy() {
        System.out.println("Applet destroyed.");
    }

    // Called whenever the applet needs to repaint itself
    @Override
    public void paint(Graphics g) {
        g.drawString("Applet Life Cycle Demo", 20, 20);
    }
}
