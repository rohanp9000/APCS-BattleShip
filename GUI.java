package UI; 
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
 
public class GUI extends JFrame implements ActionListener
{
 
 
    public static final int buttonW = 30;
    public static final int buttonH = 30;
 

 
    public Container contentPane;
 
    public JLabel background;
    public JLayeredPane [] shipBackground = new JLayeredPane[2];
 
    public JButton [][] squareButton = new JButton [10][10]; 
    public JLabel [][] squareLabel = new JLabel [10][10]; 
 
    public Border lineD;
    public Border lineL;
    public Border lineDL;
    int x = 0;
   
    public GUI()
    {
        
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Battleship");
 
        contentPane = getContentPane();
        contentPane.setBackground(Color.white);
        contentPane.setLayout(null);
 
        lineD = BorderFactory.createMatteBorder(1,0,1,0,Color.black);//used to make the borders of the squareLabels
        lineL = BorderFactory.createMatteBorder(0,1,0,1,Color.black);
        lineDL = BorderFactory.createCompoundBorder(lineD,lineL);
 
        background = new JLabel();//background of the frame
        background.setBounds(2, 2, FRAME_WIDTH, FRAME_HEIGHT);
        background.setVisible(true);
        contentPane.add(background);
 
        shipBackground[0] = new JLayeredPane();//holds the boats and labels for the user's boats
        shipBackground[0].setBounds(25,75,302,302);
        shipBackground[0].setBorder(lineDL);
        background.add(shipBackground[0]);
 
            for (int c = 0; c<squareButton.length;c++)//create and place the buttons & labels 
            {
                for (int l = 0; l<squareButton[c].length;l++)
                {
                    squareButton[c][l] = new JButton();
                    squareButton[c][l].setBounds(2+l*30,2+c*30, buttonW-2, buttonH-2);
                    squareButton[c][l].addActionListener(this);
 
                    squareLabel[c][l] = new JLabel();
                    squareLabel[c][l].setBounds(1 + l*30, 1 + c*30, buttonW, buttonH);
                    shipBackground[0].add(squareLabel[c][l]);
                    shipBackground[0].add(squareButton[c][l]);
 
                    squareLabel[c][l].setBorder(lineDL);
                }
            }
        }
     
 
    public void actionPerformed(ActionEvent event)
    {
        JButton source;
        source = (JButton)event.getSource();
         
        if (x == 0)
        {
            JLabel image = new JLabel ();//JLabel that will hold the boats
            image.setBounds(source.getX(),source.getY(), source.getWidth() *4, source.getHeight());//place it at the 
            image.setIcon(new ImageIcon("size4.png"));                                                //location of the pressed button
            shipBackground[0].add(image);
            shipBackground[0].moveToFront(image);//move the image to the front
            x = 1;
 
        }
      
    }
 
    public static void main (String [] args)
    {
    	
        GUI gui = new GUI();
        gui.setSize(600,600);
    }
}