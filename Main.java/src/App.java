import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        produto p1 = new produto("256", "Trufa", 3, "56", 2);
        produto p2 = new produto("257", "Empada", 5, "58", 5);
        produto p3 = new produto("259", "Coxinha", 8, "68", 8);
        
        ArrayList<produto> listaProds = new ArrayList<>();
        listaProds.add(p1);
        listaProds.add(p2);
        listaProds.add(p3);

        exibirlista(listaProds);
        
     }

     public static void exibirlista(ArrayList<produto> lista){
        for(int i=0; i<lista.size(); i++){
        lista.get(i).exibirDados();
        }
    }
}
