public class ContenedorDeEnteros {
    int[] Vector;
    int Elementos;
    int Tamaño;

    public ContenedorDeEnteros(int tamaño){
        Vector         = new int[tamaño];
        this.Tamaño    = tamaño;
        this.Elementos = 0;
    }

    public int tamaño() {
        return Tamaño;
    }

    public int cardinal(){
        return Elementos;
    }

    public boolean insertar(int valor){
        if(Elementos<Vector.length && buscar(valor)==false){
            Vector[Elementos]=valor;
            Elementos++;
            return true;
        }
        return false;
    }

    public boolean extraer(int valor){
        for(int i=0;i<Elementos;i++){
            if(Vector[i]==valor && i<=Elementos-1){
                for(int a=i+1;a<Elementos;a++){
                    Vector[a-1]=Vector[a];
                }
                Elementos--;
                return true;
            }
            if(Vector[i]==valor && i==Elementos-1){
                Elementos--;
                return true;
            }
        }
        return false;
    }

    public boolean buscar(int valor){
        for(int i=0;i<Elementos;i++){
            if(Vector[i]==valor){
                return true;
            }
        }
        return false;
    }

    public void vaciar(){
        Elementos=0;
    }

    public int[] elementos(){
        int[] vector = new int[Elementos];
        for(int i=0;i<Elementos;i++){
            vector[i]=Vector[i];
        }
        return vector;
    }
}