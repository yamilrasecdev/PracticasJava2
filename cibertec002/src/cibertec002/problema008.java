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

public class problema008 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtprecio;
	private JTextField txtcantidad;
	private JTextArea textarea;
	private JButton btnProcesar;
	private JButton btnLimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					problema008 frame = new problema008();
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
	public problema008() {
		setTitle("Problema 008");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Precio");
		lblNewLabel.setBounds(63, 27, 67, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setBounds(63, 66, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		txtprecio = new JTextField();
		txtprecio.setBounds(153, 24, 86, 20);
		contentPane.add(txtprecio);
		txtprecio.setColumns(10);
		
		txtcantidad = new JTextField();
		txtcantidad.setBounds(153, 63, 86, 20);
		contentPane.add(txtcantidad);
		txtcantidad.setColumns(10);
		
		textarea = new JTextArea();
		textarea.setBounds(63, 91, 434, 164);
		contentPane.add(textarea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(299, 23, 89, 23);
		contentPane.add(btnProcesar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setBounds(310, 62, 89, 23);
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
	
		//declaro variables entrada
		double precio;
		int cantidad;
		// declaro variables salida
		double importeCompra,importeDescuento,importePagar,descuento1,descuento2;
		
		//Lectura de datos
		precio=Double.parseDouble(txtprecio.getText());
		cantidad= Integer.parseInt(txtcantidad.getText());
		
		//Calculo
		importeCompra=precio*cantidad;
		descuento1=0.07*importeCompra;
		descuento2=0.07*(importeCompra-descuento1);
		
		importeDescuento=descuento1+descuento2;
		importePagar= importeCompra-importeDescuento;
					
		//Salida de resultados
		textarea.setText("Importe compra: S/. " + importeCompra +"\n" );
		textarea.append("Importe primer descuento: S/. "+descuento1+"\n");
		textarea.append("Importe segundo descuento: S/. "+descuento2+"\n");
		textarea.append("Importe descuento total: S/. "+importeDescuento+"\n");
		textarea.append("Importe pagar: S/. "+importePagar+"\n");
		
		
		
		
		
		
		
		
		
	}
	protected void actionPerformedBtnLimpiar(ActionEvent e) {
		txtprecio.setText("");
		txtcantidad.setText("");
		textarea.setText("");
	}
}
