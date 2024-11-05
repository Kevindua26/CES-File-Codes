//WAP to demonstrate applet
import java.applet.Applet;
import java.awt.Graphics;

//Q70 is the applet class here which will be passed to either the applet viewer or browser
//therefore no main method (psvm)

// <applet code="Q70.class" width="300" height="300"></applet>
public class Q70 extends Applet {
    //Overriding the paint() method
    @Override
    public void paint(Graphics g) {
        g.drawString("Hello World", 20, 20);
    }

}
