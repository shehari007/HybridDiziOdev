/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hybridarray;



/**
 *
 * @author sheharyar
 */
import java.util.Arrays;

public class HybridArray  {
        private int hdizi[];
        private int boyut;
        private int kapasite;
    
    
    public HybridArray(){
       hdizi= new int [10];  
       boyut=0;
       kapasite=9;
       
   
    }
     
    public void addLast(int sonekle){
        
        hdizi[9]= sonekle;
        boyut++;
      }
    public void addFirst(int ilkekle){
        hdizi[0]= ilkekle;
        boyut++;
    }
  
    public void insert (int ekle){
         if(ekle>=boyut || ekle<0 ){
          System.out.println("Bu index dizide boy ve kapasite kucuk ya da uzunluk");
         }
        
    }

       
    public void removeFirst(int ilksil){
          ilksil=0;
         for(int i = ilksil; i < hdizi.length -9; i++){
        hdizi[i] = hdizi[i+1];}
    }
       
    public void removeLast(int sonsil){
        //çozüm anlamıyorum
        
    }
       
    public void removeAt(int silat){
      //çozüm anlamıyorum
    }
       
    public void get(int index){
        for (int i = 0; i < 9; i++) {
            
        }
        
    }
       
    public void clear(){
        hdizi=null;
        
    }
    
    public void size(int size){
       //çozüm anlamıyorum
        
    }   
        public int boy(){
            return boyut;
    }
    public int kap(){
            return kapasite;
    }
    public void println(){
        System.out.println("Dizinin elemanlar :"+Arrays.toString(hdizi));
    }

}

        
    
  
        
    
    


