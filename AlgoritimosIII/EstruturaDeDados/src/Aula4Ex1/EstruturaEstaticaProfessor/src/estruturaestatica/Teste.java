package estruturaestatica;

public class Teste {
    
    public static void main(String[] args){
       Pilha<Integer> pilha = new Pilha<Integer>();
       
       System.out.println("Verifica se a Pilha está vazia: " + pilha.estaVazia()); 
       
       System.out.println(pilha); // Exibe 
       System.out.println("O tamanho Real da Pilha: " + pilha.tamanho()); 
       System.out.println("O tamanho da estrutura: " + pilha.tamanhoEstrutura()); 
       
       for (int i=1; i<=15; i++) {
           pilha.empilha(i);
       }       
       
       System.out.println(pilha); // Exibe 
       
       System.out.println("O tamanho Real da Pilha: " + pilha.tamanho()); 
       System.out.println("O tamanho da estrutura: " + pilha.tamanhoEstrutura()); 
       
       System.out.println("Quem esta no topo: " + pilha.topo()); 
       
       System.out.println("Desempilhar elemento: " + pilha.desempilha()); 
       
       System.out.println(pilha); // Exibe 
       System.out.println("O tamanho Real da Pilha: " + pilha.tamanho()); 
       System.out.println("O tamanho da estrutura: " + pilha.tamanhoEstrutura()); 
        
    }
}
