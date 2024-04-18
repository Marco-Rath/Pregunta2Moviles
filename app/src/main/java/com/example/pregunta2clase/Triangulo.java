package com.example.pregunta2clase;

public class Triangulo {
    protected Punto punto1;
    protected Punto punto2;
    protected Punto punto3;

    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    private double calcularDistancia(Punto p1, Punto p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy); 
    }

    public double calcularPerimetro() {
        double lado1 = calcularDistancia(punto1, punto2);
        double lado2 = calcularDistancia(punto2, punto3);
        double lado3 = calcularDistancia(punto3, punto1);
        return lado1 + lado2 + lado3;
    }

    public double calcularArea() {
        double perimetro = calcularPerimetro();
        double semiPerimetro = perimetro / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - calcularDistancia(punto1, punto2)) * (semiPerimetro - calcularDistancia(punto2, punto3)) * (semiPerimetro - calcularDistancia(punto3, punto1))); // Aquí usamos Math.sqrt para calcular la raíz cuadrada
    }
}
