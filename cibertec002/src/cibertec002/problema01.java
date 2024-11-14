package cibertec002;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;

public class problema01 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtradio;
	private JTextField txtaltura;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JTextArea txtarea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					problema01 frame = new problema01();
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
	public problema01() {
		setTitle("Problema 001 - Cilindro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Radio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(49, 36, 81, 33);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(49, 80, 81, 20);
		contentPane.add(lblNewLabel_1);
		
		txtradio = new JTextField();
		txtradio.setBounds(140, 36, 86, 33);
		contentPane.add(txtradio);
		txtradio.setColumns(10);
		
		txtaltura = new JTextField();
		txtaltura.setBounds(140, 82, 86, 33);
		contentPane.add(txtaltura);
		txtaltura.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(326, 43, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(326, 102, 89, 23);
		contentPane.add(btnBorrar);
		
		txtarea = new JTextArea();
		txtarea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtarea.setBounds(57, 189, 461, 145);
		contentPane.add(txtarea);
	}


	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
		
		if (e.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		double r;
		double h;
		double are;
		double vol;
		
		r=Double.parseDouble(txtradio.getText());
		h=Double.parseDouble(txtaltura.getText());
		
		are=2*Math.PI*r*(r+h);
		vol=2*Math.PI*r*r*h;
		
		txtarea.setText("area :"+are+"\n");
		txtarea.append("Volumen: "+vol);
		
		
	}
	
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		this.txtaltura.setText("");
		this.txtradio.setText("");
		this.txtarea.setText("");
		
	}
}
