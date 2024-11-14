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
import java.awt.Window.Type;

public class problema003 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtdinero;
	private JTextField txtedad1;
	private JTextField txtedad2;
	private JTextField txtedad3;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					problema003 frame = new problema003();
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
	public problema003() {
		setTitle("Problema 003 - Reparto de dineo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("dinero");
		lblNewLabel.setBounds(113, 87, 102, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Edad1");
		lblNewLabel_1.setBounds(113, 125, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Edad 2");
		lblNewLabel_2.setBounds(113, 166, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Edad3");
		lblNewLabel_3.setBounds(113, 214, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtdinero = new JTextField();
		txtdinero.setBounds(205, 84, 86, 20);
		contentPane.add(txtdinero);
		txtdinero.setColumns(10);
		
		txtedad1 = new JTextField();
		txtedad1.setBounds(205, 122, 86, 20);
		contentPane.add(txtedad1);
		txtedad1.setColumns(10);
		
		txtedad2 = new JTextField();
		txtedad2.setBounds(205, 163, 86, 20);
		contentPane.add(txtedad2);
		txtedad2.setColumns(10);
		
		txtedad3 = new JTextField();
		txtedad3.setBounds(205, 211, 86, 20);
		contentPane.add(txtedad3);
		txtedad3.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(375, 87, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(375, 136, 89, 23);
		contentPane.add(btnBorrar);
		
		txtArea = new JTextArea();
		txtArea.setBounds(133, 300, 362, 175);
		contentPane.add(txtArea);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	
	
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		
		
		double dinero,monto1,monto2,monto3;
		int edad1,edad2,edad3;
		int sumaedades;
		
		//Lectura datos
		dinero=Double.parseDouble(txtdinero.getText());
		edad1=Integer.parseInt(txtedad1.getText());
		edad2=Integer.parseInt(txtedad2.getText());
		edad3=Integer.parseInt(txtedad3.getText());
		
		//Calculo de la suma de las edades
		sumaedades=edad1+edad2+edad3;
		
		monto1=(edad1*dinero)/sumaedades;
		monto2=(edad2*dinero)/sumaedades;
		monto3=(edad3*dinero)/sumaedades;
		
		//salida
		txtArea.setText("monto persona 1 :"+monto1 +"\n");
		txtArea.append("monto persona 2:"+monto2+"\n");
		txtArea.append("monto persona 3:"+monto3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
