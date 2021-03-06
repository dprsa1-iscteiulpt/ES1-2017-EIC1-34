package Alberto;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Gui extends JFrame {

	private JPanel contentPane;
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
					Gui frame = new Gui();
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
	public Gui() {
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblPathRulescf = new JLabel("Path rules.cf");
		GridBagConstraints gbc_lblPathRulescf = new GridBagConstraints();
		gbc_lblPathRulescf.insets = new Insets(0, 0, 5, 5);
		gbc_lblPathRulescf.anchor = GridBagConstraints.EAST;
		gbc_lblPathRulescf.gridx = 2;
		gbc_lblPathRulescf.gridy = 1;
		contentPane.add(lblPathRulescf, gbc_lblPathRulescf);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JCheckBox checkBox = new JCheckBox("");
		GridBagConstraints gbc_checkBox = new GridBagConstraints();
		gbc_checkBox.insets = new Insets(0, 0, 5, 0);
		gbc_checkBox.gridx = 4;
		gbc_checkBox.gridy = 1;
		contentPane.add(checkBox, gbc_checkBox);
		
		JLabel lblPathHamlog = new JLabel("Path ham.log");
		GridBagConstraints gbc_lblPathHamlog = new GridBagConstraints();
		gbc_lblPathHamlog.anchor = GridBagConstraints.EAST;
		gbc_lblPathHamlog.insets = new Insets(0, 0, 5, 5);
		gbc_lblPathHamlog.gridx = 2;
		gbc_lblPathHamlog.gridy = 2;
		contentPane.add(lblPathHamlog, gbc_lblPathHamlog);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 2;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_1 = new GridBagConstraints();
		gbc_checkBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_checkBox_1.gridx = 4;
		gbc_checkBox_1.gridy = 2;
		contentPane.add(checkBox_1, gbc_checkBox_1);
		
		JLabel lblPathSpamlog = new JLabel("Path spam.log");
		GridBagConstraints gbc_lblPathSpamlog = new GridBagConstraints();
		gbc_lblPathSpamlog.anchor = GridBagConstraints.EAST;
		gbc_lblPathSpamlog.insets = new Insets(0, 0, 5, 5);
		gbc_lblPathSpamlog.gridx = 2;
		gbc_lblPathSpamlog.gridy = 3;
		contentPane.add(lblPathSpamlog, gbc_lblPathSpamlog);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 3;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_2 = new GridBagConstraints();
		gbc_checkBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_checkBox_2.gridx = 4;
		gbc_checkBox_2.gridy = 3;
		contentPane.add(checkBox_2, gbc_checkBox_2);

		
		//---------------------------------------------- CONFIG. MANUAL ----------------------------------------------
		
		JLabel lblconfigManual = new JLabel("_________________________CONFIG. MANUAL_________________________");
		GridBagConstraints gbc_lblconfigManual = new GridBagConstraints();
		gbc_lblconfigManual.gridwidth = 5;
		gbc_lblconfigManual.insets = new Insets(0, 0, 5, 0);
		gbc_lblconfigManual.gridx = 0;
		gbc_lblconfigManual.gridy = 4;
		contentPane.add(lblconfigManual, gbc_lblconfigManual);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 5;
		contentPane.add(comboBox, gbc_comboBox);
		
		JButton btnAvaliar = new JButton("Avaliar Qualidade Config.");
		btnAvaliar.setFont(new Font("Courier New", Font.BOLD, 13));
		GridBagConstraints gbc_btnAvaliar = new GridBagConstraints();
		gbc_btnAvaliar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAvaliar.gridx = 3;
		gbc_btnAvaliar.gridy = 5;
		contentPane.add(btnAvaliar, gbc_btnAvaliar);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 2;
		gbc_comboBox_1.gridy = 6;
		contentPane.add(comboBox_1, gbc_comboBox_1);
		
		JButton btnGravar = new JButton("Gravar Config.");
		btnGravar.setFont(new Font("Courier New", Font.BOLD, 13));
		GridBagConstraints gbc_btnGravar = new GridBagConstraints();
		gbc_btnGravar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGravar.gridx = 3;
		gbc_btnGravar.gridy = 6;
		contentPane.add(btnGravar, gbc_btnGravar);
		
		JLabel lblFalsosPositivos = new JLabel("Falsos Positivos");
		lblFalsosPositivos.setForeground(new Color(0, 128, 0));
		lblFalsosPositivos.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		GridBagConstraints gbc_lblFalsosPositivos = new GridBagConstraints();
		gbc_lblFalsosPositivos.anchor = GridBagConstraints.EAST;
		gbc_lblFalsosPositivos.insets = new Insets(0, 0, 5, 5);
		gbc_lblFalsosPositivos.gridx = 2;
		gbc_lblFalsosPositivos.gridy = 7;
		contentPane.add(lblFalsosPositivos, gbc_lblFalsosPositivos);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 7;
		contentPane.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblFalsosNegativos = new JLabel("Falsos Negativos");
		lblFalsosNegativos.setForeground(Color.RED);
		lblFalsosNegativos.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		GridBagConstraints gbc_lblFalsosNegativos = new GridBagConstraints();
		gbc_lblFalsosNegativos.anchor = GridBagConstraints.EAST;
		gbc_lblFalsosNegativos.insets = new Insets(0, 0, 5, 5);
		gbc_lblFalsosNegativos.gridx = 2;
		gbc_lblFalsosNegativos.gridy = 8;
		contentPane.add(lblFalsosNegativos, gbc_lblFalsosNegativos);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 8;
		contentPane.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		
		//---------------------------------------------- CONFIG. AUTO ----------------------------------------------
		
		JLabel lblNewLabel = new JLabel("_________________________CONFIG. AUTO_________________________");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 5;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 9;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 2;
		gbc_comboBox_2.gridy = 11;
		contentPane.add(comboBox_2, gbc_comboBox_2);
		
		JButton btnGerarConfigurao = new JButton("Gerar Configuração");
		btnGerarConfigurao.setFont(new Font("Courier New", Font.BOLD, 13));
		GridBagConstraints gbc_btnGerarConfigurao = new GridBagConstraints();
		gbc_btnGerarConfigurao.insets = new Insets(0, 0, 5, 5);
		gbc_btnGerarConfigurao.gridx = 3;
		gbc_btnGerarConfigurao.gridy = 11;
		contentPane.add(btnGerarConfigurao, gbc_btnGerarConfigurao);
		
		JButton btnGravar_1 = new JButton("Gravar");
		btnGravar_1.setFont(new Font("Courier New", Font.BOLD, 13));
		GridBagConstraints gbc_btnGravar_1 = new GridBagConstraints();
		gbc_btnGravar_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnGravar_1.gridx = 3;
		gbc_btnGravar_1.gridy = 12;
		contentPane.add(btnGravar_1, gbc_btnGravar_1);
		
		JLabel lblFalsosPositivos_1 = new JLabel("Falsos Positivos");
		lblFalsosPositivos_1.setForeground(new Color(0, 128, 0));
		lblFalsosPositivos_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		GridBagConstraints gbc_lblFalsosPositivos_1 = new GridBagConstraints();
		gbc_lblFalsosPositivos_1.anchor = GridBagConstraints.EAST;
		gbc_lblFalsosPositivos_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblFalsosPositivos_1.gridx = 2;
		gbc_lblFalsosPositivos_1.gridy = 13;
		contentPane.add(lblFalsosPositivos_1, gbc_lblFalsosPositivos_1);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 3;
		gbc_textField_5.gridy = 13;
		contentPane.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblFalsosNegativos_1 = new JLabel("Falsos Negativos");
		lblFalsosNegativos_1.setForeground(Color.RED);
		lblFalsosNegativos_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		GridBagConstraints gbc_lblFalsosNegativos_1 = new GridBagConstraints();
		gbc_lblFalsosNegativos_1.anchor = GridBagConstraints.EAST;
		gbc_lblFalsosNegativos_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblFalsosNegativos_1.gridx = 2;
		gbc_lblFalsosNegativos_1.gridy = 14;
		contentPane.add(lblFalsosNegativos_1, gbc_lblFalsosNegativos_1);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 0, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 3;
		gbc_textField_6.gridy = 14;
		contentPane.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
	}

}
