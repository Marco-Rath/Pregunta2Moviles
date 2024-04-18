package com.example.pregunta2clase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editTextX1,editTextY1,editTextX2,editTextY2,editTextX3,editTextY3;
    TextView textViewArea,textViewPerimetro;
    Button buttonCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextX1=findViewById(R.id.editTextX1);
        editTextY1=findViewById(R.id.editTextY1);
        editTextX2=findViewById(R.id.editTextX2);
        editTextY2=findViewById(R.id.editTextY2);
        editTextX3=findViewById(R.id.editTextX3);
        editTextY3=findViewById(R.id.editTextY3);
        textViewArea=findViewById(R.id.textViewArea);
        textViewPerimetro=findViewById(R.id.textViewPerimetro);
        buttonCalcular=findViewById(R.id.buttonCalcular);

    }

    public void Evento(View view) {
        if(view.getId()==R.id.buttonCalcular){
            // Obtén las coordenadas ingresadas por el usuario
            double x1 = Double.parseDouble(editTextX1.getText().toString());
            double y1 = Double.parseDouble(editTextY1.getText().toString());
            double x2 = Double.parseDouble(editTextX2.getText().toString());
            double y2 = Double.parseDouble(editTextY2.getText().toString());
            double x3 = Double.parseDouble(editTextX3.getText().toString());
            double y3 = Double.parseDouble(editTextY3.getText().toString());

            // Crea los objetos Punto
            Punto punto1 = new Punto(x1, y1);
            Punto punto2 = new Punto(x2, y2);
            Punto punto3 = new Punto(x3, y3);

            // Crea el objeto Triangulo
            Triangulo triangulo = new Triangulo(punto1, punto2, punto3);

            // Calcula el perímetro y el área
            double perimetro = triangulo.calcularPerimetro();
            double area = triangulo.calcularArea();

            // Muestra los resultados
            textViewPerimetro.setText("Perímetro: " + perimetro);
            textViewArea.setText("Área: " + area);

        }
    }
}
