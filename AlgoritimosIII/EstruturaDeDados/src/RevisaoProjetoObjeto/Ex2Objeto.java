package RevisaoProjetoObjeto;



public class Ex2Objeto {
   
   public static void main(String[] args) throws Exception {
    
       VetorObjeto vetor = new VetorObjeto(5);
      
       try {
           vetor.adiciona("b");
           vetor.adiciona("c");
           vetor.adiciona("d");    
              
       } catch (Exception e) {
           e.printStackTrace();
       }
       
       System.out.println(vetor.adicionaInicio(0, "a"));
       System.out.println(vetor.tamanho());
       System.out.println(vetor.toString());
       System.out.println(vetor.busca(3));    
       System.out.println(vetor.busca1("2"));   
       vetor.remove(1);
       System.out.println(vetor.toString());
       
       
       
       
       
   }
   
}
