package paquetes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class logeo extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField jpassClave;
	private JButton btnIngresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logeo frame = new logeo();
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
	public logeo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(logeo.class.getResource("/IMAGENES/export.jpg")));
		setTitle("Inicio De Secion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 261);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUsuario.setIcon(new ImageIcon(logeo.class.getResource("/IMAGENES/usuario.jpg")));
		lblUsuario.setBounds(103, 13, 151, 31);
		contentPane.add(lblUsuario);
		
		JLabel lblUsuario_1 = new JLabel("Usuario");
		lblUsuario_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuario_1.setBounds(23, 60, 86, 22);
		contentPane.add(lblUsuario_1);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(23, 109, 105, 21);
		contentPane.add(lblContrasea);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(138, 62, 116, 22);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		jpassClave = new JPasswordField();
		jpassClave.setBounds(138, 110, 116, 22);
		contentPane.add(jpassClave);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char [] clave = jpassClave.getPassword();
				String ClaveFinal= new String (clave);
				
				if(txtUsuario.getText().equals("IMPORTACIONES")&& ClaveFinal.equals("12345")){
					dispose();
					JOptionPane.showMessageDialog(null,"Bienvenido al sistema","INGRESASTE",
							JOptionPane.INFORMATION_MESSAGE);
					Principal p = new Principal ();
					p.setVisible(true);
					
			   
				}else{
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta","ERROR",
							JOptionPane.ERROR_MESSAGE);
					txtUsuario.setText("");
					jpassClave.setText("");
					txtUsuario.requestFocus();
				}
				
			}
		});
		btnIngresar.setBounds(308, 91, 99, 39);
		contentPane.add(btnIngresar);
	}
}
