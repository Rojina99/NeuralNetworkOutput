/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readcsv;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import arraylist.ThisArrayList;

/**
 *
 * @author User
 */
public class MinMaxSet {
    
    public void mimmax()
    {
       try
        {
        XMLDecoder xmldec = new XMLDecoder(new BufferedInputStream(getClass().getResourceAsStream("MaxMinValue.xml")));
       
        ThisArrayList.max_preg_value= (double) xmldec.readObject();
        ThisArrayList.min_preg_value= (double) xmldec.readObject();
        ThisArrayList.max_glucose_value= (double) xmldec.readObject();
        ThisArrayList.min_glucose_value= (double) xmldec.readObject();
        ThisArrayList.max_pressure_value= (double) xmldec.readObject();
        ThisArrayList.min_pressure_value= (double) xmldec.readObject();
        ThisArrayList.max_foldthickness_value= (double) xmldec.readObject();
        ThisArrayList.min_foldthickness_value= (double) xmldec.readObject();
        ThisArrayList.max_seruminsulin_value= (double) xmldec.readObject();
        ThisArrayList.min_seruminsulin_value= (double) xmldec.readObject();
        ThisArrayList.max_bmi_value= (double) xmldec.readObject();
        ThisArrayList.min_bmi_value= (double) xmldec.readObject();
        ThisArrayList.max_pedigree_value= (double) xmldec.readObject();
        ThisArrayList.min_pedigree_value= (double) xmldec.readObject();
        ThisArrayList.max_age_value= (double) xmldec.readObject();
        ThisArrayList.min_age_value= (double) xmldec.readObject();
        xmldec.close();
        
        
//        System.out.println(ThisArrayList.max_preg_value+"\t"+ThisArrayList.min_preg_value);
//        System.out.println(ThisArrayList.max_glucose_value+"\t"+ThisArrayList.min_glucose_value);
//        System.out.println(ThisArrayList.max_pressure_value+"\t"+ThisArrayList.min_pressure_value);
//        System.out.println(ThisArrayList.max_foldthickness_value+"\t"+ThisArrayList.min_foldthickness_value);
//        System.out.println(ThisArrayList.max_seruminsulin_value+"\t"+ThisArrayList.min_seruminsulin_value);
//        System.out.println(ThisArrayList.max_bmi_value+"\t"+ThisArrayList.min_bmi_value);
//        System.out.println(ThisArrayList.max_pedigree_value+"\t"+ThisArrayList.min_pedigree_value);
//        System.out.println(ThisArrayList.max_age_value+"\t"+ThisArrayList.min_age_value);
        
    }
        catch(Exception fnfe)
        {
            Logger.getLogger(MinMaxSet.class.getName()).log(Level.SEVERE,null,fnfe);
        } 
}
}