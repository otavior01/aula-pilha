
public class Main {

    public static void main(String[] args) {

        Pilha lista = new Pilha();
        lista.mostra();

        Nodo novoNodo = new Nodo(10);
        lista.push(novoNodo);

        novoNodo = new Nodo(9);
        lista.push(novoNodo);

        lista.mostra();

        lista.pop();

        lista.mostra();

        lista.pop();

        lista.mostra(); 
    
    }
}
