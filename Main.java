import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener{
    JFrame frame;
    JTextArea myarea;
    JButton button;
    Main()
    {
        // Creating frame
        frame=new JFrame("First Session");
        frame.setBounds(250,250,300,300);
        frame.setBackground(Color.black);
        frame.getContentPane().setBackground(Color.black);
        // creating button
        button=new JButton("Click");
        button.setBounds(120,20,50,20);
        // adding function to the button
        button.addActionListener(this);
        // Creating my text area
        myarea=new JTextArea("Welcome to the TextArea");
        myarea.setBounds(50,50,50,50);
        myarea.setBackground(Color.RED);
        //adding button to my frame
        frame.add(button);
        // adding textAr    ea to frame
        frame.add(myarea);
        // rest of these are just frame stuff
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Main object= new Main();

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
