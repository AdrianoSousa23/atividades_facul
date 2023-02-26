import java.util.Random;
public class App {
    public static void main(String[] args) {
            int[][] m = gerarMatriz(8, 5);
            imprimir(m);
            int maior = maiorElemento(m);
            System.out.println("maior elemento " + maior);
        }

    public static int[][] gerarMatriz(int linhas, int colunas){
        Random r = new Random();
        int [][] matriz = new int[linhas][colunas];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = r.nextInt(101);
            }
        }
        return matriz;
    }
    public static int maiorElemento(int[][] m ){
        int maior = m[0][0];
        for(int i = 0; i < m.length; i++){
            for(int j =0; j < m[i].length; j++){
                if(m[i][j] > maior){
                    maior = m[i][j];
                }
            }
        }
        return maior;
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


