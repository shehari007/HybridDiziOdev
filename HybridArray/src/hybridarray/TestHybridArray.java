
package hybridarray;
 
public class TestHybridArray {
    

    public static void main(String[] args) {
        HybridArray hdizi= new HybridArray();
        hdizi.println();
  
        hdizi.addLast(13);
        System.out.println("Dizinin sonunda 13 ekledi");
        hdizi.println();
        
        hdizi.addFirst(22);
        System.out.println("Dizinin ilk eleman 22 ekledi");
        hdizi.println();
        
        System.out.println("index 5'te bir eleman ekledi");
        hdizi.insert(5,44);
        hdizi.println();
        
        System.out.println("ilk eleman sildim");
        hdizi.removeFirst();
        hdizi.println();
        
        System.out.println("Girdiginiz indexteki eleman ekrana gosterdi");
        hdizi.get(5);
        hdizi.println();
        
        System.out.println("girdiginiz indexteki eleman sildi");
        hdizi.removeAt(5);
        hdizi.println();
        
        System.out.println("Son eleman sildi");
        hdizi.removeLast();
        hdizi.println();
        
        System.out.println("Hepsi Eleman sildi");
        hdizi.clear();
        hdizi.println();
        
        
        
                
        
        
    
        
        
        
        
    }
    
}

