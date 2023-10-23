package laboratorio10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cristhian.cisneros
 */
public class Laboratorio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Smartphone Samsung = new Smartphone("Samsung", "S7edge");
       Smartphone Iphone = new Smartphone("Iphone", "ProMax 13");
       Smartphone Huawei = new Smartphone("Huawei", "P30");
       
       List <Smartphone> celulares = new ArrayList<>();
       
       celulares.add(Samsung);
       celulares.add(Iphone);
       celulares.add(Huawei);
       
       for(Smartphone cel:celulares){
           
           System.out.println(cel.getMarca());
           System.out.println(cel.getModelo());
           
           cel.camara();
           cel.musica();
           cel.internet();
           
           System.out.println(" ");
       }
    }
    
}
