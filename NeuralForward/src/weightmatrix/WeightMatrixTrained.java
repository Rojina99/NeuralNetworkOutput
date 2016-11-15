/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightmatrix;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class WeightMatrixTrained {
    
    public void weightmatrixset()
    {
     
        try
        {
        XMLDecoder xmldec = new XMLDecoder(new BufferedInputStream(getClass().getResourceAsStream("WeightTrainedWhole.xml")));
       
        LinkedHashMap a= (LinkedHashMap) xmldec.readObject();
        LinkedHashMap b= (LinkedHashMap) xmldec.readObject();
        LinkedHashMap c= (LinkedHashMap) xmldec.readObject();
        LinkedHashMap d= (LinkedHashMap) xmldec.readObject();
        LinkedHashMap e= (LinkedHashMap) xmldec.readObject();
         
        xmldec.close();
        
        for(int i =0 ; i<a.size();i++)
        {
        WeightMatrixList.setI_to_HL1_N1((double) a.get(i),i);
        WeightMatrixList.setI_to_HL1_N2((double) b.get(i),i);
        WeightMatrixList.setI_to_HL1_N3((double) c.get(i),i);
        WeightMatrixList.setI_to_HL1_N4((double) d.get(i),i);
        
        }
        
        for(int i =0 ; i<e.size();i++)
        {
            WeightMatrixList.setHL_to_Output((double) e.get(i),i);
        }
        
//        for(int i =0 ;i<WeightMatrixList.getI_to_HL1_N1().size();i++)
//        {
//            System.out.print(WeightMatrixList.getI_to_HL1_N1().get(i));
//            System.out.print("\t"+WeightMatrixList.getI_to_HL1_N2().get(i));
//            System.out.print("\t"+WeightMatrixList.getI_to_HL1_N3().get(i));
//            System.out.println("\t"+WeightMatrixList.getI_to_HL1_N4().get(i));
//            
//        }
//        
//        
//        for(int i =0 ;i<WeightMatrixList.getHL_to_Output().size();i++)
//        {
//          System.out.print(WeightMatrixList.getHL_to_Output().get(i)+"\t");  
//        }
        }
        
        catch(Exception fnfe)
        {
            Logger.getLogger(WeightMatrixTrained.class.getName()).log(Level.SEVERE,null,fnfe);
        }
    }
}
