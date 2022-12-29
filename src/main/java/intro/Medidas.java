// 1 - Pacote
package intro;

// 2 - Referencia as Bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos/Características

    // 3.2 - Métodos e Funções
    public static void main (String[] args){

        //condicional = verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software
        calcularAreaModoCompacto();
        calcularAreaModoExtenso();
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
}