package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_01.Persona;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_1_3 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_1_3 frame = new Problema_1_3();
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
	public Problema_1_3() {
		setTitle("Problema_1_3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 403);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		Persona p=new Persona();
		p.nombre="Fernando  ";
		p.apellido="Diaz";
		p.edad=24;
		p.estatura=1.70;
		p.peso=60;
		
		imprimir("nombre          :" + p.nombre);
		imprimir("apellido        :" + p.apellido);
		imprimir("edad            :" + p.edad);
		imprimir("estatura        :" + p.estatura);
		imprimir("peso            :" + p.peso);
		imprimir("masaCorporal    :" + p.masaCorporal());
		imprimir("estadoPersona   :" + p.estadoPersona());
		
		imprimir("");
		
	}
	//  M�todos tipo void con par�metros
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
}