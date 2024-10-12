public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1986;
        boolean incluidoNoPlano = false; // true ou false
        double notaDoFilme = 8.1;
        String tipoPlano = "normal"; //normal ou plus

        if(anoDeLancamento >= 2022) {
            System.out.println("Lançamento ue os Cliente estão curtindo");
        } else {
                System.out.println("Filme retrô que vale a pena assistir");
        }
        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
