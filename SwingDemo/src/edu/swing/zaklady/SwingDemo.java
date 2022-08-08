package edu.swing.zaklady;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingDemo extends JFrame {

	private JPanel contentPane;
	private JTextField tfMeno;
	private JButton btnVymaz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingDemo frame = new SwingDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SwingDemo() {
		setTitle("Moje swing okno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Meno:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		tfMeno = new JTextField();
		tfMeno.setBounds(49, 8, 191, 20);
		contentPane.add(tfMeno);
		tfMeno.setColumns(10);
		
		JButton btnNewButton = new JButton("Klikni na mňa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String meno = tfMeno.getText();
				JOptionPane.showMessageDialog(null, "Ahoj " + meno);
			}
		});
		btnNewButton.setBounds(250, 7, 115, 23);
		contentPane.add(btnNewButton);
		
		btnVymaz = new JButton("Vymaž");
		btnVymaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfMeno.setText("");
			}
		});
		btnVymaz.setBounds(375, 7, 89, 23);
		contentPane.add(btnVymaz);
	}
}
