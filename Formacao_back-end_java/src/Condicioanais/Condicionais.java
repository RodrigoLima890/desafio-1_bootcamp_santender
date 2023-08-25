package Condicioanais;

public class Condicionais {
    public static void main(String[] args) {
        //Condição Simples e Composta
//        double saldo = 25.0;
//        double valorSocitado = 17.0;
//
//        if(valorSocitado < saldo)
//                saldo -= valorSocitado;
//
//        System.out.println(saldo);

        //Ternária
        int nota = 4;
        String resultado = nota >= 7 ? "Aprovado": nota >= 5 && nota < 7 ? "Recuperação": "Reprovado";
        System.out.println(resultado);
        //switch case
        String sigla = "M";

        switch (sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
