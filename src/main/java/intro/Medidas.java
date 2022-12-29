// 1 - Pacote
package intro;

// 2 - Referencia as Bibliotecas

import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos/Características

    // 3.2 - Métodos e Funções
    public static void main (String[] args){

        //condicional = verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software.

        // Utilizar a classe Scanner do java para receber a esolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U   D E   O P Ç Õ E S: ");
        System.out.println("C - Calcular Área Modo Compacto ");
        System.out.println("D - Contar Até Dez");
        System.out.println("E - Calcular Área Modo Extenso ");
        System.out.println("I - If Simples ");
        System.out.println("R - Contagem Regressiva de 10 a 0");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        //Switch = seletor (selecionar o comportamento de acordo com a escolha da pessoa.

        switch (opcao){
            case "c":
            case "C":
                System.out.println("Voce selecionou o compacto");
                calcularAreaModoCompacto();
            case "d":
            case "D":
                System.out.println("Voce selecionou contar até 10");
                contarAteDez();
                break;
            case "e":
            case "E":
                System.out.println("Voce selecionou o extenso");
                calcularAreaModoExtenso();
                break;
            case "i":
            case "I":
                System.out.println("Voce selecionou if");
                ifSimples();
                break;
            case "r":
            case "R":
                System.out.println("Voce selecionou contagem regressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Nenhuma opção selecionada");
        }
    }

    public static void ifSimples(){
        // If/Else
        String modo = "Banana";

        if (modo == "compacto"){
            calcularAreaModoCompacto();
        }
        if (modo == "extenso"){
            calcularAreaModoExtenso();
        }
        else{
            System.out.println("Somente as opções 'Compacto' e 'Extenso' deve ser informada.");
        }

    }

    public static void calcularAreaModoExtenso(){
        // Calculo de área - Exemplo o tamanho do tapete ou do piso

        System.out.println("Cálculo de áreas Modo Extenso");

        int largura;
        int comprimento;
        int area;

        largura = 4;
        comprimento = 3;

        area = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m, a área é de " + area + " m2.");
    }

    public static void calcularAreaModoCompacto(){
        // Calculo de área - Exemplo o tamanho do tapete ou do piso

        System.out.println("Cálculo de áreas Modo Compacto");

        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m, a área é de " + largura * comprimento + " m2.");
    }

    public static void contarAteDez(){
        // For
        System.out.println("Contagem Crescente");
        for(int numero = 1; numero < 11; numero++){
            System.out.println("Numero: " + numero);
        }
    }

    public static void contagemRegressiva(){
        // For
        System.out.println("Contagem Regressiva");
        for(int numero = 10; numero > -1; numero--){
            System.out.println("Numero: " + numero);
        }
    }
}