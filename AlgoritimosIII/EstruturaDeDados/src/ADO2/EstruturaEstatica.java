package ADO2;

/**
 *
 * @author bruno.hgsilva3
 */
public class EstruturaEstatica<T> {

    public T[] elementos;
    public int tamanho;
    private boolean preferencia = false;
    public int qtdPreferencia = 0;

    public boolean isPreferencia() {
        return preferencia;
    }

    public void setPreferencia(boolean preferencia) {
        this.preferencia = preferencia;
    }

    //metodo construtor com paramentro
    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    // metodo construtor sem parametro
    public EstruturaEstatica() {
        this(10);
    }

    // metodo para adicionar elementos
    public boolean adiciona(T elemento) {

        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {

            if (this.isPreferencia()) {
                int k = tamanho;
                while (k > qtdPreferencia) {
                    this.elementos[k] = this.elementos[k - 1];
                    k--;
                }

                this.elementos[k] = elemento;
                this.tamanho++;
                qtdPreferencia++;
                setPreferencia(false);
                return true;
            }

            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;

        }

        return false;

    }

    //metodo para aumentar a capacidade
    public void aumentaCapacidade() {

        if (this.elementos.length == this.tamanho) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public void remove(int posicao) throws Exception {

        if (posicao >= 0 && posicao < this.tamanho) {

            if (elementos[posicao].toString().contains("P")) {
                qtdPreferencia--;
            }
            for (int i = posicao; i < this.tamanho - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.tamanho--;

        } else {
            throw new Exception("Senha Invalida");

        }

    }

    public int buscaPosicao(T elemento) {

        for (int i = 0; i < tamanho; i++) {

            if (this.elementos[i].equals(elemento)) {
                return i;
            }

        }

        return -1;
    }

}
