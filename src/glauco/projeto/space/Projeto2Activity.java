package glauco.projeto.space;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Projeto2Activity extends Activity {
	private double operando1, operando2, resultado;
	private EditText etOperando1, etOperando2;
	private Button btSomar;
	private Button btDiminuir;
	private Button btDiv;
	private Button btMult;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        etOperando1 = (EditText) findViewById(R.id.editText1);
        etOperando2 = (EditText) findViewById(R.id.editText2);
        btDiminuir = (Button) findViewById(R.id.button2);
        btSomar = (Button) findViewById(R.id.button1);
        btDiv = (Button) findViewById(R.id.button3);
        btMult = (Button) findViewById(R.id.button4);
        
        btDiminuir.setOnClickListener( new OnClickListener(){
        	public void onClick(View v){
        		operando1 = Double.parseDouble(etOperando1.getText().toString());
        		operando2 = Double.parseDouble(etOperando2.getText().toString());
        		
        		resultado = operando1 - operando2;
        		exibeResultado(resultado);
        	}
        }
        
        );
        btSomar.setOnClickListener(new OnClickListener(){
        	public void onClick(View v) {
        		
        		operando1 = Double.parseDouble(etOperando1.getText().toString());
        		operando2 = Double.parseDouble(etOperando2.getText().toString());
        		
        		resultado = operando1 + operando2;
        		exibeResultado(resultado);
        	}
        	});
        btMult.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		operando1 = Double.parseDouble(etOperando1.getText().toString());
        		operando2 = Double.parseDouble(etOperando2.getText().toString());
        		
        		resultado = operando1 * operando2;
        		exibeResultado(resultado);
        	}
        
    });     
        }
    private void exibeResultado(double resultado){
    	AlertDialog.Builder dialogo = new AlertDialog.Builder(Projeto2Activity.this);
    	dialogo.setMessage(String.valueOf(resultado));
    	dialogo.setNegativeButton("Ok", null);
    	dialogo.show();
    	}
}