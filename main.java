package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mensaje;

    private EditText valor1;

    private EditText valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mensaje=findViewById(R.id.resultado);
        valor1=findViewById(R.id.caja1);
        valor2=findViewById(R.id.caja2);
    }
    public void suma (View view){
        int num1 = Integer.parseInt(valor1.getText().toString());
        int num2 = Integer.parseInt(valor2.getText().toString());

         mensaje.setText(String.valueOf(num1 + num2));
    }
    public void multiplicacion (View view){
        int num1 = Integer.parseInt(valor1.getText().toString());
        int num2 = Integer.parseInt(valor2.getText().toString());

        mensaje.setText(String.valueOf(num1 * num2));
    }
    public void division (View view){
        int num1 = Integer.parseInt(valor1.getText().toString());
        int num2 = Integer.parseInt(valor2.getText().toString());

        mensaje.setText(String.valueOf(num1 / num2));
    }
    public void resta (View view){
        int num1 = Integer.parseInt(valor1.getText().toString());
        int num2 = Integer.parseInt(valor2.getText().toString());

        mensaje.setText(String.valueOf(num1 - num2));
    }
    public void potencia(View view){

        int a = Integer.parseInt(valor1.getText().toString());
        int b = Integer.parseInt(valor2.getText().toString());

        int resultado = Calcular(a,b);

          mensaje.setText(String.valueOf(resultado));
        }
        public static int Calcular(int n,int b){
            int x=1;
            if(n>0&&b==0){
                return x;
            } else if(n==0&&b>=1){
                return 0;

            }
            else{
                for(int i=1;i<=b;i++)
                    x=x*n;
            }
            return x;
        }
    }
