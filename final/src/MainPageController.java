
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.ToggleGroup;

import javafx.scene.control.TextArea;

import javafx.scene.control.RadioButton;

public class MainPageController implements Initializable{
	@FXML
	private Button btn;
	@FXML
	private TextArea upT;
	@FXML
	private TextArea downT;
	@FXML
	private RadioButton upRB;
	@FXML
	private ToggleGroup radio;
	@FXML
	private RadioButton downRB;
	@FXML
	private void handleButtonAction(ActionEvent event) {
        //upT.setText("hi");
		String s = upT.getText();
		if(upRB.isSelected() == true) {
			downT.setText(method_1(s));	
		}
		if(downRB.isSelected()==true) {
			downT.setText(method_2(s));	
		}
        
    }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
        btn.setOnAction(this::handleButtonAction);

	}
	public static String method_2(String s) {
		String[] st = s.split("/");
		String val ="";
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("●-","A");
		hm.put("-●●●","B");
		hm.put("-●-●","C");
		hm.put("-●●","D");
		hm.put("●","E");
		hm.put("●●-●","F");
		hm.put("--●","G");
		hm.put("●●●●","H");
		hm.put("●●","I");
		hm.put("●---","J");
		hm.put("-●-","K");
		hm.put("●-●●","L");
		hm.put("--","M");
		hm.put("-●","N");
		hm.put("---","O");
		hm.put("●--●","P");
		hm.put("--●-","Q");
		hm.put("●-●","R");
		hm.put("●●●","S");
		hm.put("-","T");
		hm.put("●●-","U");
		hm.put("●●●-","V");
		hm.put("●--","W");
		hm.put("-●●-","X");
		hm.put("-●--","Y");
		hm.put("--●●","Z");
		hm.put(" "," ");
		for(int x=0;x<st.length;x++) {
			val+=(String)hm.get(st[x]+"");
		}
		return val;
		//downT.setText(out);
		
	}
	public static String method_1(String s) {
		String st = s.toUpperCase();
		char[] buf = st.toCharArray();
		String val ="";
		HashMap<String,String> hm = new HashMap<String,String>();

		hm.put("A","●-");
		hm.put("B","-●●●");
		hm.put("C","-●-●");
		hm.put("D","-●●");
		hm.put("E","●");
		hm.put("F","●●-●");
		hm.put("G","--●");
		hm.put("H","●●●●");
		hm.put("I","●●");
		hm.put("J","●---");
		hm.put("K","-●-");
		hm.put("L","●-●●");
		hm.put("M","--");
		hm.put("N","-●");
		hm.put("O","---");
		hm.put("P","●--●");
		hm.put("Q","--●-");
		hm.put("R","●-●");
		hm.put("S","●●●");
		hm.put("T","-");
		hm.put("U","●●-");
		hm.put("V","●●●-");
		hm.put("W","●--");
		hm.put("X","-●●-");
		hm.put("Y","-●--");
		hm.put("Z","--●●");
		hm.put(" "," ");
		for(int x=0;x<buf.length;x++) {
			val+=(String)hm.get(buf[x]+"");
			val+="/";
		}
		//System.out.println(out);
		return val;
		
	}

}
