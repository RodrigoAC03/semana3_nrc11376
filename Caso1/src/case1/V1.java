package case1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblSegundoNumero;
	private JLabel lblTercerNumero;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer numero: ");
			lblNewLabel.setBounds(10, 11, 83, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblSegundoNumero = new JLabel("Segundo numero: ");
			lblSegundoNumero.setBounds(10, 42, 100, 14);
			contentPane.add(lblSegundoNumero);
		}
		{
			lblTercerNumero = new JLabel("Tercer numero: ");
			lblTercerNumero.setBounds(10, 76, 83, 14);
			contentPane.add(lblTercerNumero);
		}
		{
			btnNewButton_1 = new JButton("Sumas tres enteros");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(252, 38, 143, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Sumar dos reales");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(252, 72, 143, 23);
			contentPane.add(btnNewButton_2);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(116, 8, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setColumns(10);
			txtN2.setBounds(116, 39, 86, 20);
			contentPane.add(txtN2);
		}
		{
			txtN3 = new JTextField();
			txtN3.setColumns(10);
			txtN3.setBounds(116, 73, 86, 20);
			contentPane.add(txtN3);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 128, 386, 122);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton = new JButton("Sumas dos enteros");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(252, 7, 143, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_3 = new JButton("Limpiar");
			btnNewButton_3.addActionListener(this);
			btnNewButton_3.setBounds(285, 97, 85, 21);
			contentPane.add(btnNewButton_3);
		}
		{
			btnNewButton_4 = new JButton("Borrar");
			btnNewButton_4.addActionListener(this);
			btnNewButton_4.setBounds(10, 101, 89, 23);
			contentPane.add(btnNewButton_4);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_4) {
			do_btnNewButton_4_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_3) {
			do_btnNewButton_3_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	    try {
	    	//Lee el codigo
	    	int n1=Integer.parseInt(txtN1.getText());
			int n2=Integer.parseInt(txtN2.getText());
			
			Calculadora c=new Calculadora(n1, n2);
			
			txtS.append("La suma de dos enteros es : "+ c.Sumar(n1, n2)+"\n");
			
		} catch (Exception e2) {
			//Reconoce el error
			MostrarError();
			txtN1.setText(" ");
			txtN2.setText(" ");
			txtN1.grabFocus();
		}
		
	}
	
	
	//METODO PARA MOSTRAR EL ERROR
	private void MostrarError() {
		//Mostras un mensaje por el design
		JOptionPane.showMessageDialog(this, "Ingrese numero(s) valido(s)");
	}
	
	
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		
		try {
	    	int n1=Integer.parseInt(txtN1.getText());
			int n2=Integer.parseInt(txtN2.getText());
			int n3=Integer.parseInt(txtN3.getText());
			
			Calculadora c=new Calculadora(n1, n2, n3);
			
			txtS.append("La suma tres enteros es : "+ c.Sumar(n1, n2, n3)+"\n");
			
		} catch (Exception e2) {
			MostrarError();
			
			txtN1.setText(" ");
			txtN2.setText(" ");
			txtN3.setText(" ");
			txtN1.grabFocus();
		}
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		
		try {
	    	double n1=Double.parseDouble(txtN1.getText());
			double n2=Double.parseDouble(txtN2.getText());
			
			Calculadora c=new Calculadora(n1, n2);
			
			txtS.append("La suma de dos reales es : "+ c.Sumar(n1, n2)+"\n");
			
		} catch (Exception e2) {
			MostrarError();
			
			txtN1.setText(" ");
			txtN2.setText(" ");
			txtN3.setText(" ");
			txtN1.grabFocus();
		}
	}
	protected void do_btnNewButton_3_actionPerformed(ActionEvent e) {
		
		txtN1.setText(" ");
		txtN2.setText(" ");
		txtN3.setText(" ");
		txtN1.grabFocus();
		
	}
	protected void do_btnNewButton_4_actionPerformed(ActionEvent e) {
	}
}
