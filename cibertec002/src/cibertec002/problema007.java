package cibertec002;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class problema007 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtprecio;
	private JTextField txtcantidad;
	private JButton btnProcesar;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					problema007 frame = new problema007();
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
	public problema007() {
		setTitle("Problema 007 - Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Precio");
		lblNewLabel.setBounds(61, 68, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setBounds(61, 125, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtprecio = new JTextField();
		txtprecio.setBounds(122, 65, 166, 20);
		contentPane.add(txtprecio);
		txtprecio.setColumns(10);
		
		txtcantidad = new JTextField();
		txtcantidad.setBounds(122, 122, 171, 20);
		contentPane.add(txtcantidad);
		txtcantidad.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(358, 64, 89, 23);
		contentPane.add(btnProcesar);
		
		txtS = new JTextArea();
		txtS.setBounds(71, 192, 398, 157);
		contentPane.add(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {		
		// Declaración de variables 
		int cantidad;
		double precio;
		
		//declaro variables salida
		int caramelos;
		double impcompra, impdescuento, imppagar;
		
		// Entrada de datos 
		precio = Double.parseDouble(txtprecio.getText()); 
		cantidad = Integer.parseInt(txtcantidad.getText()); 
		
		// Proceso de cálculo 		
		impcompra = precio * cantidad;

		impdescuento = 0.11 * impcompra; 
				
		imppagar = impcompra - impdescuento;
		
		caramelos = 2 * cantidad; 
				
		// Salida de resultados 
		txtS.setText("Importe compra : S/. " + impcompra + "\n"); 
		txtS.append("Importe descuento : S/. " + impdescuento + "\n"); 
		txtS.append("Importe pagar : S/. " + imppagar + "\n"); 
		txtS.append("Caramelos : " + caramelos);
		
		
		
	}
	
	
	
	
}
