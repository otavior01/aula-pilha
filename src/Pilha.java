
public class Pilha {

    private Nodo pilha;
    private int numeroElementos;

    public Pilha() {
        this.pilha = null;
        this.numeroElementos = 0;
    }

    public Nodo getPilha() {
        return pilha;
    }

    public void setPilha(Nodo lista) {
        this.pilha = lista;
    }

    public void push(Nodo novoNodo) {
        if (ehVazia()) {
            this.pilha = novoNodo;
        } else {
            novoNodo.setProx(this.pilha);
            this.pilha = novoNodo;
        }
        this.numeroElementos++;
    }

    public void pop() {
        if (ehVazia()) {
            System.out.println("Pilha vazia");
        } else {
            this.pilha = this.pilha.getProx();
            this.numeroElementos--;
        }

    }

    public void mostra() {
        if (ehVazia()) {
            System.out.println("Top -> null");
        } else {
            Nodo temp = this.pilha;
            System.out.print("Top -> " + temp.getValor());
            while (temp.getProx() != null) {
                temp = temp.getProx();
                System.out.print(" -> " + temp.getValor());
            }
            System.out.println(" -> null");
        }
    }

    public boolean ehVazia() {
        return this.pilha == null;
    }

    public Nodo acesso(int posicao) {
        if (ehVazia()) {
            System.out.println("Pilha vazia!");
            return null;
        }
        if (posicao > this.numeroElementos) {
            System.out.println("Posicao invalida!");
            return null;
        } else {
            Nodo temp = this.pilha;
            for (int i = 0; i < this.numeroElementos; i++) {
                if (i == posicao) {
                    break;
                } else {
                    temp = temp.getProx();
                }
            }
            return temp;
        }
    }
}
