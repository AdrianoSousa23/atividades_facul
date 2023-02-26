import java.util.Random;
import java.util.Scanner;
public class exercicio04 {
public static void main(String[] args) {
    int[][] m = gerarMatriz(linha, coluna);
    imprimir(m);
    String res = simetrica(m);
    System.out.println(res);
}

public static int[][] gerarMatriz(int linha, int coluna){
    Scanner leitor = new Scanner(System.in);
    System.out.print("Linhas: ");
    int linhas = leitor.nextInt();
    System.out.print("Colunas: ");
    int colunas = leitor.nextInt();
int [][] matriz = new int[linhas][colunas];
for(int i = 0; i < matriz.length; i++){
    for(int j = 0; j < matriz[i].length; j++){
        matriz[i][j] = leitor.nextInt();
    }
}
return matriz;

}
public static String simetrica(int[][] a){
    String resultado ="";
    boolean achou;
    for(int i = 0; i < a.length; i++){
        achou = false;
        for(int j = 0; j < a[i].length; j++){
            if(a[i][j] == a[i][j]){
                achou = true;
                break;
            }
        }
        if(!achou){
            resultado += a[i] + " ";
        }
    }
    return resultado;
}
public static void imprimir(int[][] m){
for(int i = 0; i < m.length; i++){
    for(int j =0; j < m[i].length; j++){
        System.out.printf("%3d ", m[i][j]);
    }
    System.out.println();
}
}
}
