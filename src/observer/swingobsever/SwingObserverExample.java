package observer.swingobsever;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author maleman
 *
 *Ejemplo de como se aplica el patron Observer en Swing
 */
public class SwingObserverExample {
	
	JFrame frame;
	
	public static void main(String... args) {
	    
	    SwingObserverExample example = new SwingObserverExample();
	    example.go();
	}
	
	public void go() {
	    
	    frame = new JFrame();
	    JButton button = new JButton("Should i do it?");
	    //Haciendo las clases Listern One y ListenerTwo observadores del boton
	    button.addActionListener(new ListenerOne());
	    button.addActionListener(new ListenerTwo());
	    
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(BorderLayout.CENTER,button);
	    frame.pack();
	    frame.show();
	}
	
	class ListenerOne implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
		System.out.println("Come on do it!!!");
	    }
	}
	class ListenerTwo implements ActionListener{
		    public void actionPerformed(ActionEvent e) {
			System.out.println("Don't do it!!!");
		    }
	}

}
