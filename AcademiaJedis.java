package Atividade;

import java.util.Scanner;

import javax.swing.text.html.StyleSheet;

public class AcademiaJedis {

    Scanner sc = new Scanner(System.in);

    public void exericicio01() {

        System.out.println("Este software permitir o cálculo de parâmetros essenciais para sua saúde. Vamos começar? ");


        System.out.println("Primeiro,vamos começar inserindo algumas informações a seu respeito.");

        System.out.println("Infome seu nome!");
        String nome = sc.nextLine();
        System.out.println("Infome sua idade!");
        Double idade = sc.nextDouble();
        System.out.println("Infome seu sexo! 1- Feminimo e 2-Masculino");
        int sexo = sc.nextInt();
        System.out.println("Infome sua altura!");
        Double altura = sc.nextDouble();
        System.out.println("Infome seu peso!");
        int peso = sc.nextInt();

        
        Double pesoIdealMas = (72.7 * altura) - 58;
        Double pesoIdealFem = (62.1 * altura) - 44.7;

        if (sexo==1) {

            System.out.println("O seu peso ideal é de "+ pesoIdealFem + " Kg");
        } else {
            System.out.println("O seu peso ideal é de "+ pesoIdealMas +" Kg" );
        }


        if (sexo ==1 && peso<pesoIdealFem) {

            System.out.println("Você precisa ganhar massa muscular. Aproximadamente "+ (pesoIdealFem-peso) +" Kg");
        } else if (sexo==1 && peso>pesoIdealFem) {

            System.out.println("Você precisa perder peso. Aproximadamente "+ (peso-pesoIdealFem) +" Kg");
        } else if (sexo==2 && peso<pesoIdealMas) {
            System.out.println("Você precisa ganhar massa muscular. Aproximadamente "+ (pesoIdealMas-peso) +" Kg");
        } else if (sexo==2 && peso>pesoIdealMas) {
            System.out.println("Você precisa perder peso. Aproximadamente "+ (peso-pesoIdealMas) + " Kg");
        } else if (peso==pesoIdealFem && peso==pesoIdealMas) {
            System.out.println("Você está no peso indicado!");
        }

        Double imc = peso/ (altura*altura);


        int faixaEtaria = 0;

        if(idade>=16 && idade<25) {
            faixaEtaria = 1;
        }else if (idade>=25 && idade<35 ) {
            faixaEtaria = 2;
        }else if (idade>=35 && idade<45) {
            faixaEtaria=3;
        }else if (idade>=45 && idade<55) {
            faixaEtaria=4;
        }else if (idade>=55 && idade<65) {
            faixaEtaria=5;
        }else if (idade>=65) {
            faixaEtaria=6;
        }

        System.out.println("Depois de passar por este processo, vamos calcular seu IMC - Índice de massa corporal - que indica o grau de obesidade e sobrepeso");
        System.out.println("O seu imc é de "+ imc);

        if (imc<20) {
            System.out.println("Você está abaixo do peso!");
        }else if (imc>20 && imc <27){ 
            System.out.println("Você está no peso adequado!");
        }else if (imc>27) {
            System.out.println("Você está acima do peso!");
        }

        System.out.println("Agora, podemos indicar a intensidade e atividade que é recomendado você fazer!");
        
        int dificuldade = 0;

        if(imc>=27){
            dificuldade=1;
        }else if(imc>20 && imc<27){
            dificuldade=2;
        }else if(imc<20){
            dificuldade=3;
        }

        if (dificuldade==3 && faixaEtaria==1) {
            System.out.println("É recomendado a(s) seguinte(s) atividade(s): luta ");
        }else if (dificuldade==3 && faixaEtaria==2) {
            System.out.println("É recomendado a(s) seguinte(s) atividade(s): luta, musculação intensa ");
        }else if (dificuldade==3 && faixaEtaria==3) {
            System.out.println("É recomendado a(s) seguinte(s) atividade(s): musculação intensa, luta ");
        }else if (dificuldade==3 && faixaEtaria==4) {
            System.out.println("É recomendado a(s) seguinte(s) atividade(s): luta, pilates");
        }else if (dificuldade==3 && faixaEtaria==5 || dificuldade==3 && faixaEtaria==6) {
            System.out.println("É recomendado a(s) seguinte(s) atividade(s):  pilates");
        } else if (dificuldade==2 && faixaEtaria==1) {
            System.out.println("É recomendado a(s) seguinte(s) atividade(s): musculação moderada, dança");
        }else if (dificuldade==2 && faixaEtaria==2 || dificuldade==2 && faixaEtaria==3 || dificuldade==2 && faixaEtaria==4  ) {
            System.out.println("É recomendado a(s) seguinte(s) atividade(s): musculação moderada, dança, corrida ");
        }else if (dificuldade==2 && faixaEtaria==5) {
            System.out.println("É recomendado a(s) seguinte(s) atividade(s): corrida, dança");
        }else if (dificuldade==2 && faixaEtaria==6) {
            System.out.println("É recomendado a(s) seguinte(s) atividade(s): dança");
        }else if (dificuldade==1 && faixaEtaria==1) {
            System.out.println("É recomendado a(s) seguinte(s) atividade(s): musculação leve, ioga");
        }else if (dificuldade==1 && faixaEtaria==2) {
            System.out.println("É recomendado a(s) seguinte(s) atividade(s): ioga");
        }else if (dificuldade==1 && faixaEtaria==3) {
            System.out.println("É recomendado a(s) seguinte(s) atividade(s): ioga");
        }else if (dificuldade==1 && faixaEtaria==4 || dificuldade==1 && faixaEtaria==5 || dificuldade==1 && faixaEtaria==6 ) {
            System.out.println("É recomendado a(s) seguinte(s) atividade(s): musculação leve, ioga");
        }

        System.out.println("Pronto! Aqui estão todas as informações e espero que você consiga alcançar seus objetivos!");

    }

}
