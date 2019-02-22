/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Gideon Panjaitan
 */
public class Test extends JPanel {

    int x = 0, y = 100;

    public void paint(Graphics g) {

        FileReader fr = null;
        try {
            
            File file = new File("E:\\Program\\30-Days-of-Code-Hackerrank\\Test\\src\\test\\text.txt");
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            super.paint(g);
            Graphics2D g2 = (Graphics2D) g;
            Font font = new Font("Tahoma", Font.BOLD + Font.PLAIN, 10);
            g2.setFont(font);
            g2.setColor(Color.red);
            while ((line = br.readLine()) != null) {
                //process the line
                g2.drawString(line, x, y);
            }
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
            x += 10;
            if (x > this.getWidth()) {
                x = 0;
            }
            repaint();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame("Test");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(700, 200);
        jf.add(new Test());
        jf.setVisible(true);
    }
}
