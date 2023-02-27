package ez_keytest;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {
	private JButton btn1 = new JButton("a");;

	public Main() {
		setLayout(new GridLayout(1,2));
		add(btn1);
		this.setAlwaysOnTop(true);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(1);
				try {
				} catch (Exception n) {
					n.printStackTrace();
				}

			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}
}
