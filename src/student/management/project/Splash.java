package student.management.project;

import java.awt.*;
import javax.swing.*;

public class Splash {
    public static void main(String s[]) {
        Frame f = new Frame();
        f.setVisible(true);
        int i;int x=1;
        for(i=2;i<=600;i+=4,x+=1){
            f.setLocation((600-((i+x)/2)),350-(i/2));
            f.setSize(i+3*x,i+x/2);
            try{
                Thread.sleep(10);
            } catch(Exception e) {}
            
        }
    }
}
class Frame extends JFrame implements Runnable{
    Thread t1;
    Frame() {
        super("university management system");
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("student/management/project/icons/first.jpg"));
        Image i1 = c1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel m1 = new JLabel(i2);
        add(m1);
        t1 = new Thread(this);
        t1.start();
    }
    public void run() {
        try{
            Thread.sleep(7000);
            this.setVisible(false);
         Login f1 = new Login();
        } catch(Exception e) {
            e.printStackTrace();
            
        }
    }
    
}