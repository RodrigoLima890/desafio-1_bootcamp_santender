package DesafioCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"João", "Maria", "Carlos", "Rodrigo", "Ana", "Pedro", "Patricia", "Jonas", "Luiza"
        , "Flavio"};
        List<String> cadidatosSelecionados = selecaoCandidatos(candidatos, 2000.0);

        for(String candidato : cadidatosSelecionados){
            entrandoEmContato(candidato);
        }
    }
    static List<String> selecaoCandidatos(String [] candidatos, double salarioBase) {
        int canditadosSelecionados = 0;
        int candidatoAtual = 0;
        ArrayList<String> listaCandidatosSelecionado = new ArrayList<>();
        while (canditadosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String canditado = candidatos[candidatoAtual];
            double salarioPretendido =valorPretendido();
            System.out.println("O canditado "+ canditado + " solicitou este valor de salário "+ salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ canditado + " Foi selecionado para a vaga");
                listaCandidatosSelecionado.add(canditado);
                canditadosSelecionados++;
            }
            candidatoAtual++;
        }
        System.out.println("******* RESULTADOS *******");
        System.out.println("Foram Selecionados "+canditadosSelecionados+" Candidatos");
        System.out.println("Foi/Foram Selecionado(s) Os Candidatos: ");
        for(String candidato : listaCandidatosSelecionado)
            System.out.println(candidato);
        return listaCandidatosSelecionado;
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuaTentando = !atendeu;
            if(continuaTentando)
                tentativasRealizadas++;

        }while(continuaTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com "+candidato+" na "+ tentativasRealizadas + " tentativas");
        }else{
            System.out.println("Não conseguimos contato com o caditado "+ candidato + " em "+ tentativasRealizadas + " tentativas");
        }
    }

    static boolean atender(){
        //se o valor entre 1 e 3 for 1 ele atendeu
        return new Random().nextInt(3)==1;
    }
    static double valorPretendido(){
        return Math.round(ThreadLocalRandom.current().nextDouble(1800,2200));
    }
}
