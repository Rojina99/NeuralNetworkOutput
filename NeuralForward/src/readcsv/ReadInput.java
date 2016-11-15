/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readcsv;

import arraylist.ThisArrayList;
import errorlist.ErrorA;
import java.util.Scanner;
import normalizeneuralnetwork.NormalizeScannedInput;
import outputlist.HiddenOutputCalculate;
import outputlist.OutputCalculate;
import sumlist.HiddenSumCalculation;
import sumlist.OutputSumCalculation;
import weightmatrix.WeightMatrixTrained;

/**
 *
 * @author User
 */
public class ReadInput {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the value for pregnancy times");
        Double preg = sc.nextDouble();
        ThisArrayList.setPregnancy_Times(preg, 0);
        System.out.println(preg);

        System.out.println("Input the value for glucose concentration");
        Double glucose = sc.nextDouble();
        ThisArrayList.setGlucose_Concentration(glucose, 0);
        System.out.println(glucose);

        System.out.println("Input the value for dialostic pressure");
        Double pressure = sc.nextDouble();
        ThisArrayList.setBlood_Pressure(pressure, 0);
        System.out.println(pressure);

        System.out.println("Input the value for skin fold thickness");
        Double fold_thickness = sc.nextDouble();
        ThisArrayList.setFold_thickness(fold_thickness, 0);
        System.out.println(fold_thickness);

        System.out.println("Input the value for two hour serum insulin");
        Double serum_insulin = sc.nextDouble();
        ThisArrayList.setTwo_Hour_SerumInsulin(serum_insulin, 0);
        System.out.println(serum_insulin);

        System.out.println("Input the value for bmi");
        Double bmi = sc.nextDouble();
        ThisArrayList.setBMI(bmi, 0);
        System.out.println(bmi);

        System.out.println("Input the value for diabetes pedigree");
        Double pedigree = sc.nextDouble();
        ThisArrayList.setDiabetes_Pedigree(pedigree, 0);
        System.out.println(pedigree);

        System.out.println("Input the value for age");
        Double age = sc.nextDouble();
        ThisArrayList.setAge(age, 0);
        System.out.println(age);
        
        sc.close();
        
        MinMaxSet mmset = new MinMaxSet();
        mmset.mimmax();

        if (preg > ThisArrayList.max_preg_value) {
            ThisArrayList.max_preg_value = preg;
        } else if (preg < ThisArrayList.min_preg_value) {
            ThisArrayList.min_preg_value = preg;
        }

        if (glucose > ThisArrayList.max_glucose_value) {
            ThisArrayList.max_glucose_value = glucose;
        } else if (glucose < ThisArrayList.min_glucose_value) {
            ThisArrayList.min_glucose_value = glucose;
        }

        if (pressure > ThisArrayList.max_pressure_value) {
            ThisArrayList.max_pressure_value = pressure;
        } else if (pressure < ThisArrayList.min_pressure_value) {
            ThisArrayList.min_pressure_value = pressure;
        }

        if (fold_thickness > ThisArrayList.max_foldthickness_value) {
            ThisArrayList.max_foldthickness_value = fold_thickness;
        } else if (fold_thickness < ThisArrayList.min_foldthickness_value) {
            ThisArrayList.min_foldthickness_value = fold_thickness;
        }

        if (serum_insulin > ThisArrayList.max_seruminsulin_value) {
            ThisArrayList.max_seruminsulin_value = serum_insulin;
        } else if (serum_insulin < ThisArrayList.min_seruminsulin_value) {
            ThisArrayList.min_seruminsulin_value = serum_insulin;
        }

        if (bmi > ThisArrayList.max_bmi_value) {
            ThisArrayList.max_bmi_value = bmi;
        } else if (bmi < ThisArrayList.min_bmi_value) {
            ThisArrayList.min_bmi_value = bmi;
        }

        if (pedigree > ThisArrayList.max_pedigree_value) {
            ThisArrayList.max_pedigree_value = pedigree;
        } else if (pedigree < ThisArrayList.min_pedigree_value) {
            ThisArrayList.min_pedigree_value = pedigree;
        }

        if (age > ThisArrayList.max_age_value) {
            ThisArrayList.max_age_value = age;
        } else if (age < ThisArrayList.min_age_value) {
            ThisArrayList.min_age_value = age;
        }
        
            int it = age.intValue();
            
          
            

//        System.out.println(ThisArrayList.max_preg_value);
//        
//        System.out.println(ThisArrayList.min_age_value);

        /**
         * For Normalizing given Input to -1 to 1 range
         */
        NormalizeScannedInput nrm = new NormalizeScannedInput();
        nrm.normalize();

        /**
         * For weight matrix initialization
         */
        WeightMatrixTrained wtrain = new WeightMatrixTrained();
        wtrain.weightmatrixset();

        /**
         * For Hidden Sum Calculation
         */
        HiddenSumCalculation sumcalc = new HiddenSumCalculation();
        sumcalc.HiddenSumCalc();

        /**
         * For Output Sum Calculation
         */
        OutputSumCalculation outsumcalc = new OutputSumCalculation();
        outsumcalc.OutputSumcalc();

        /**
         * For Hidden Output Calculation
         */
        HiddenOutputCalculate hiddenopcalc = new HiddenOutputCalculate();
        hiddenopcalc.HiddenOutputCalc();

        /**
         * For Output Calculation
         */
        OutputCalculate output = new OutputCalculate();
        output.OutputCalc();
        
        /**
          * For Error Calculation
          */
         
         ErrorA errors=new ErrorA();
         double a = errors.errA();
         

         
         System.out.println(a);
         
         }
        

}
