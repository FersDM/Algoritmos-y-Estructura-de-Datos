package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Vehiculo extends JDialog implements ActionListener {
	
	DefaultTableModel mod=new DefaultTableModel();
	
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnListar;
	private JLabel lblPlaca;
	private JTextField txtPlaca;
	private JLabel lblNewLabel;
	private JLabel lblColor;
	private JLabel lblAo;
	private JLabel lblEstado;
	private JTextField txtModelo;
	private JTextField txtColor;
	private JTextField txtAnio;
	private JTextField txtEstado;
	private JScrollPane scrollPane;
	private JTable tblDato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vehiculo dialog = new Vehiculo();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Vehiculo() {
		setBounds(100, 100, 609, 482);
		getContentPane().setLayout(null);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(478, 8, 89, 23);
		getContentPane().add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(478, 42, 89, 23);
		getContentPane().add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(478, 76, 89, 23);
		getContentPane().add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(478, 110, 89, 23);
		getContentPane().add(btnEliminar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(478, 144, 89, 23);
		getContentPane().add(btnListar);
		
		lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(10, 12, 46, 14);
		getContentPane().add(lblPlaca);
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(85, 9, 110, 20);
		getContentPane().add(txtPlaca);
		txtPlaca.setColumns(10);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(10, 46, 46, 14);
		getContentPane().add(lblNewLabel);
		
		lblColor = new JLabel("Color");
		lblColor.setBounds(10, 80, 46, 14);
		getContentPane().add(lblColor);
		
		lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(10, 114, 46, 14);
		getContentPane().add(lblAo);
		
		lblEstado = new JLabel("Estado");
		lblEstado.setBounds(10, 148, 46, 14);
		getContentPane().add(lblEstado);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(85, 43, 110, 20);
		getContentPane().add(txtModelo);
		txtModelo.setColumns(10);
		
		txtColor = new JTextField();
		txtColor.setColumns(10);
		txtColor.setBounds(85, 77, 110, 20);
		getContentPane().add(txtColor);
		
		txtAnio = new JTextField();
		txtAnio.setColumns(10);
		txtAnio.setBounds(85, 111, 110, 20);
		getContentPane().add(txtAnio);
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setBounds(85, 145, 110, 20);
		getContentPane().add(txtEstado);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 181, 573, 251);
		getContentPane().add(scrollPane);
		
		tblDato = new JTable();
		scrollPane.setViewportView(tblDato);
		
		// CONFIGURAR LA TABLA
		//AGREE COLUMNAS
		mod.addColumn("Placa");
		mod.addColumn("Modelo");
		mod.addColumn("Color");
		mod.addColumn("Año");
		mod.addColumn("Estado");
		
		//ASIGNAR EL MODELO A LA  TABLA
		tblDato.setModel(mod);
		
		
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnModificar(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
	}
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
	}
	protected void actionPerformedBtnConsultar(ActionEvent arg0) {
	}
	protected void actionPerformedBtnModificar(ActionEvent arg0) {
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
	}
}
