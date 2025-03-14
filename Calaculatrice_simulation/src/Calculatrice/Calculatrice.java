package Calculatrice;

class Calculatrice {
    public double addition(double a, double b) {
        return a + b;
    }
    
    public double soustraction(double a, double b) {
        return a - b;
    }
    
    public double multiplication(double a, double b) {
        return a * b;
    }
    
    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erreur : Division par zéro non autorisée.");
        }
        return a / b;
    }
}
