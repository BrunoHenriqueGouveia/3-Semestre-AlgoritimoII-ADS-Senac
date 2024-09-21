package ADO2;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno.hgsilva3
 */
public class Fila<T> extends EstruturaEstatica<T> {

    final String tipo[] = {"Comum", "Prioridade"};
    public int numComun = 1;
    public int numPrioridade = 1;
    public int p = 0;

    public Fila(int capacidade) {
        super(capacidade);
    }

    public Fila() {
        super();
    }

    //metodo para gerar senha 
    public void gerarSenha() {

        Object senha = "";

        if (isPreferencia()) {
            senha = "P" + this.numPrioridade;
            this.numPrioridade++;

        } else {
            senha = "C" + this.numComun;
            this.numComun++;
        }

        if (adiciona((T) senha)) {
            JOptionPane.showMessageDialog(null, "Senha gerada com sucesso\n Senha: " + senha);
        } else {
            JOptionPane.showMessageDialog(null, "errro a gerar a senha");
        }
    }

    public T espiar() {

        if (super.elementos[0].toString().contains("P") && this.p < 3) {
            return this.elementos[0];
        } else {
            if (super.elementos[0].toString().contains("C")) {
                return this.elementos[0];
            } else if (p == 3) {
                for (int i = 0; i < elementos.length; i++) {
                    if (super.elementos[i].toString().contains("C")) {
                        return this.elementos[i];
                    }
                }
            }

        }
        return null;

    }

    public void chamarProximo() {

        if (super.elementos[0].toString().contains("P") && this.p < 3) {
            try {
                JOptionPane.showMessageDialog(null, "Senha chamada: " + super.elementos[0].toString());
                remove(0);
                this.p++;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            if (super.elementos[0].toString().contains("C")) {

                try {
                    JOptionPane.showMessageDialog(null, "Senha chamada: " + super.elementos[0].toString());
                    remove(0);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } else if (p == 3) {
                for (int i = 0; i < elementos.length; i++) {
                    if (super.elementos[i].toString().contains("C")) {
                        try {
                            JOptionPane.showMessageDialog(null, "Senha chamada: " + super.elementos[i].toString());
                            remove(i);
                            break;
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }

                    }
                }
            }
            p = 0;
        }

    }

}
