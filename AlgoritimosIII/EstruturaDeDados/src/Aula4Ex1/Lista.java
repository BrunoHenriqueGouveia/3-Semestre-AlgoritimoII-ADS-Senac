/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4Ex1;

/**
 *
 * @author bruno.hgsilva3
 */
public class Lista<T> extends EstruturaEstatica<T>{
    
    public Lista(int capacidade){
        super(capacidade);
    }
    
    //metodo construtor sem parametros 
    public Lista(){
        super();
    }
    
    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }
    
    @Override
    public boolean adicionaQualquerPosicao(int posicao,T elemento){
        return super.adicionaQualquerPosicao(posicao, elemento);
    }
    
    
    
    
}
