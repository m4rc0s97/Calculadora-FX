package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MyController {

	@FXML
	private Button suma;
	@FXML
	private Button resta;
	@FXML
	private Button multiplicar;
	@FXML
	private Button dividir;
	@FXML
	private Button raiz;
	@FXML
	private Button elevado;

	@FXML
	private TextField numero1;
	@FXML
	private TextField numero2;
	@FXML
	private TextField resultado;

	@FXML
	public void initialize() {
		// TODO (don't really need to do anything here).
	}

	public void sumar(ActionEvent event) {
		System.out.println("Sumando");
		Double x = Double.parseDouble(numero1.getText());
		Double y = Double.parseDouble(numero2.getText());
		Double sumar = x + y;
		resultado.setText(String.valueOf(sumar));
	}

	public void restar(ActionEvent event) {
		System.out.println("Restando");
		Double x = Double.parseDouble(numero1.getText());
		Double y = Double.parseDouble(numero2.getText());
		Double restar = x - y;
		resultado.setText(String.valueOf(restar));
	}

	public void multiplicar(ActionEvent event) {
		System.out.println("Multiplicando");
		Double x = Double.parseDouble(numero1.getText());
		Double y = Double.parseDouble(numero2.getText());
		Double multiplicar = x * y;
		resultado.setText(String.valueOf(multiplicar));
	}

	public void dividir(ActionEvent event) {
		System.out.println("Dividiendo");
		Double x = Double.parseDouble(numero1.getText());
		Double y = Double.parseDouble(numero2.getText());
		Double dividir = x / y;
		if (y == 0) {
			resultado.setText("No se puede dividir entre 0");
			
		}else {
			resultado.setText(String.valueOf(dividir));
		}
		
	}
	
	public void raizCuadrada(ActionEvent event) {
		System.out.println("Elevando");
		Double x = Double.parseDouble(numero1.getText());
		Double y = Double.parseDouble(numero2.getText());
		Double raiz = (Math.pow(x,1/y));
		resultado.setText(String.valueOf(raiz));
	}
	public void elevado(ActionEvent event) {
		System.out.println("Elevando");
		Double x = Double.parseDouble(numero1.getText());
		Double y = Double.parseDouble(numero2.getText());
		Double elevar = (Math.pow(x,y));
		resultado.setText(String.valueOf(elevar));
	}

}
