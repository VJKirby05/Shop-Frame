/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Valeria
 */

public class Shop extends JFrame
{
    final int FRAME_WIDTH = 600;
    final int FRAME_HEIGHT = 500;
    
    public Shop()
    {
        createShop();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    class debugTest implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("BUTTON CLICK TEST!!");
        }
    }
    
    void createShop()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel heading = new JLabel("THE SHOP");
        heading.setAlignmentX(Component.CENTER_ALIGNMENT);

        ImageIcon cartIcon = new ImageIcon(getClass().getResource("/images/cart.png"));
        JLabel imgLabel = new JLabel(cartIcon);
        imgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField discountCode = new JTextField("--Enter Discount Code Here--");
        discountCode.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JButton button1 = new JButton("Golf Tee(Shirt) - 50 euro");
        JButton button2 = new JButton("Golf Balls(4 pack) - 20 euro");
        JButton button3 = new JButton("Putters - 40 euro");
        JButton button4 = new JButton("Tees - 10 euro");
        JButton button5 = new JButton("RESET CART");

        // Line one panel
        JPanel lineOnePanel = new JPanel();
        lineOnePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        lineOnePanel.add(button1);
        lineOnePanel.add(button2);

        // Line two panel
        JPanel lineTwoPanel = new JPanel();
        lineTwoPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        lineTwoPanel.add(button3);
        lineTwoPanel.add(button4);

        JButton genCode = new JButton("Generate Discount Code(valid codes mean next item is half price)");
        genCode.setAlignmentX(Component.CENTER_ALIGNMENT);

        ActionListener listener1 = new debugTest();
        button1.addActionListener(listener1);
        ActionListener listener2 = new debugTest();
        button2.addActionListener(listener2);
        ActionListener listener3 = new debugTest();
        button3.addActionListener(listener3);
        ActionListener listener4 = new debugTest();
        button4.addActionListener(listener4);
        ActionListener listener5 = new debugTest();
        button5.addActionListener(listener5);

        panel.setBackground(Color.ORANGE);

        panel.add(heading);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(imgLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(lineOnePanel);
        panel.add(lineTwoPanel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button5);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(genCode);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(discountCode);

        add(panel);

    }
}