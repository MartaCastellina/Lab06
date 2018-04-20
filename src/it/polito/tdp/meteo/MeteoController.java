package it.polito.tdp.meteo;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;

public class MeteoController {

	
	private Model model;
	
	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private ChoiceBox<Integer> boxMese;

	@FXML
	private Button btnCalcola;

	@FXML
	private Button btnUmidita;

	@FXML
	private TextArea txtResult;

	@FXML
	void doCalcolaSequenza(ActionEvent event) {
//		try {
			
			Integer m=boxMese.getValue();
			
			String result="Sequenza ottimale:\n";
			result+=model.trovaSequenza(m);
			txtResult.setText(result);
//			}
//			catch(Exception e) {
//			
//				txtResult.setText("Devi selezionare un mese");
//			
//			}
		

	}

	@FXML
	void doCalcolaUmidita(ActionEvent event) {
		txtResult.clear();
		try {
		Integer m=boxMese.getValue();
		model.getUmiditaMedia(m);
		txtResult.setText(model.getUmiditaMedia(m));
		}
		catch(Exception e) {
		
			txtResult.setText("Devi selezionare un mese");
		
		}
		

//		Integer m=boxMese.getValue();
//		model.getUmiditaMedia(m);
//		txtResult.setText(model.getUmiditaMedia(m));
	}

	@FXML
	void initialize() {
		assert boxMese != null : "fx:id=\"boxMese\" was not injected: check your FXML file 'Meteo.fxml'.";
		assert btnCalcola != null : "fx:id=\"btnCalcola\" was not injected: check your FXML file 'Meteo.fxml'.";
		assert btnUmidita != null : "fx:id=\"btnUmidita\" was not injected: check your FXML file 'Meteo.fxml'.";
		assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Meteo.fxml'.";
	}
	
	public void setModel(Model m) {
		this.model=m;
		List <Integer> mesi=new ArrayList<Integer>();
		for(int i=1;i<=12;i++) {
			int j=i;
			mesi.add(j);
		}
		boxMese.getItems().addAll(mesi);
	}

}
