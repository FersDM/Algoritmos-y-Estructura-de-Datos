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

public class Conductor extends JDialog implements ActionListener {
	
	DefaultTableModel mod=new DefaultTableModel();
	
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnListar;
	private JLabel lblIDconductor;
	private JTextField txtConductor;
	private JLabel lblNroBrevete;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblCategoria;
	private JTextField txtBrevete;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCategoria;
	private JScrollPane scrollPane;
	private JTable tblDato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conductor dialog = new Conductor();
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
	public Conductor() {
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
		
		lblIDconductor = new JLabel("iDConductor");
		lblIDconductor.setBounds(10, 12, 65, 14);
		getContentPane().add(lblIDconductor);
		
		txtConductor = new JTextField();
		txtConductor.setBounds(85, 9, 110, 20);
		getContentPane().add(txtConductor);
		txtConductor.setColumns(10);
		
		lblNroBrevete = new JLabel("NroBrevete");
		lblNroBrevete.setBounds(10, 46, 65, 14);
		getContentPane().add(lblNroBrevete);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 80, 46, 14);
		getContentPane().add(lblNombre);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 114, 46, 14);
		getContentPane().add(lblApellido);
		
		lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(10, 148, 65, 14);
		getContentPane().add(lblCategoria);
		
		txtBrevete = new JTextField();
		txtBrevete.setBounds(85, 43, 110, 20);
		getContentPane().add(txtBrevete);
		txtBrevete.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(85, 77, 110, 20);
		getContentPane().add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(85, 111, 110, 20);
		getContentPane().add(txtApellido);
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(85, 145, 110, 20);
		getContentPane().add(txtCategoria);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 173, 573, 259);
		getContentPane().add(scrollPane);
		
		tblDato = new JTable();
		scrollPane.setViewportView(tblDato);

		// CONFIGURAR LA TABLA
				//AGREE COLUMNAS
				mod.addColumn("Idconductor");
				mod.addColumn("Nrobrevete");
				mod.addColumn("Nombre");
				mod.addColumn("Apellido");
				mod.addColumn("Categoria");
				
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
