package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class calculadoraController {

	@FXML
	private Button ce;
	@FXML
	private Button c;
	@FXML
	private Button del;
	@FXML
	private Button dividir;
	@FXML
	private Button multiplicar;
	@FXML
	private Button somar;
	@FXML
	private Button subtrair;
	@FXML
	private Button resultado;
	@FXML
	private Button um;
	@FXML
	private Button dois;
	@FXML
	private Button tres;
	@FXML
	private Button quatro;
	@FXML
	private Button cinco;
	@FXML
	private Button seis;
	@FXML
	private Button sete;
	@FXML
	private Button oito;
	@FXML
	private Button nove;
	@FXML
	private Button zero;
	@FXML
	private Button maisOuMenos;
	@FXML
	private Button ponto;
	@FXML
	private TextField tela;
	@FXML
	private TextField tela2;

	@FXML
	public void onZeroAction() {
		String aux = tela.getText() + "0";
		tela.setText(aux);
	}

	@FXML
	public void onUmAction() {
		String aux = tela.getText() + "1";
		tela.setText(aux);
	}

	@FXML
	public void onDoisAction() {
		String aux = tela.getText() + "2";
		tela.setText(aux);
	}

	@FXML
	public void onTresAction() {
		String aux = tela.getText() + "3";
		tela.setText(aux);
	}

	@FXML
	public void onQuatroAction() {
		String aux = tela.getText() + "4";
		tela.setText(aux);
	}

	@FXML
	public void onCincoAction() {
		String aux = tela.getText() + "5";
		tela.setText(aux);
	}

	@FXML
	public void onSeisAction() {
		String aux = tela.getText() + "6";
		tela.setText(aux);
	}

	@FXML
	public void onSeteAction() {
		String aux = tela.getText() + "7";
		tela.setText(aux);
	}

	@FXML
	public void onOitoAction() {
		String aux = tela.getText() + "8";
		tela.setText(aux);
	}

	@FXML
	public void onNoveAction() {
		String aux = tela.getText() + "9";
		tela.setText(aux);
	}
	
	@FXML
	public void onPontoAction() {
		String aux = tela.getText() + ".";
		tela.setText(aux);
	}
	
	@FXML
	public void onMaisOuMenos() {
		float aux = Float.parseFloat(tela.getText());
		if (aux > 0) {
			String aux2 = "-" + Float.toString(aux);
			tela.setText(aux2);
		} else {
			String aux2 = Float.toString(aux);
			String aux3 = aux2.substring(1, aux2.length() - 1);
			tela.setText(aux3);
		}
	}

	@FXML
	public void onCeAction() {
		tela.clear();
	}

	@FXML
	public void onCAction() {
		tela.clear();
		tela2.clear();
	}

	@FXML
	public void onDelAction() {
		String aux = tela.getText();
		String aux2 = tela2.getText();
		if (aux.isEmpty() && aux2.isEmpty()) {
			tela.clear();
		} else if (aux.isEmpty()) {
			String aux3 = aux2.substring(0, aux2.length() - 1);
			tela2.setText(aux3);
		} else {
			String aux4 = aux.substring(0, aux.length() - 1);
			tela.setText(aux4);	
		}
	}

	@FXML
	public void onDividirAction() {
		String valor = tela2.getText();
		String operador = "÷";
		operadorResultado(valor, operador);
	}

	@FXML
	public void onMultiplicarAction() {
		String valor = tela2.getText();
		String operador = "X";
		operadorResultado(valor, operador);
	}

	@FXML
	public void onSomarAction() {
		String valor = tela2.getText();
		String operador = "+";
		operadorResultado(valor, operador);
	}

	@FXML
	public void onSubtrairAction() {
		String valor = tela2.getText();
		String operador = "-";
		operadorResultado(valor, operador);
	}

	@FXML
	public void onResultadoAction() {
		String string = tela2.getText();
		if (string == "") {
			tela2.setText(tela.getText());
			tela.clear();
		} else if (tela.getText().isEmpty()) {
			tela2.clear();
		} else {
			float valor1 = Float.parseFloat(string.substring(0, string.length() - 1));
			float valor2 = Float.parseFloat(tela.getText());
			if (string.contains("÷")) {
				float resultado = valor1 / valor2;
				tela2.setText(Float.toString(resultado));
				tela.clear();
			} else if (string.contains("X")) {
				float resultado = valor1 * valor2;
				tela2.setText(Float.toString(resultado));
				tela.clear();
			} else if (string.contains("+")) {
				float resultado = valor1 + valor2;
				tela2.setText(Float.toString(resultado));
				tela.clear();
			} else if (string.contains("-")) {
				float resultado = valor1 - valor2;
				tela2.setText(Float.toString(resultado));
				tela.clear();
			}
		}
	}

	public void operadorResultado(String valor, String operador) {
		if (valor == "") {
			tela2.setText(tela.getText() + operador);
			tela.clear();
		} else if (valor.contains("÷") && tela.getText() != "") {
			String string = tela2.getText();
			float valor1 = Float.parseFloat(string.substring(0, string.length() - 1));
			float valor2 = Float.parseFloat(tela.getText());
			float resultado = valor1 / valor2;
			tela2.setText(Float.toString(resultado) + operador);
			tela.clear();
		} else if (valor.contains("X") && tela.getText() != "") {
			String string = tela2.getText();
			float valor1 = Float.parseFloat(string.substring(0, string.length() - 1));
			float valor2 = Float.parseFloat(tela.getText());
			float resultado = valor1 * valor2;
			tela2.setText(Float.toString(resultado) + operador);
			tela.clear();
		} else if (valor.contains("+") && tela.getText() != "") {
			String string = tela2.getText();
			float valor1 = Float.parseFloat(string.substring(0, string.length() - 1));
			float valor2 = Float.parseFloat(tela.getText());
			float resultado = valor1 + valor2;
			tela2.setText(Float.toString(resultado) + operador);
			tela.clear();
		} else if (valor.contains("-") && tela.getText() != "") {
			String string = tela2.getText();
			float valor1 = Float.parseFloat(string.substring(0, string.length() - 1));
			float valor2 = Float.parseFloat(tela.getText());
			float resultado = valor1 - valor2;
			tela2.setText(Float.toString(resultado) + operador);
			tela.clear();
		} else {
			if (tela.getText().isEmpty()) {
				String string = tela2.getText();
				if (string.contains("÷") || string.contains("X") || string.contains("+") || string.contains("-")) {
					tela2.setText(Float.parseFloat(string.substring(0, string.length() - 1)) + operador);
				} else {
					String aux2 = tela2.getText() + operador;
					tela2.setText(aux2);
					tela.clear();
				}
			} else {
				if (operador == "÷") {
					float valor1 = Float.parseFloat(tela2.getText());
					float valor2 = Float.parseFloat(tela.getText());
					float resultado = valor1 / valor2;
					tela2.setText(Float.toString(resultado) + operador);
					tela.clear();
				} else if (operador == "X") {
					float valor1 = Float.parseFloat(tela2.getText());
					float valor2 = Float.parseFloat(tela.getText());
					float resultado = valor1 * valor2;
					tela2.setText(Float.toString(resultado) + operador);
					tela.clear();
				} else if (operador == "+") {
					float valor1 = Float.parseFloat(tela2.getText());
					float valor2 = Float.parseFloat(tela.getText());
					float resultado = valor1 + valor2;
					tela2.setText(Float.toString(resultado) + operador);
					tela.clear();
				} else if (operador == "-") {
					float valor1 = Float.parseFloat(tela2.getText());
					float valor2 = Float.parseFloat(tela.getText());
					float resultado = valor1 - valor2;
					tela2.setText(Float.toString(resultado) + operador);
					tela.clear();
				}
			}
		}
	}
}
