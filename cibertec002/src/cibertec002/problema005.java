package cibertec002;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class problema005 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtdinero;
	private JButton btnProcesar;
	private JTextArea txtarea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					problema005 frame = new problema005();
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
	public problema005() {
		setTitle("Problema005 - Hijos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Dinero");
		lblNewLabel.setBounds(74, 59, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtdinero = new JTextField();
		txtdinero.setBounds(150, 56, 86, 20);
		contentPane.add(txtdinero);
		txtdinero.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(289, 55, 89, 23);
		contentPane.add(btnProcesar);
		
		txtarea = new JTextArea();
		txtarea.setBounds(74, 104, 372, 194);
		contentPane.add(txtarea);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		
		// Declaración de variables entrada		
		double dinero;
		// declaro variable salida
		double dinTamar, dinJosue, dinCaleb, dinDaniel, dinDavid;
		
		// Entrada de datos 
		dinero = Double.parseDouble(txtdinero.getText());
		
		// Proceso de cálculo 
		dinJosue = 0.27 * dinero; 
		dinTamar = 0.85 * dinJosue;
		dinDaniel = 0.25 * dinero; 
		dinCaleb = 0.23 * (dinJosue + dinDaniel); 
		dinDavid = dinero - (dinTamar + dinJosue + dinCaleb + dinDaniel); 
		
		// Salida de resultados 
		txtarea.setText("Dinero de Josué : " + dinJosue + "\n"); 
		txtarea.append("Dinero de Tamar : " + dinTamar + "\n"); 
		txtarea.append("Dinero de Daniel : " + dinDaniel + "\n"); 
		txtarea.append("Dinero de Caleb : " + dinCaleb + "\n"); 
		txtarea.append("Dinero de David : " + dinDavid);
	
		
		
	}
}
