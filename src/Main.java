
public class Main {

    public static void main(String[] args) {

        Pilha lista = new Pilha();
        lista.mostra();

        Nodo novoNodo = new Nodo(10);
        lista.inserirInicio(novoNodo);

        novoNodo = new Nodo(9);
        lista.inserirInicio(novoNodo);

        lista.mostra();

        lista.removerInicio();

        lista.mostra();

        lista.removerInicio();

        lista.mostra();

        novoNodo = new Nodo(8);
        lista.inserirInicio(novoNodo);

        novoNodo = new Nodo(7);
        lista.inserirInicio(novoNodo);

        novoNodo = new Nodo(6);
        lista.inserirInicio(novoNodo);

        novoNodo = new Nodo(5);
        lista.inserirInicio(novoNodo);

        novoNodo = new Nodo(60);
        lista.inserirFim(novoNodo);
        novoNodo = new Nodo(80);
        lista.inserirFim(novoNodo);
        novoNodo = new Nodo(100);
        lista.inserirFim(novoNodo);

        lista.mostra();
        lista.removerFim();
        lista.removerFim();
        lista.removerFim();
        lista.mostra();
                
        Pilha lista2 = new Pilha();
        lista2.inserirFim(lista.acesso(3));
        lista2.mostra();
    
    
    }
}
