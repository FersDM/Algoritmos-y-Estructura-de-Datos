package gui;

import semana_08.Arreglo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ejemplo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblNumero;
	private JTextField txtNumero;
	private JButton btnInsertarAlInicio;
	private JButton btnBuscarEliminar;
	private JButton btnInvertirArreglo;
	private JButton btnOrdenarArreglo;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo frame = new Ejemplo();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejemplo() {
		setTitle("Ejemplo - Semana_08");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNumero = new JLabel("N�mero");
		lblNumero.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblNumero.setBounds(10, 11, 50, 23);
		contentPane.add(lblNumero);

		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtNumero.setBounds(66, 11, 50, 23);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);

		btnInsertarAlInicio = new JButton("Insertar al inicio");
		btnInsertarAlInicio.addActionListener(this);
		btnInsertarAlInicio.setBounds(340, 48, 180, 23);
		contentPane.add(btnInsertarAlInicio);

		btnBuscarEliminar = new JButton("Buscar / eliminar");
		btnBuscarEliminar.addActionListener(this);
		btnBuscarEliminar.setBounds(340, 78, 180, 23);
		contentPane.add(btnBuscarEliminar);

		btnInvertirArreglo = new JButton("Invertir arreglo");
		btnInvertirArreglo.addActionListener(this);
		btnInvertirArreglo.setBounds(340, 108, 180, 23);
		contentPane.add(btnInvertirArreglo);

		btnOrdenarArreglo = new JButton("Ordenar arreglo");
		btnOrdenarArreglo.addActionListener(this);
		btnOrdenarArreglo.setBounds(340, 138, 180, 23);
		contentPane.add(btnOrdenarArreglo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 315, 400);
		contentPane.add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
		
	//  Declaraci�n global
	Arreglo a = new Arreglo();

	/**
				.----.----.----.----.----.----.----.----.----.----.
		n  ==>  |    |    |    |    |    |    |    |    |    |    |   
				'----'----'----'----'----'----'----'----'----'----'
		  		   0    1    2    3    4    5    6    7    8    9
                indice
	 */

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnOrdenarArreglo) {
			actionPerformedBtnOrdenarArreglo(arg0);
		}
		if (arg0.getSource() == btnInvertirArreglo) {
			actionPerformedBtnInvertirArreglo(arg0);
		}
		if (arg0.getSource() == btnBuscarEliminar) {
			actionPerformedBtnBuscarEliminar(arg0);
		}
		if (arg0.getSource() == btnInsertarAlInicio) {
			actionPerformedBtnInsertarAlInicio(arg0);
		}
		limpieza();
	}
	/**
	 *  Lee un n�mero y lo inseta en la primera posici�n
	 */	
	protected void actionPerformedBtnInsertarAlInicio(ActionEvent arg0) {
		try {
			a.insertarAlInicio(leerNumero()); 
			listar();
		}
		catch (Exception e) {
			mensaje("error de ingreso");
		}
	}
	/**
	 *  Lee un n�mero, lo busca, y si est� registrado lo elimina
	 */
	protected void actionPerformedBtnBuscarEliminar(ActionEvent arg0) {
		try {
			a.buscarEliminar(leerNumero());  
			listar();
		}
		catch (Exception e) {
			mensaje("error de ingreso");
		}
	}
	/**
	 *  Invierte el contenido del arreglo
	 */
	protected void actionPerformedBtnInvertirArreglo(ActionEvent arg0) {
		a.invertirArreglo();
		listar();
	}
	/**
	 *  Ordena de menor a mayor el contenido del arreglo
	 */
	protected void actionPerformedBtnOrdenarArreglo(ActionEvent arg0) {
		a.ordenarArreglo();
		listar();
	}
	//  M�todos tipo void sin par�metros
	void listar() {
		txtS.setText("");
		for (int i=0; i<a.tama�o(); i++)
			imprimir("n[" + i + "] : " + a.obtener(i));
	}
	void limpieza() {
		txtNumero.setText("");
		txtNumero.requestFocus();
	}
	void imprimir() {
		imprimir("");
	}
	//  M�todos tipo void con par�metros
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	//  M�todos que retornan valor sin par�metros
	int leerNumero()  {
		return Integer.parseInt(txtNumero.getText().trim());
	}
	
}