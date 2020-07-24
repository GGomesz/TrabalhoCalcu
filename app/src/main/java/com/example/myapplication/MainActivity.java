package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView result;
    Button btnsoma;
    Button btndiv;
    Button btnmult;
    Button btnsub;

    int n1,n2,soma,mult,div,sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        result = (TextView)findViewById(R.id.resultado);
        btnsoma = (Button)findViewById(R.id.btnsoma);
        btndiv = (Button)findViewById(R.id.btndiv);
        btnsub = (Button)findViewById(R.id.btnsub);
        btnmult = (Button)findViewById(R.id.btnmult);
    }
    public void btnsoma(View view){
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        soma = n1 + n2;

        result.setText(Integer.toString(soma));
    }
    public void btndiv(View view){
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        div = n1 / n2;

        result.setText(Integer.toString(div));
    }
    public void btnmult(View view){
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        mult = n1 * n2;

        result.setText(Integer.toString(mult));
    }
    public void btnsub(View view){
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        sub = n1 - n2;

        result.setText(Integer.toString(sub));
    }
}
