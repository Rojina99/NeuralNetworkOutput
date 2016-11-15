/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author User Calculates minimum and maximum values among incoming inputs
 */
public class SortArrayList {

    //private ThisArrayList thislist;
    /**
     * List to store temporary value
     */
    private Map<Integer,Double> temp = new LinkedHashMap<>();
    
//    private List<Double> temp1 = new ArrayList<>();

    /**
     * Used to Sort and Return minimum and maximum values in given age values
     * from input
     */
    public void setSort_Age() {
        temp = ThisArrayList.getAge();
//        int i = temp.size();
//        //System.out.println(i);
//        i--;
//        Collections.sort(temp);
//        ThisArrayList.max_age_value = temp.get(i);
//        ThisArrayList.min_age_value = temp.get(0);
        
        ThisArrayList.max_age_value = Collections.max(temp.values());
        ThisArrayList.min_age_value = Collections.min(temp.values());
//       System.out.println("A "+ThisArrayList.max_age_value);
//       System.out.println("B "+ThisArrayList.min_age_value);
//       temp.removeAll(temp);
//         ThisArrayList.getAge() = temp1;
            
//            for(double d: temp1)
//            {
//            System.out.println(i+"temp1"+d);
//            }
//            int i = 0;
//             for(double d: temp)
//            {
//            i++;
//            System.out.println(i+"\ttemp"+d);
//            }
//             
//             System.out.println(ThisArrayList.max_age_value+"\t"+ThisArrayList.min_age_value);
    }

    /**
     * Used to Sort and Return minimum and maximum values in given bmi values
     * from input
     */
    public void setSort_BMI() {
        temp = ThisArrayList.getBmi();
//        int i = temp.size();
//        //System.out.println(i);
//        i--;
//        Collections.sort(temp);
//        ThisArrayList.max_bmi_value = temp.get(i);
//        ThisArrayList.min_bmi_value = temp.get(0);
          ThisArrayList.max_bmi_value = Collections.max(temp.values());
          ThisArrayList.min_bmi_value = Collections.min(temp.values());
//       System.out.println("A "+ThisArrayList.max_age_value);
//       System.out.println("B "+ThisArrayList.min_age_value);
//       temp.removeAll(temp);
    }

    /**
     * Used to Sort and Return minimum and maximum values in given 
     * blood pressure values from input 
     */
    public void setSort_Blood_Pressure() {
        temp = ThisArrayList.getBlood_Pressure();
//        int i = temp.size();
//        //System.out.println(i);
//        i--;
//        Collections.sort(temp);
//        ThisArrayList.max_pressure_value = temp.get(i);
//        ThisArrayList.min_pressure_value = temp.get(0);
          ThisArrayList.max_pressure_value = Collections.max(temp.values());
          ThisArrayList.min_pressure_value = Collections.min(temp.values());

//      System.out.println("A "+ThisArrayList.max_age_value);
//      System.out.println("B "+ThisArrayList.min_age_value);
//      temp.removeAll(temp);
    }

    /**
     * Used to Sort and Return minimum and maximum values in given 
     * pedigree values from input
     */
    public void setSort_Diabetes_Pedigree() {
        temp = ThisArrayList.getDiabetes_Pedigree();
//        int i = temp.size();
//        //System.out.println(i);
//        i--;
//        Collections.sort(temp);
//        ThisArrayList.max_pedigree_value = temp.get(i);
//        ThisArrayList.min_pedigree_value = temp.get(0);

        ThisArrayList.max_pedigree_value = Collections.max(temp.values());
        ThisArrayList.min_pedigree_value = Collections.min(temp.values());
          
//      System.out.println("A "+ThisArrayList.max_age_value);
//      System.out.println("B "+ThisArrayList.min_age_value);
//      temp.removeAll(temp);
    }

    /**
     * Used to Sort and Return minimum and maximum values in given 
     * glucose level values from input
     */
    public void setSort_Glucose_Concentration() {
        temp = ThisArrayList.getGlucose_Concentration();
//        int i = temp.size();
//        //System.out.println(i);
//        i--;
//        Collections.sort(temp);
//        ThisArrayList.max_glucose_value = temp.get(i);
//        ThisArrayList.min_glucose_value = temp.get(0);
            
        ThisArrayList.max_glucose_value = Collections.max(temp.values());
        ThisArrayList.min_glucose_value = Collections.min(temp.values());
        
//      System.out.println("A "+ThisArrayList.max_age_value);
//      System.out.println("B "+ThisArrayList.min_age_value);
//      temp.removeAll(temp);
    }

    /**
     * Used to Sort and Return minimum and maximum values in given pregnancy 
     * times values from input
     */
    public void setSort_Pregnancy_Times() {
        temp = ThisArrayList.getPregnancy_Times();
//        int i = temp.size();
//        //System.out.println(i);
//        i--;
//        Collections.sort(temp);
//        ThisArrayList.max_preg_value = temp.get(i);
//        ThisArrayList.min_preg_value = temp.get(0);

        ThisArrayList.max_preg_value = Collections.max(temp.values());
        ThisArrayList.min_preg_value = Collections.min(temp.values());
        
//      System.out.println("A "+ThisArrayList.max_age_value);
//      System.out.println("B "+ThisArrayList.min_age_value);
//      temp.removeAll(temp);
    }

    /**
     * Used to Sort and Return minimum and maximum values in given fold 
     * thickness values from input
     */
    public void setSort_Fold_thickness() {
        temp = ThisArrayList.getFold_thickness();
//        int i = temp.size();
//        //System.out.println(i);
//        i--;
//        Collections.sort(temp);
//        ThisArrayList.max_foldthickness_value = temp.get(i);
//        ThisArrayList.min_foldthickness_value = temp.get(0);

        ThisArrayList.max_foldthickness_value = Collections.max(temp.values());
        ThisArrayList.min_foldthickness_value = Collections.min(temp.values());
        
//      System.out.println("A "+ThisArrayList.max_age_value);
//      System.out.println("B "+ThisArrayList.min_age_value);
//      temp.removeAll(temp);
    }

    /**
     * Used to Sort and Return minimum and maximum values in given serum 
     * insulin values from input
     */
    public void setSort_Two_Hour_SerumInsulin() {
        temp = ThisArrayList.getTwo_Hour_SerumInsulin();
//        int i = temp.size();
//        //System.out.println(i);
//        i--;
//        Collections.sort(temp);
//        ThisArrayList.max_seruminsulin_value = temp.get(i);
//        ThisArrayList.min_seruminsulin_value = temp.get(0);

        ThisArrayList.max_seruminsulin_value = Collections.max(temp.values());
        ThisArrayList.min_seruminsulin_value = Collections.min(temp.values());
//      System.out.println("A "+ThisArrayList.max_age_value);
//      System.out.println("B "+ThisArrayList.min_age_value);
//      temp.removeAll(temp);
    }

}
