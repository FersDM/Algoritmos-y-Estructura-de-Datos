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

public class Cliente extends JDialog implements ActionListener {
	
	DefaultTableModel mod=new DefaultTableModel();
	
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnListar;
	private JLabel lblIDCodcliente;
	private JTextField txtCodCliente;
	private JLabel lblNroDni;
	private JLabel lblNombreCli;
	private JLabel lblApellidoCli;
	private JLabel lblTelefono;
	private JTextField txtDni;
	private JTextField txtNombreCli;
	private JTextField txtApellidoCli;
	private JTextField txtTelefono;
	private JScrollPane scrollPane;
	private JTable tblDato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente dialog = new Cliente();
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
	public Cliente() {
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
		
		lblIDCodcliente = new JLabel("Cod Cliente");
		lblIDCodcliente.setBounds(10, 12, 65, 14);
		getContentPane().add(lblIDCodcliente);
		
		txtCodCliente = new JTextField();
		txtCodCliente.setBounds(85, 9, 110, 20);
		getContentPane().add(txtCodCliente);
		txtCodCliente.setColumns(10);
		
		lblNroDni = new JLabel("DNI");
		lblNroDni.setBounds(10, 46, 65, 14);
		getContentPane().add(lblNroDni);
		
		lblNombreCli = new JLabel("Nombre");
		lblNombreCli.setBounds(10, 80, 46, 14);
		getContentPane().add(lblNombreCli);
		
		lblApellidoCli = new JLabel("Apellido");
		lblApellidoCli.setBounds(10, 114, 46, 14);
		getContentPane().add(lblApellidoCli);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(10, 148, 65, 14);
		getContentPane().add(lblTelefono);
		
		txtDni = new JTextField();
		txtDni.setBounds(85, 43, 110, 20);
		getContentPane().add(txtDni);
		txtDni.setColumns(10);
		
		txtNombreCli = new JTextField();
		txtNombreCli.setColumns(10);
		txtNombreCli.setBounds(85, 77, 110, 20);
		getContentPane().add(txtNombreCli);
		
		txtApellidoCli = new JTextField();
		txtApellidoCli.setColumns(10);
		txtApellidoCli.setBounds(85, 111, 110, 20);
		getContentPane().add(txtApellidoCli);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(85, 145, 110, 20);
		getContentPane().add(txtTelefono);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 173, 573, 259);
		getContentPane().add(scrollPane);
		
		tblDato = new JTable();
		scrollPane.setViewportView(tblDato);
		
		// CONFIGURAR LA TABLA
		//AGREE COLUMNAS
		mod.addColumn("Codigo cliente");
		mod.addColumn("Nombres");
		mod.addColumn("Apellidos");
		mod.addColumn("Telefono");
		mod.addColumn("DNI");
		
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