/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package normalizeneuralnetwork;

import arraylist.ThisArrayList;

/**
 *
 * @author User
 */
public class NormalizeScannedInput {
    
    private static double diff_age_value;
    private static double diff_bmi_value;
    private static double diff_pressure_value;
    private static double diff_pedigree_value;
    private static double diff_glucose_value;
    private static double diff_preg_value;
    private static double diff_foldthickness_value;
    private static double diff_seruminsulin_value;
    
    public void normalize()
    {
        /**
         * Difference between extreme values in input columns
         */
        diff_age_value = ThisArrayList.max_age_value - ThisArrayList.min_age_value;
        double neg_diff_age_value = (-diff_age_value);

        diff_bmi_value = ThisArrayList.max_bmi_value - ThisArrayList.min_bmi_value;
        double neg_diff_bmi_value = (-diff_bmi_value);

        diff_pressure_value = ThisArrayList.max_pressure_value - ThisArrayList.min_pressure_value;
        double neg_diff_pressure_value = (-diff_pressure_value);

        diff_pedigree_value = ThisArrayList.max_pedigree_value - ThisArrayList.min_pedigree_value;
        double neg_diff_pedigree_value = (-diff_pedigree_value);

        diff_glucose_value = ThisArrayList.max_glucose_value - ThisArrayList.min_glucose_value;
        double neg_diff_glucose_value = (-diff_glucose_value);

        diff_preg_value = ThisArrayList.max_preg_value - ThisArrayList.min_preg_value;
        double neg_diff_preg_value = (-diff_preg_value);

        diff_foldthickness_value = ThisArrayList.max_foldthickness_value - ThisArrayList.min_foldthickness_value;
        double neg_diff_foldthickness_value = (-diff_foldthickness_value);

        diff_seruminsulin_value = ThisArrayList.max_seruminsulin_value - ThisArrayList.min_seruminsulin_value;
        double neg_diff_seruminsulin_value = (-diff_seruminsulin_value);

        /**
         * Sets value for normalization range
         */
        double high_norm = 1, low_norm = -1;
        double norm_diff = high_norm - low_norm;
        double neg_norm_diff = (-norm_diff);
        
//        System.out.println("Size of AgeMatrix "+ThisArrayList.getAge().size());

        /**
         * Loops through ArrayList to normalize each value
         */
        for (int a = 0; a < ThisArrayList.getAge().size(); a++) {

            /**
             * Formula for feature scaling and squashing value
             */
            
            double input_diff_preg = ((ThisArrayList.getPregnancy_Times().get(a)) - ThisArrayList.min_preg_value);
            double Normalize_preg = (((input_diff_preg * norm_diff) / diff_preg_value) + low_norm);
            
            ThisArrayList.setPregnancy_Times(Normalize_preg , a);
            
            /**
             * Denormalize the normalized column
             */
            double out_diff1_preg = -(high_norm * ThisArrayList.min_preg_value);
            double out_diff2_preg = low_norm * ThisArrayList.max_preg_value;
            double sum_preg = (neg_diff_preg_value * Normalize_preg) + out_diff1_preg + out_diff2_preg;
            double Denormalize_preg = sum_preg / neg_norm_diff;

//            System.out.println(ThisArrayList.getPregnancy_Times().get(a) + "," + Normalize_preg + "," + Denormalize_preg);


            double input_diff_glucose = ((ThisArrayList.getGlucose_Concentration().get(a)) - ThisArrayList.min_glucose_value);
            double Normalize_glucose = (((input_diff_glucose * norm_diff) / diff_glucose_value) + low_norm);

            
            ThisArrayList.setGlucose_Concentration(Normalize_glucose , a);
            
            double out_diff1_glucose = -(high_norm * ThisArrayList.min_glucose_value);
            double out_diff2_glucose = low_norm * ThisArrayList.max_glucose_value;
            double sum_glucose = (neg_diff_glucose_value * Normalize_glucose) + out_diff1_glucose + out_diff2_glucose;
            double Denormalize_glucose = sum_glucose / neg_norm_diff;

//            System.out.println(ThisArrayList.getGlucose_Concentration().get(a) + "," + Normalize_glucose + "," + Denormalize_glucose);    
            

            double input_diff_pressure = ((ThisArrayList.getBlood_Pressure().get(a)) - ThisArrayList.min_pressure_value);
            double Normalize_pressure = (((input_diff_pressure * norm_diff) / diff_pressure_value) + low_norm);

            ThisArrayList.setBlood_Pressure(Normalize_pressure , a);
            
            double out_diff1_pressure = -(high_norm * ThisArrayList.min_pressure_value);
            double out_diff2_pressure = low_norm * ThisArrayList.max_pressure_value;
            double sum_pressure = (neg_diff_pressure_value * Normalize_pressure) + out_diff1_pressure + out_diff2_pressure;
            double Denormalize_pressure = sum_pressure / neg_norm_diff;

//            System.out.println(ThisArrayList.getBlood_Pressure().get(a) + "," + Normalize_pressure + "," + Denormalize_pressure);
                       

            

            double input_diff_foldthickness = ((ThisArrayList.getFold_thickness().get(a)) - ThisArrayList.min_foldthickness_value);
            double Normalize_foldthickness = (((input_diff_foldthickness * norm_diff) / diff_foldthickness_value) + low_norm);

            ThisArrayList.setFold_thickness(Normalize_foldthickness , a);
            
            double out_diff1_foldthickness = -(high_norm * ThisArrayList.min_foldthickness_value);
            double out_diff2_foldthickness = low_norm * ThisArrayList.max_foldthickness_value;
            double sum_foldthickness = (neg_diff_foldthickness_value * Normalize_foldthickness) + out_diff1_foldthickness + out_diff2_foldthickness;
            double Denormalize_foldthickness = sum_foldthickness / neg_norm_diff;

//            System.out.println(ThisArrayList.getFold_thickness().get(a) + "," + Normalize_foldthickness + "," + Denormalize_foldthickness);

            double input_diff_seruminsulin = ((ThisArrayList.getTwo_Hour_SerumInsulin().get(a)) - ThisArrayList.min_seruminsulin_value);
            double Normalize_seruminsulin = (((input_diff_seruminsulin * norm_diff) / diff_seruminsulin_value) + low_norm);

            ThisArrayList.setTwo_Hour_SerumInsulin(Normalize_seruminsulin , a);
            
            double out_diff1_seruminsulin = -(high_norm * ThisArrayList.min_seruminsulin_value);
            double out_diff2_seruminsulin = low_norm * ThisArrayList.max_seruminsulin_value;
            double sum_seruminsulin = (neg_diff_seruminsulin_value * Normalize_seruminsulin) + out_diff1_seruminsulin + out_diff2_seruminsulin;
            double Denormalize_seruminsulin = sum_seruminsulin / neg_norm_diff;

//            System.out.println(ThisArrayList.getTwo_Hour_SerumInsulin().get(a) + "," + Normalize_seruminsulin + "," + Denormalize_seruminsulin);

            
            double input_diff_bmi = ((ThisArrayList.getBmi().get(a)) - ThisArrayList.min_bmi_value);
            double Normalize_bmi = (((input_diff_bmi * norm_diff) / diff_bmi_value) + low_norm);

            ThisArrayList.setBMI(Normalize_bmi , a);
            
            double out_diff1_bmi = -(high_norm * ThisArrayList.min_bmi_value);
            double out_diff2_bmi = low_norm * ThisArrayList.max_bmi_value;
            double sum_bmi = (neg_diff_bmi_value * Normalize_bmi) + out_diff1_bmi + out_diff2_bmi;
            double Denormalize_bmi = sum_bmi / neg_norm_diff;

//            System.out.println(ThisArrayList.getBmi().get(a) + "," + Normalize_bmi + "," + Denormalize_bmi);
            
            
            double input_diff_pedigree = ((ThisArrayList.getDiabetes_Pedigree().get(a)) - ThisArrayList.min_pedigree_value);
            double Normalize_pedigree = (((input_diff_pedigree * norm_diff) / diff_pedigree_value) + low_norm);

            ThisArrayList.setDiabetes_Pedigree(Normalize_pedigree , a);
            
            double out_diff1_pedigree = -(high_norm * ThisArrayList.min_pedigree_value);
            double out_diff2_pedigree = low_norm * ThisArrayList.max_pedigree_value;
            double sum_pedigree = (neg_diff_pedigree_value * Normalize_pedigree) + out_diff1_pedigree + out_diff2_pedigree;
            double Denormalize_pedigree = sum_pedigree / neg_norm_diff;

//            System.out.println(ThisArrayList.getDiabetes_Pedigree().get(a) + "," + Normalize_pedigree + "," + Denormalize_pedigree);
            
            double input_diff_age = ((ThisArrayList.getAge().get(a)) - ThisArrayList.min_age_value);
            double Normalize_age = (((input_diff_age * norm_diff) / diff_age_value) + low_norm);

            ThisArrayList.setAge(Normalize_age , a);
            
            double out_diff1_age = -(high_norm * ThisArrayList.min_age_value);
            double out_diff2_age = low_norm * ThisArrayList.max_age_value;
            double sum_age = (neg_diff_age_value * Normalize_age) + out_diff1_age + out_diff2_age;
            double Denormalize_age = sum_age / neg_norm_diff;

//            System.out.println(ThisArrayList.getAge().get(a) + "," + Normalize_age + "," + Denormalize_age);
            
        }
        
    }
}
