package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1, tv2;
    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_Num1);
        et2 = (EditText) findViewById(R.id.txt_Num2);
        tv1 = (TextView) findViewById(R.id.textView_Respuesta);
        //tv2 = (TextView) findViewById(R.id.tv_mayor);
        rb1 = (RadioButton) findViewById(R.id.rb_suma);
        rb2 = (RadioButton) findViewById(R.id.rb_resta);
        rb3 = (RadioButton) findViewById(R.id.rb_multiplicacion);
        rb4 = (RadioButton) findViewById(R.id.rb_division);
        rb5 = (RadioButton) findViewById(R.id.rb_factor);
        rb6 = (RadioButton) findViewById(R.id.rb_porcentaje);
        rb7 = (RadioButton) findViewById(R.id.rb_exponenciacion);
        rb8 = (RadioButton) findViewById(R.id.rb_raiz);
        rb9 = (RadioButton) findViewById(R.id.rb_mod);
        rb10 = (RadioButton) findViewById(R.id.rb_mayor);

    }


    public void Calcular(View view) {
        String num1 = et1.getText().toString();
        String num2 = et2.getText().toString();


        double Valor1 = Double.parseDouble(num1);
        double Valor2 = Double.parseDouble(num2);


        if (rb1.isChecked() == true) {

            double suma = Valor1 + Valor2;
            String Resultado = String.valueOf(suma);
            tv1.setText(Resultado);

        } else if (rb2.isChecked() == true) {

            double resta = Valor1 - Valor2;
            String Resultado = String.valueOf(resta);
            tv1.setText(Resultado);
        } else if (rb3.isChecked() == true) {

            double multiplicacion = Valor1 * Valor2;
            String Resultado = String.valueOf(multiplicacion);
            tv1.setText(Resultado);
        } else if (rb4.isChecked() == true) {

            double division = Valor1 / Valor2;
            String Resultado = String.valueOf(division);
            tv1.setText(Resultado);
        } else if (rb5.isChecked() == true) {

            if (et1.getText().toString().equals("")) et1.setText("0");
            long factorial = 1;
            int num = Integer.parseInt(et1.getText().toString());
            for (int i = 1; i <= num; i++) {
                factorial = i * factorial;
                tv1.setText(String.valueOf(factorial));
            }
        } else if (rb6.isChecked() == true) {

            double porcentaje = (Valor1 * Valor2) / 100;
            String Resultado = String.valueOf(porcentaje);
            tv1.setText(Resultado);


        } else if (rb7.isChecked() == true) {
            double Expo = Math.pow(Valor1, Valor2);
            String Resultado = String.valueOf(Expo);
            tv1.setText(Resultado);

        } else if (rb8.isChecked() == true) {
            double Raiz = Math.pow(Valor1, 1 / Valor2);
            String Resultado = String.valueOf(Raiz);
            tv1.setText(Resultado);
        } else if (rb9.isChecked() == true) {
            double MOD = Valor1 % Valor2;
            String Resultado = String.valueOf(MOD);
            tv1.setText(Resultado);
        } else if (rb10.isChecked() == true) {
            if (Valor1 > Valor2) {
                tv1.setText("El numero mayor es " + Valor1);
            } else if (Valor1 == Valor2) {
                tv1.setText("Ambos numeros son iguales");
            } else
                tv1.setText("El numero mayor es " + Valor2);
        }
    }
}























//if (rb10.isChecked() == true) {
       // if (Valor1 > Valor2){


        //tv2.setText("El numero mayor es " + Valor1);
//

       // }else if (Valor1 == Valor2){

        //tv2.setText("Ambos numeros son iguales");

        //}else
       // tv2.setText("El numero mayor es " + Valor2);