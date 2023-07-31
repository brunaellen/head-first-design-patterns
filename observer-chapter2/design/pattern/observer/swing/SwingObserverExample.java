package design.pattern.observer.swing;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {
  private JFrame frame;

  public static void main(String[] args) {
    final SwingObserverExample swingObserverExample = new SwingObserverExample();
    swingObserverExample.go();
  }

  public void go() {
    frame = new JFrame();

    final JButton button = new JButton("Should I do it?");

    button.addActionListener(angelListener -> System.out.println("Don't do it, you might regret it!"));
    button.addActionListener(devilListener -> System.out.println("Come on, do it!"));
    frame.getContentPane().add(BorderLayout.CENTER, button);

    // Set frame properties
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(BorderLayout.CENTER, button);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }

  /*
	 * Remove these two inner classes to use lambda expressions instead.
	 *
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it, you might regret it!");
		}
	}

	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Come on, do it!");
		}
	}
	*/
}
