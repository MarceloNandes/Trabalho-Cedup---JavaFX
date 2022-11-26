package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class bhaskaraController {
	
	@FXML
	private TextField A;
	@FXML
	private TextField B;
	@FXML
	private TextField C;
	@FXML
	private TextField delta;
	@FXML
	private TextField X1;
	@FXML
	private TextField X2;
	@FXML
	private Label semRaiz;
	@FXML
	private Button resultado;
	

	
	@FXML
	private void onResultadoAction() {	
		
		double valorDelta, valorX1, valorX2;
		
		double valorA = Double.parseDouble(A.getText());
		
		double valorB = Double.parseDouble(B.getText());
		
		double valorC = Double.parseDouble(C.getText());
		 		
	    valorDelta = (valorB * valorB) + (-4 * (valorA * valorC));
	    
	    delta.setText(Double.toString(valorDelta));
        
 
        if (valorDelta >= 0) {
        	valorX1 = (double) ((-(valorB) + Math.sqrt(valorDelta)) / (2 * valorA));
        	valorX2 = (double) ((-(valorB) - Math.sqrt(valorDelta)) / (2 * valorA));
        	
        	X1.setText(Double.toString(valorX1));
        	X2.setText(Double.toString(valorX2));
        } else {
            semRaiz.setText("Delta n�o possui raiz!");
        }
	}
}
