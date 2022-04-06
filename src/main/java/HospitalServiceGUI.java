import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;

public class HospitalServiceGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HospitalServiceGUI frame = new HospitalServiceGUI();
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
	public HospitalServiceGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 391);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 175, 175));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(130, 44, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First Name :\n");
		lblNewLabel.setBounds(21, 49, 80, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setBounds(21, 77, 80, 16);
		contentPane.add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 72, 130, 26);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Hospital Service");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(217, 6, 257, 35);
		contentPane.add(lblNewLabel_1);
		
		JSlider slider = new JSlider();
		slider.setBounds(34, 315, 502, 29);
		contentPane.add(slider);
		
		JLabel lblNewLabel_2 = new JLabel("Rate your Experience !");
		lblNewLabel_2.setBounds(217, 287, 166, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblPricingPlan = new JLabel("Pricing Plan :");
		lblPricingPlan.setBounds(21, 169, 96, 16);
		contentPane.add(lblPricingPlan);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Premium");
		tglbtnNewToggleButton.setBounds(130, 121, 161, 29);
		contentPane.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnPaymentPlan = new JToggleButton("Payment Plan");
		tglbtnPaymentPlan.setBounds(130, 205, 161, 29);
		contentPane.add(tglbtnPaymentPlan);
		
		JToggleButton tglbtnNewToggleButton_1_1 = new JToggleButton("General");
		tglbtnNewToggleButton_1_1.setBounds(130, 164, 161, 29);
		contentPane.add(tglbtnNewToggleButton_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Number of Beds:");
		lblNewLabel_3.setBounds(381, 189, 104, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Number of Patients:");
		lblNewLabel_3_1.setBounds(370, 64, 125, 16);
		contentPane.add(lblNewLabel_3_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(370, 205, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(370, 77, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
