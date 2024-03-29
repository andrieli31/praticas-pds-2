package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.PessoaDAO;
import modelo.Pessoa;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JLabel lblIdade;
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 50, 46, 14);
		contentPane.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(66, 47, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String idade = txtIdade.getText();
				String id = txtId.getText();
				Pessoa p = new Pessoa();
				p.setPrimeiro_nome(nome);
				p.setId(Integer.valueOf(id));
				p.setIdade(Integer.valueOf(idade));
				PessoaDAO dao = new PessoaDAO();
				dao.inserir(p);

				txtNome.setText(null);
				txtId.setText(null);
				txtIdade.setText(null);
			}
		});
		btnCadastrar.setBounds(10, 122, 89, 23);
		contentPane.add(btnCadastrar);

		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(66, 91, 86, 20);
		contentPane.add(txtIdade);

		lblIdade = new JLabel("Idade");
		lblIdade.setBounds(10, 94, 46, 14);
		contentPane.add(lblIdade);

		txtId = new JTextField();
		txtId.setBounds(66, 16, 86, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);

		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(22, 19, 17, 14);
		contentPane.add(lblNewLabel);
	}
}