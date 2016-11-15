/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Returns arraylist of Inputs in CSV
 */
public class ThisArrayList {

    /**
     * Variables referring to corresponding input values
     */
    private static double age;
    private static double bmi;
    private static double pressure;
    private static double diabetespedigree;
    private static double glucoseconcentration;
    private static double pregnancytimes;
    private static double foldthickness;
    private static double seruminsulin;
    private static double outputclass;
    
    
    /**
     * Variables to calculate store minimum and maximum values among values in input colums
     */
    
    public static double max_age_value = 0, min_age_value = 0;
    public static double max_bmi_value = 0, min_bmi_value = 0;
    public static double max_pressure_value = 0, min_pressure_value = 0;
    public static double max_pedigree_value = 0, min_pedigree_value = 0;
    public static double max_glucose_value = 0, min_glucose_value = 0;
    public static double max_preg_value = 0, min_preg_value = 0;
    public static double max_foldthickness_value = 0, min_foldthickness_value = 0;
    public static double max_seruminsulin_value = 0, min_seruminsulin_value = 0;
    

    
    /**
     * List to store input values      
     */
    
    private static Map<Integer,Double> pregnants = new LinkedHashMap<>();

    private static Map<Integer,Double> glucoselevel = new LinkedHashMap<>();

    private static Map<Integer,Double> bloodpressure = new LinkedHashMap<>();

    private static Map<Integer,Double> skinfoldthickness = new LinkedHashMap<>();

    private static Map<Integer,Double> seruminsulins = new LinkedHashMap<>();

    private static Map<Integer,Double> bmis = new LinkedHashMap<>();

    private static Map<Integer,Double> pedigreefunction = new LinkedHashMap<>();

    private static Map<Integer,Double> ages = new LinkedHashMap<>();
    
    private static Map<Integer,Double> outputclasses = new LinkedHashMap<>();

    /**
     * Add age to the list
     * @param age Is the age value in double format
     */
    public static void setAge(double age , int i) {
        ThisArrayList.age = age;
        ages.put(i , ThisArrayList.age);
    }
    
    /**
     * Add bmi to the list
     * @param bmi Is the bmi value in double format
     */

    public static void setBMI(double bmi , int i) {
        ThisArrayList.bmi = bmi;
        bmis.put(i , ThisArrayList.bmi);
    }
    
    /**
     * Add blood pressure to the list
     * @param pressure Is the pressure value in double format
     */

    public static void setBlood_Pressure(double pressure , int i) {
        ThisArrayList.pressure = pressure;
        bloodpressure.put(i , ThisArrayList.pressure);
    }
    
    /**
     * Add diabetes pedigree to the list
     * @param diabetespedigree Is the diabetes pedigree value in double format
     */

    public static void setDiabetes_Pedigree(double diabetespedigree , int i) {
        ThisArrayList.diabetespedigree = diabetespedigree;
        pedigreefunction.put(i , ThisArrayList.diabetespedigree);
    }
    
    /**
     * Add glucose level to the list
     * @param glucoseconcentration Is the glucose concentration value in double format
     */

    public static void setGlucose_Concentration(double glucoseconcentration , int i) {
        ThisArrayList.glucoseconcentration = glucoseconcentration;
        glucoselevel.put(i , ThisArrayList.glucoseconcentration);
    }
    
    /**
     * Add pregnancy times to the list
     * @param pregnancytimes Is the pregnancy times value in double format
     */

    public static void setPregnancy_Times(double pregnancytimes , int i) {
        ThisArrayList.pregnancytimes = pregnancytimes;
        pregnants.put(i , ThisArrayList.pregnancytimes);
    }
    
    /**
     * Add skin fold thickness to the list 
     * @param foldthickness Is the skin fold thickness value in double format
     */

    public static void setFold_thickness(double foldthickness , int i) {
        ThisArrayList.foldthickness = foldthickness;
        skinfoldthickness.put(i , ThisArrayList.foldthickness);
    }
    
    /**
     * Add serum insulin to the list
     * @param seruminsulin Is the serum insulin value in double format
     */

    public static void setTwo_Hour_SerumInsulin(double seruminsulin , int i) {
        ThisArrayList.seruminsulin = seruminsulin;
        seruminsulins.put(i , ThisArrayList.seruminsulin);
    }
    
    
     /**
     * Add output to the list
     * @param outputclass Is the output value in double format
     */

    public static void setOutput_Class(double outputclass , int i) {
        ThisArrayList.outputclass = outputclass;
        outputclasses.put(i , ThisArrayList.outputclass);
    }
    
    /**
     * 
     * @return list of age in double format
     */

    public static Map<Integer,Double> getAge() {
        return ages;
    }
    
    /**
     * 
     * @return list of bmi in double format
     */

    public static Map<Integer,Double> getBmi() {
        return bmis;
    }
    
    /**
     * 
     * @return list of blood pressure in double format
     */

    public static Map<Integer,Double> getBlood_Pressure() {
        return bloodpressure;
    }
    
    /**
     * 
     * @return list of diabetes pedigree in double format
     */

    public static Map<Integer,Double> getDiabetes_Pedigree() {
        return pedigreefunction;
    }
    
    /**
     * 
     * @return list of glucose level in double format
     */

    public static Map<Integer,Double> getGlucose_Concentration() {
        return glucoselevel;
    }
    
    /**
     * 
     * @return list of pregnacy times in double format
     */

    public static Map<Integer,Double> getPregnancy_Times() {
        return pregnants;
    }
    
    /**
     * 
     * @return list of skin fold thickness in double format
     */

    public static Map<Integer,Double> getFold_thickness() {
        return skinfoldthickness;
    }
    
    /**
     * 
     * @return list of serum insulin in double format
     */

    public static Map<Integer,Double> getTwo_Hour_SerumInsulin() {
        return seruminsulins;
    }
    
    /**
     * 
     * @return list of outputs in double format
     */

    public static Map<Integer,Double> getOutput_Class() {
        return outputclasses;
    }

}
