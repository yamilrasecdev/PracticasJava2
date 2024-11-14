package cibertec002;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class problema006 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtdebora;
	private JTextField txtraquel;
	private JTextField txtsefora;
	private JButton btnProcesar;
	private JTextArea txtarea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					problema006 frame = new problema006();
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
	public problema006() {
		setTitle("Problema 006 - Banot");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Débora");
		lblNewLabel.setBounds(110, 65, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Raquel");
		lblNewLabel_1.setBounds(110, 114, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Séfora");
		lblNewLabel_2.setBounds(110, 167, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtdebora = new JTextField();
		txtdebora.setBounds(179, 62, 86, 20);
		contentPane.add(txtdebora);
		txtdebora.setColumns(10);
		
		txtraquel = new JTextField();
		txtraquel.setBounds(179, 111, 86, 20);
		contentPane.add(txtraquel);
		txtraquel.setColumns(10);
		
		txtsefora = new JTextField();
		txtsefora.setBounds(179, 164, 86, 20);
		contentPane.add(txtsefora);
		txtsefora.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(349, 75, 89, 23);
		contentPane.add(btnProcesar);
		
		txtarea = new JTextArea();
		txtarea.setBounds(101, 241, 349, 159);
		contentPane.add(txtarea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
	
		
		// Declaración de variables entrada
		double dineDeb, dineRaq, dineSef;
		//declara variables salida
		double capital, porcDeb, porcRaq, porcSef; 
		
		// Entrada de datos 
		dineDeb = Double.parseDouble(txtdebora.getText()); 
		dineRaq = Double.parseDouble(txtraquel.getText()); 
		dineSef = Double.parseDouble(txtsefora.getText()); 
		// Determina el capital formado 
		capital = dineDeb + dineRaq + dineSef; 
		
		// Determina los porcentajes 
		porcDeb = dineDeb * 100 / capital; 
		porcRaq = dineRaq * 100 / capital; 
		porcSef = dineSef * 100 / capital; 
		
		// Salida de resultados 
		txtarea.setText("Capital : " + capital + "\n"); 
		
		txtarea.append("Porcentaje de Débora : " + porcDeb + "\n"); 
		txtarea.append("Porcentaje de Raquel : " + porcRaq + "\n"); 
		txtarea.append("Porcentaje de Séfora : " + porcSef+ "\n");
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
