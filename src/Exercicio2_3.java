import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2_3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDepositoMensal;
	private JTextField txtNumMeses;
	private JTextField txtJuros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2_3 frame = new Exercicio2_3();
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
	public Exercicio2_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 176);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Depósito Mensal (R$)");
		contentPane.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_2);
		
		txtDepositoMensal = new JTextField();
		panel_2.add(txtDepositoMensal);
		txtDepositoMensal.setColumns(20);
		
		JLabel lblNewLabel_1 = new JLabel("Num. Meses");
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_3.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_3);
		
		txtNumMeses = new JTextField();
		panel_3.add(txtNumMeses);
		txtNumMeses.setColumns(20);
		
		JLabel lblNewLabel_2 = new JLabel("Juros ao mes (%)");
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_4.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_4);
		
		txtJuros = new JTextField();
		panel_4.add(txtJuros);
		txtJuros.setColumns(20);
		
		JLabel lblNewLabel_3 = new JLabel("Total Investido + juros:");
		contentPane.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JLabel lblResultado = new JLabel("");
		panel.add(lblResultado);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String juros = txtJuros.getText();
				String dm = txtDepositoMensal.getText();
				String numMeses = txtNumMeses.getText();
				
				int numMesesInt = Integer.parseInt(numMeses);
				double dmDouble = Double.parseDouble(dm);
				double jurosDouble = Double.parseDouble(juros);
				
				Investimento inv = new Investimento(numMesesInt, jurosDouble, dmDouble);
				
				double total = inv.calculaTotal();
				String totalString = String.valueOf(total);
				lblResultado.setText(totalString);
				
			}
		});
		panel_5.add(btnNewButton);

	}

}
