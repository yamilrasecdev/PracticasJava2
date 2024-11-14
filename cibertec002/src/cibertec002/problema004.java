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

public class problema004 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtmonto;
	private JButton btnProcesar;
	private JTextArea txtarea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					problema004 frame = new problema004();
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
	public problema004() {
		setTitle("Problema004 - Algoritmo reparto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Monto total");
		lblNewLabel.setBounds(85, 54, 99, 14);
		contentPane.add(lblNewLabel);
		
		txtmonto = new JTextField();
		txtmonto.setBounds(221, 51, 86, 20);
		contentPane.add(txtmonto);
		txtmonto.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(361, 50, 89, 23);
		contentPane.add(btnProcesar);
		
		txtarea = new JTextArea();
		txtarea.setBounds(85, 125, 353, 165);
		contentPane.add(txtarea);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		
		// Declaración de variables entrada 
		double montoTotal;
		//Declaralacion variables salida
		double rubro1, rubro2, rubro3, rubro4, rubro5, rubro6;
		
		// Entrada de datos 		
		montoTotal = Double.parseDouble(txtmonto.getText());
		
		// Proceso de cálculo
		 rubro1 = 0.23 * montoTotal; 
		 rubro2 = 0.07 * montoTotal; 
		 rubro3 = 0.26 * montoTotal; 
		 rubro4 = 0.12 * montoTotal; 
		 rubro5 = 0.21 * montoTotal; 
		 rubro6 = 0.11 * montoTotal; 
		 
		 // Salida de resultados 
		 txtarea.setText("Alquiler de espacio en la feria : " + rubro1 + "\n");
		 txtarea.append("Publicidad : " + rubro2 + "\n"); 
		 txtarea.append("Transporte : " + rubro3 + "\n"); 
		 txtarea.append("Servicios feriales : " + rubro4 + "\n"); 
		 txtarea.append("Decoración : " + rubro5 + "\n"); 
		 txtarea.append("Gastos varios : " + rubro6);
		
	}
	
	
	
	
}
