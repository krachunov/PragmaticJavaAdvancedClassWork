package interfaces;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingExample {
	public static void main(String[] args) {
		final JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		JButton button = new JButton("click me");
		frame.getContentPane().add(button);
		frame.setSize(500, 500);
		frame.setVisible(true);

		class ClickOnButton implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hello World");
			}
		}
		// button.addActionListener(new ClickOnButton());

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hello anonymous");
			}
		});

		button.addActionListener(e -> JOptionPane.showMessageDialog(null, "Hello lambda"));

	}
}
