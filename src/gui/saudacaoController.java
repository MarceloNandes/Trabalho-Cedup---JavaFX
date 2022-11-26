package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class saudacaoController {
	
	@FXML
	private TextField txtNome;
	
	@FXML
	private TextField txtSaudacao;
	
	@FXML
	private Label lbResultado;
	
	@FXML
	private Button btnSair;
	
	@FXML
	private Button btnLimpar;
	
	@FXML
	private Button btnExibir;
	
	@FXML
	public void OnBtSairAction() {
		System.exit(1);
	}
	
	@FXML
	public void OnBtLimparAction() {
		txtNome.setText("");
		txtSaudacao.setText("");
		lbResultado.setText("");
	}
	
	@FXML
	public void OnBtExibirAction() {
		String nome = txtNome.getText();
		String saudacao = txtSaudacao.getText();
		lbResultado.setText(nome.toUpperCase() + ": " + saudacao);
	}
	

}
