/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t4;
import java.util.*;


/**
 *
 * @author Allan
 */
public class Dados {
    
    private String nome;
    private String tipo;
    private int dia;
    
    public ArrayList<Dados> professores = new ArrayList<Dados>();
    
    
    public void insere (String nome, int dia, String tipo){
        
        Dados tmp = new Dados();
        
        tmp.dia = dia;
        tmp.nome = nome;
        tmp.tipo = tipo;
                
        this.professores.add(tmp);
        
    }
    
    public void listar (){
        
        
        for (Dados obj : this.professores) {
        System.out.println (obj.nome + " e " + obj.tipo);
        }

    }
    
    public String getStr(){
        
        String tmp;
        
        tmp = "Dia :" + Integer.toString(this.dia) + " | Nome: " +  this.nome + "(" + this.tipo + ")";
        
        return tmp;
    }
            
    public static void main(String [] args){
        
        
        Janela frame = new Janela();
        frame.setVisible(true);
       
        /*
        Dados novo = new Dados();
        novo.insere("arroz", 29122012, "carbo");
        novo.insere("feijao", 29122012, "prot");
        novo.listar();
        */
        
    }
    
    
}
