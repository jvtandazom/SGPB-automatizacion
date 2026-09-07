package ec.uea.spgb;

public final class CalculadoraMulta {
    private CalculadoraMulta() {}
    public static double calcular(int diasAtraso) {
        if (diasAtraso <= 0) return 0.0;
        return diasAtraso * 0.50;
    }
}