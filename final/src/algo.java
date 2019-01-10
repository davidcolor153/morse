
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class algo implements MouseListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JFrame demo = new JFrame();
	     demo.setSize(500, 600);
	     demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	     //上介面
	     Panel pup =new Panel();
	     pup.setLayout(new GridLayout(10,10)); 
	     demo.add(pup,BorderLayout.CENTER);
	     
	     //下介面
	     Panel pdown =new Panel();
	     pdown.setLayout(new FlowLayout());
	     demo.add(pdown,BorderLayout.SOUTH);
	     
//	     pup.setBounds (10, 10, 300, 300);	   
//	     pup.setSize(400,400);
	     
	     //上介面內容
	     JLabel[][] label = new JLabel[10][10];
	     for ( int i = 0; i < label.length; i++ )
	        {
	            for ( int j = 0; j < label[i].length; j++ )
	            {
	                label[i][j] = new JLabel ();
	                label[i][j].setBackground (Color.white);
	                label[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
	                pup.add (label[i][j]);
	                label[i][j].addMouseListener(null);
	        }
	     
	     //下介面內容
	     JButton b1 = new JButton("run");
	     JButton b2 = new JButton("clear");
	     pdown.add(b1);
	     pdown.add(b2);

	     demo.setVisible(true);
	}

}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}}
