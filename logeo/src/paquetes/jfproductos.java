package paquetes;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class jfproductos extends JInternalFrame {
	private JComboBox comboBox;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfproductos frame = new jfproductos();
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
	public jfproductos() {
		setTitle("SISTEMA DE VENTAS ");
		setBounds(100, 100, 428, 531);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel.setForeground(SystemColor.activeCaption);
		panel.setBounds(12, 13, 371, 439);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pantalon");
		lblNewLabel.setBounds(12, 27, 56, 16);
		panel.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"S", "M", "L", "XL", "XXL"}));
		comboBox.setBounds(80, 24, 49, 22);
		panel.add(comboBox);
		
		JLabel lblCantidad = new JLabel("CANTIDAD");
		lblCantidad.setBounds(171, 27, 75, 16);
		panel.add(lblCantidad);
		
		textField = new JTextField();
		textField.setBounds(249, 24, 89, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblCamisa = new JLabel("Camisa");
		lblCamisa.setBounds(12, 61, 56, 16);
		panel.add(lblCamisa);
		
		JLabel lblPolo = new JLabel("Polo");
		lblPolo.setBounds(12, 96, 56, 16);
		panel.add(lblPolo);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"S", "M", "L", "XL", "XXL"}));
		comboBox_1.setBounds(80, 58, 49, 22);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"S", "M", "L", "XL", "XXL"}));
		comboBox_2.setBounds(80, 90, 49, 22);
		panel.add(comboBox_2);
		
		JLabel label = new JLabel("CANTIDAD");
		label.setBounds(171, 61, 75, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("CANTIDAD");
		label_1.setBounds(171, 96, 75, 16);
		panel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(249, 58, 89, 22);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(249, 93, 89, 22);
		panel.add(textField_2);
		
		JButton btnProcesar = new JButton("Facturar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProcesar.setBounds(249, 401, 97, 25);
		panel.add(btnProcesar);
		
		textField_3 = new JTextField();
		textField_3.setBounds(135, 210, 145, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 210, 93, 22);
		panel.add(textArea);
		textArea.setText("Nombre");
		textArea.setFont(new Font("Monospaced", Font.BOLD, 15));
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(12, 245, 93, 22);
		panel.add(textArea_1);
		textArea_1.setText("Apellido");
		textArea_1.setFont(new Font("Monospaced", Font.BOLD, 15));
		
		textField_4 = new JTextField();
		textField_4.setBounds(135, 247, 145, 22);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(12, 280, 93, 22);
		panel.add(textArea_2);
		textArea_2.setText("Celular");
		textArea_2.setFont(new Font("Monospaced", Font.BOLD, 15));
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(12, 323, 93, 22);
		panel.add(textArea_3);
		textArea_3.setText("D.N.I");
		textArea_3.setFont(new Font("Monospaced", Font.BOLD, 15));
		
		textField_5 = new JTextField();
		textField_5.setBounds(135, 282, 145, 22);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(135, 325, 145, 22);
		panel.add(textField_6);
		textField_6.setColumns(10);

	}
}
