package paquetes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.SystemColor;

public class Principal extends JFrame {

	private JPanel contentPane;
	
	private jfproductos jp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	void diseñaGUI(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/IMAGENES/export.jpg")));
		setTitle("Importaciones \"KIM\" I.E.R.L");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 354);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSistema = new JMenu("Sistema");
		mnSistema.setIcon(new ImageIcon(Principal.class.getResource("/IMAGENES/sistema1.png")));
		menuBar.add(mnSistema);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(JOptionPane.showConfirmDialog(null,"Estas seguro de Cerrar el Programa","SALIR",JOptionPane.YES_NO_OPTION)==0)
					System.exit(0);
				
				
			}
		});
		btnSalir.setIcon(new ImageIcon(Principal.class.getResource("/IMAGENES/salida1.jpg")));
		mnSistema.add(btnSalir);
		
		JMenu mnProductos = new JMenu("Productos");
		mnProductos.setIcon(new ImageIcon(Principal.class.getResource("/IMAGENES/producto.png")));
		menuBar.add(mnProductos);
		
		JMenu mnFacturacion = new JMenu("Facturacion");
		mnFacturacion.setIcon(new ImageIcon(Principal.class.getResource("/IMAGENES/ffactura.png")));
		menuBar.add(mnFacturacion);
		
		JMenuItem mntmFactura = new JMenuItem("Factura");
		mnFacturacion.add(mntmFactura);
		
		JMenu mnAyuda = new JMenu("Acerca del Sistema");
		mnAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		mnAyuda.setIcon(new ImageIcon(Principal.class.getResource("/IMAGENES/ayuda.jpg")));
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAcercaDe = new JMenuItem("Acerca de ");
		mntmAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Desarrollador  \n Jhosep Huerta : jhosephuerta206@gmail.com \n Numero : 912345635", "Acerca de",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		mnAyuda.add(mntmAcercaDe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(12, 13, 519, 254);
		contentPane.add(panel);
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
		diseñaGUI();	
	}
	
	void cargaProductos() {
	}
	
}
