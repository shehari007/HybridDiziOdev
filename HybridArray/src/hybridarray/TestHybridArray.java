/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hybridarray;
 



/**
 *
 * @author sheha
 */
public class TestHybridArray {
    

    public static void main(String[] args) {
        HybridArray hdizi= new HybridArray();
        hdizi.println();
  
        hdizi.addLast(13);
        System.out.println("Dizinin sonunda 13 ekledim");
        hdizi.println();
        
        hdizi.addFirst(22);
        System.out.println("Dizinin ilk eleman 22 ekledim");
        hdizi.println();
        
        System.out.println("index 12'de bir eleman ekledim");
        hdizi.insert(12);
        hdizi.println();
        
        System.out.println("ilk eleman sildim");
        hdizi.removeFirst(0);
        hdizi.println();
        
        System.out.println("Hepsi Eleman sildim");
        hdizi.clear();
        hdizi.println();
                
        
        
    
        
        
        
        
    }
    
}

