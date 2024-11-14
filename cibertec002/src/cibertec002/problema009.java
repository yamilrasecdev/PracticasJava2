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

public class problema009 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txthoras;
	private JTextField txttarifa;
	private JButton btnProcesar;
	private JButton btnLimpiar;
	private JTextArea txtarea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					problema009 frame = new problema009();
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
	public problema009() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Horas");
		lblNewLabel.setBounds(41, 22, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Tarifa");
		lblNewLabel_1.setBounds(41, 78, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txthoras = new JTextField();
		txthoras.setBounds(110, 19, 86, 20);
		contentPane.add(txthoras);
		txthoras.setColumns(10);
		
		txttarifa = new JTextField();
		txttarifa.setBounds(110, 75, 86, 20);
		contentPane.add(txttarifa);
		txttarifa.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(258, 18, 89, 23);
		contentPane.add(btnProcesar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setBounds(258, 74, 89, 23);
		contentPane.add(btnLimpiar);
		
		txtarea = new JTextArea();
		txtarea.setBounds(41, 128, 353, 164);
		contentPane.add(txtarea);
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
		
		// Declaración de variables  entrada
		double horasTrabajadas, tarifaxHora;
		
		//Declaracion variable salida 
		double sueldoBasico, montoBonificacion, sueldoBruto, montoDescuento, sueldoNeto; 
		
		// Entrada de datos 
		horasTrabajadas = Double.parseDouble(txthoras.getText()); 
		tarifaxHora = Double.parseDouble(txttarifa.getText()); 
		
		// Cálculo de montos 
		sueldoBasico = horasTrabajadas * tarifaxHora; 
		montoBonificacion = 0.20 * sueldoBasico; 
		sueldoBruto = sueldoBasico + montoBonificacion; 
		montoDescuento = 0.10 * sueldoBruto; 
		sueldoNeto = sueldoBruto - montoDescuento; 
		
		// Salida de resultados 
		txtarea.setText("Sueldo básico : S/. " + sueldoBasico + "\n"); 
		txtarea.append("Bonificación : S/. " + montoBonificacion + "\n"); 
		txtarea.append("Sueldo bruto : S/. " + sueldoBruto + "\n"); 
		txtarea.append("Descuentos : S/. " + montoDescuento + "\n"); 
		txtarea.append("Sueldo neto : S/. " + sueldoNeto);
		
	}
	protected void actionPerformedBtnLimpiar(ActionEvent e) {
		txthoras.setText("");
		txttarifa.setText("");
		txtarea.setText("");
	}
}
