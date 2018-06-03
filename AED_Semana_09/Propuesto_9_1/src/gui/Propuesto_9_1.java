package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import arreglo.ArregloFacturas;
import clase.Factura;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Propuesto_9_1 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblRuc;
	private JLabel lblEmpresa;
	private JLabel lblUnidades;
	private JLabel lblPrecio;
	private JTextField txtRuc;
	private JTextField txtEmpresa;
	private JTextField txtUnidades;	
	private JTextField txtPrecio;
	private JButton btnAdicionar;	
	private JButton btnReportar;
	private JScrollPane scrollPaneA;
	private JScrollPane scrollPaneB;
	private JTextArea txtS;
	private JTable tblTabla;
	private DefaultTableModel modelo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_9_1 frame = new Propuesto_9_1();
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
	public Propuesto_9_1() {
		setTitle("Propuesto_9_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		lblRuc = new JLabel("RUC");
		lblRuc.setBounds(10, 11, 40, 28);
		contentPane.add(lblRuc);
		
		lblEmpresa = new JLabel("Empresa");
		lblEmpresa.setBounds(123, 11, 60, 28);
		contentPane.add(lblEmpresa);	
		
		lblUnidades = new JLabel("Unidades");
		lblUnidades.setBounds(250, 11, 60, 28);
		contentPane.add(lblUnidades);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecio.setBounds(356, 11, 40, 28);
		contentPane.add(lblPrecio);		
		
		txtRuc = new JTextField();
		txtRuc.setBounds(38, 11, 70, 28);
		contentPane.add(txtRuc);
		txtRuc.setColumns(10);
		
		txtEmpresa = new JTextField();
		txtEmpresa.setBounds(180, 11, 60, 28);
		contentPane.add(txtEmpresa);
		txtEmpresa.setColumns(10);
		
		txtUnidades = new JTextField();
		txtUnidades.setBounds(308, 11, 40, 28);
		contentPane.add(txtUnidades);
		txtUnidades.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(402, 11, 40, 28);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(450, 50, 155, 23);
		contentPane.add(btnAdicionar);
		
		btnReportar = new JButton("Reportar");
		btnReportar.setBounds(450, 75, 155, 23);
		btnReportar.addActionListener(this);
		contentPane.add(btnReportar);
		
		scrollPaneA = new JScrollPane();
		scrollPaneA.setBounds(10, 50, 432, 200);
		contentPane.add(scrollPaneA);
		
		tblTabla = new JTable();
		tblTabla.setFillsViewportHeight(true);
		scrollPaneA.setViewportView(tblTabla);

		modelo = new DefaultTableModel();
		modelo.addColumn("ruc");
		modelo.addColumn("empresa");
		modelo.addColumn("unidades");
		modelo.addColumn("precio");
		modelo.addColumn("importe");
		tblTabla.setModel(modelo);

		scrollPaneB = new JScrollPane();
		scrollPaneB.setBounds(10, 252, 432, 70);
		contentPane.add(scrollPaneB);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPaneB.setViewportView(txtS);
		
		listar();		
	}
	//declaracion global 
	
	ArregloFacturas fac= new ArregloFacturas();
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
	}
	
	//  Declaración global
	
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		/**
		 * Agrega una nueva factura
		 */	
		String ruc = leerRuc();
		String empresa =leerEmpresa();
		int unidades = leerUnidades();
		double precioUnitario = leerPrecio();
		
	  Factura nuevo = new Factura(ruc,empresa,unidades,precioUnitario);
	
		
	  fac.adicionar(nuevo);
	  listar();
	  limpieza();

	}
	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		/**
		 * Visualiza un reporte
		 */
		
		imprimir("Ruc :  " + fac.tamaño());
		imprimir("Suma de importes :  " + fac.sumaImportes());
		imprimir("Importe promedio  :  " + fac.impPromedio());
		imprimir("Importe menor  :  " + fac.impMenor());
		imprimir("Importe mayor   :  " + fac.impMayor());
		imprimir("Nombre de la empresa cuyo importe es menor que el promedio :  " + fac.nomEmpImpMenor());
		

  	}
	//  Métodos tipo void sin parámetros
	void limpieza() {
		txtRuc.setText("");
		txtEmpresa.setText("");
		txtUnidades.setText("");
		txtPrecio.setText("");
		txtRuc.requestFocus();
	}
	//  Métodos tipo void sin parámetros
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void con parámetros
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
   	void listar() {
   		modelo.setRowCount(0);
		for (int i=0; i<fac.tamaño(); i++) {
			Object fila[] = { fac.obtener(i).getRuc(),
					          fac.obtener(i).getEmpresa(),
					          fac.obtener(i).getUnidades(),
					          fac.obtener(i).getPrecioUnitario(),
					          fac.obtener(i).importFacturado()
					          };
			modelo.addRow(fila);
		}

	}
	//  Métodos tipo void con parámetros
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}		
	//  Métodos que retornan valor sin parámetros
	String leerRuc() {
		return txtRuc.getText().trim();
	}
	String leerEmpresa() {
		return txtEmpresa.getText().trim();
	}
	int leerUnidades() {
		return Integer.parseInt(txtUnidades.getText().trim());
	}
	double leerPrecio() {
		return Double.parseDouble(txtPrecio.getText().trim());
	}
	
}