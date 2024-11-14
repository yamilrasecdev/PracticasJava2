package cibertec002;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class problema002 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtlargo;
	private JTextField txtancho;
	private JTextField txtaltura;
	private JTextArea txtarea;
	private JButton btnProcesar;
	private JButton btnLimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					problema002 frame = new problema002();
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
	public problema002() {
		setTitle("Problema 002  - Piramide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Largo");
		lblNewLabel.setBounds(55, 50, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Ancho");
		lblNewLabel_1.setBounds(55, 91, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Altura");
		lblNewLabel_2.setBounds(55, 141, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtlargo = new JTextField();
		txtlargo.setBounds(105, 47, 86, 20);
		contentPane.add(txtlargo);
		txtlargo.setColumns(10);
		
		txtancho = new JTextField();
		txtancho.setBounds(105, 88, 86, 20);
		contentPane.add(txtancho);
		txtancho.setColumns(10);
		
		txtaltura = new JTextField();
		txtaltura.setBounds(111, 138, 86, 20);
		contentPane.add(txtaltura);
		txtaltura.setColumns(10);
		
		txtarea = new JTextArea();
		txtarea.setBounds(55, 187, 379, 127);
		contentPane.add(txtarea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(296, 46, 89, 23);
		btnProcesar.addActionListener(this);
		contentPane.add(btnProcesar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setBounds(296, 87, 89, 23);
		contentPane.add(btnLimpiar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLimpiar) {
			actionPerformedBtnLimpiar(e);
		}
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		// Declaración de variables entrada
		double m, n, h;
		//Declaracion de variables salida
		double are, vol; 
		
		// Entrada de datos 
		m = Double.parseDouble(txtlargo.getText()); 
		n = Double.parseDouble(txtancho.getText()); 
		h = Double.parseDouble(txtaltura.getText()); 
		
		// Proceso de cálculo 
		are = m * n; 
		vol = are * h / 3; 
		// Salida de resultados 
		txtarea.setText("Area : " + are + "\n"); 
		txtarea.append("Volumen : " + vol + "\n");
		
	}
	
	
	
	protected void actionPerformedBtnLimpiar(ActionEvent e) {
		txtlargo.setText("");
		txtancho.setText("");
		txtaltura.setText("");
		txtarea.setText("");
		;
	}
}
