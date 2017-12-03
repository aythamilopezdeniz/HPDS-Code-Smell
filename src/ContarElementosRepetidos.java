public class ContarElementosRepetidos {
    private static int A=10;
    private static int B=20;
    private static int vectorA[]=new int[A];
    private static int vectorB[]=new int[B];
    private static int elemA=0;

    private static void compara() {
        for (int aVectorA : vectorA) {
            for (int aVectorB : vectorB) {
                if (aVectorA == aVectorB)
                    elemA++;
            }
            System.out.println("El elemento " + aVectorA + " se presenta " + elemA + " veces en B");
            elemA = 0;
        }
    }

    private static void llenaArreglo(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*100+1);
        }
    }

    private static void imprimir(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Vector ["+i+"]= "+vector[i]+"\n");
        }
    }

    public static void main(String[] args) {
        llenaArreglo(vectorA);
        llenaArreglo(vectorB);
        imprimir(vectorA);
        imprimir(vectorB);
        compara();
    }
}