/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RevisaoProjetoObjeto;

import java.util.ArrayList;

/**
 *
 * @author bruno.hgsilva3
 */
public class Ex3Objeto {

    public static void main(String[] args) throws Exception {

        VetorObjeto vetor = new VetorObjeto(5);

        Contado c1 = new Contado("Bruno", "11988191980", "bruno@gmail.com");
        Contado c2 = new Contado("Pedro", "11958199940", "pedro123@gmail.com");
        Contado c3 = new Contado("kauan", "11988155480", "kaun564@gmail.com");

        //=================== sem array ==============================
        // sem Arrays liste Manual
        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        // imprimir manual
        System.out.println("Tamanho do vetor: " + vetor.tamanho());
        System.out.println(vetor);
        System.out.println(vetor.busca1("Bruno"));

        //=============== com arrayList ===================
        ArrayList<Object> arrayList = new ArrayList<>();

        // com Arrays List
        arrayList.add(c1);
        arrayList.add(c2);
        arrayList.add(c3);

        //imprimir usando array List
        System.out.println("Tamanho do vetor: " + arrayList.size());
        System.out.println(arrayList);

    }

}
