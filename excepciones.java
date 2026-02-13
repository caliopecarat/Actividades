public class excepciones {

    public static void validarPar(int numero) {
        if (numero % 2 != 0) {
            throw new IllegalArgumentException("El número " + numero + " es impar. Se esperaba un número par.");
        }
        System.out.println("OK: " + numero + " es par.");
    }

    public static void main(String[] args) {
        int[] pruebas = {50, 9, 11, 7, 20};

        for (int n : pruebas) {
            System.out.println("Probando: " + n);
            try {
                validarPar(n);
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
            System.out.println("-------------------------");
        }
    }
}
