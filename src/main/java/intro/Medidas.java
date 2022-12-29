// 1 - Pacote
package intro;

// 2 - Referencia as Bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos/Características

    // 3.2 - Métodos e Funções
    public static void main (String[] args){
        System.out.println("Cálculo de áreas");
        calcularAreaModoCompacto();
    }

    public static void calcularAreaModoExtenso(){
        // Calculo de área - Exemplo o tamanho do tapete ou do piso

        int largura;
        int comprimento;
        int area;

        largura = 4;
        comprimento = 3;

        area = largura * comprimento;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m, a área é de " + area + " m2. (Modo Extenso)");
    }

    public static void calcularAreaModoCompacto(){
        // Calculo de área - Exemplo o tamanho do tapete ou do piso

        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m, a área é de " + largura * comprimento + " m2. (Modo Compacto)");
    }
}