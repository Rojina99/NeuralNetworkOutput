/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumlist;

import arraylist.ThisArrayList;
import java.util.Map;
import org.decimal4j.util.DoubleRounder;
import readcsv.ReadCSVTraining;
import weightmatrix.WeightMatrixList;


/**
 *
 * @author User Used to calculate sum values in Hidden Layer Neurons
 */
public class HiddenSumCalculation {
    
    /**
     * Is used to store sum values from input to hidden layer
     */
    public void HiddenSumCalc()
    {
//        WeightMatrixSerialInitialize weightinit = new WeightMatrixSerialInitialize();
//        weightinit.weight_matrix_initialize();

        /**
         * Initializes object for ReadCSV to read input values
         */
//        ReadCSVTraining readcsv = new ReadCSVTraining();
//        readcsv.ReadCSV();

//        for(Double d:ThisArrayList.getAge())
//        {
//         System.out.println(d);   
//        }
//      System.out.println(WeightMatrixList.getI_to_HL1_N1().size());
        /**
         * To loop over all input and weight matrix for hidden layer neurons 
         * to calculate output for entire input values
         */
        
//        System.out.println(ThisArrayList.getDiabetes_Pedigree().size());

        for (int i = 0; i < ThisArrayList.getDiabetes_Pedigree().size(); i++) {

//            System.out.println("i,"+i);
            /**
             * Declaring variables to accommodate input values
             */
            
            double preg = ThisArrayList.getPregnancy_Times().get(i);
            double glucoselevel = ThisArrayList.getGlucose_Concentration().get(i);
            double pressure = ThisArrayList.getBlood_Pressure().get(i);
            double foldthickness = ThisArrayList.getFold_thickness().get(i);
            double insulin = ThisArrayList.getTwo_Hour_SerumInsulin().get(i);
            double bmi = ThisArrayList.getBmi().get(i);
            double pedigree = ThisArrayList.getDiabetes_Pedigree().get(i);
            double age = ThisArrayList.getAge().get(i);
            
            
            
            
            
            

            // System.out.println(ThisArrayList.getTwo_Hour_SerumInsulin().get(i));
            /**
             * Value used for switching to multiple Input values and
             * corresponding value in Weight List Column
             */
            int j = 0;

            /**
             * Initializing values to calculate weighted sum
             */
            double ProInput1 = 0, ProInput2 = 0, ProInput3 = 0,
                    ProInput4 = 0, ProInput5 = 0, ProInput6 = 0,
                    ProInput7 = 0, ProInput8 = 0, ProThreshold = 0;

            /**
             * Looping input value for Input to Hidden Layer Neuron1
             */
            for (double d : WeightMatrixList.getI_to_HL1_N1().values()) {
//            double ProInput1=0,ProInput2=0,ProInput3=0,
//                    ProInput4=0,ProInput5=0,ProInput6=0,
//                    ProInput7=0,ProInput8=0,ProThreshold=0;
                
                
                switch (j) {
                    case 0: {
                        ProInput1 = DoubleRounder.round(preg * d,4);
                        break;
                    }
                    case 1: {
                        ProInput2 = DoubleRounder.round(glucoselevel * d,4);
                        break;
                    }
                    case 2: {
                        ProInput3 = DoubleRounder.round(pressure * d,4);
                        break;
                    }
                    case 3: {
                        ProInput4 = DoubleRounder.round(foldthickness * d,4);
                        break;
                    }
                    case 4: {
                        ProInput5 = DoubleRounder.round(insulin * d,4);
                        break;
                    }
                    case 5: {
                        ProInput6 = DoubleRounder.round(bmi * d,4);
                        break;
                    }
                    case 6: {
                        ProInput7 = DoubleRounder.round(pedigree * d,4);
                        break;
                    }
                    case 7: {
                        ProInput8 = DoubleRounder.round(age * d,4);
                        break;
                    }
                    case 8: {
                        ProThreshold = DoubleRounder.round(1 * d,4);
                        break;
                    }
                }
//            double sum=ProInput1+ProInput2+ProInput3+ProInput4+
//                        ProInput5+ProInput6+ProInput7+ProInput8+
//                        ProThreshold;

                j++;

//            System.out.println(sum);
                //  System.out.println(ProInput1);
                // System.out.println(j++);
            }
            /**
             * Sum of ith Input to hidden layer neuron1
             */
            double sum = DoubleRounder.round(ProInput1 + ProInput2 + ProInput3 + ProInput4
                    + ProInput5 + ProInput6 + ProInput7 + ProInput8
                    + ProThreshold,4);
            SumList.set_sum_I_to_HL1_N1(sum , i);
//            System.out.println(sum);

            /**
             * Looping input value for Input to Hidden Layer Neuron2
             */
            j = 0;

            for (double d: WeightMatrixList.getI_to_HL1_N2().values()) {
//            double ProInput1=0,ProInput2=0,ProInput3=0,
//                    ProInput4=0,ProInput5=0,ProInput6=0,
//                    ProInput7=0,ProInput8=0,ProThreshold=0;

                
                switch (j) {
                    case 0: {
                        ProInput1 = DoubleRounder.round(preg * d,4);
                        break;
                    }
                    case 1: {
                        ProInput2 = DoubleRounder.round(glucoselevel * d,4);
                        break;
                    }
                    case 2: {
                        ProInput3 = DoubleRounder.round(pressure * d,4);
                        break;
                    }
                    case 3: {
                        ProInput4 = DoubleRounder.round(foldthickness * d,4);
                        break;
                    }
                    case 4: {
                        ProInput5 = DoubleRounder.round(insulin * d,4);
                        break;
                    }
                    case 5: {
                        ProInput6 = DoubleRounder.round(bmi * d,4);
                        break;
                    }
                    case 6: {
                        ProInput7 = DoubleRounder.round(pedigree * d,4);
                        break;
                    }
                    case 7: {
                        ProInput8 = DoubleRounder.round(age * d,4);
                        break;
                    }
                    case 8: {
                        ProThreshold = DoubleRounder.round(1 * d,4);
                        break;
                    }
                }
//            double sum=ProInput1+ProInput2+ProInput3+ProInput4+
//                        ProInput5+ProInput6+ProInput7+ProInput8+
//                        ProThreshold;

                j++;

//            System.out.println(sum);
                //  System.out.println(ProInput1);
                // System.out.println(j++);
            }
            /**
             * Sum of ith Input to hidden layer neuron2
             */
            sum = DoubleRounder.round(ProInput1 + ProInput2 + ProInput3 + ProInput4
                    + ProInput5 + ProInput6 + ProInput7 + ProInput8
                    + ProThreshold,4);
            SumList.set_sum_I_to_HL1_N2(sum,i);
//            System.out.println(sum);

            /**
             * Looping input value for Input to Hidden Layer Neuron3
             */
            j = 0;
            for (double d : WeightMatrixList.getI_to_HL1_N3().values()) {
//            double ProInput1=0,ProInput2=0,ProInput3=0,
//                    ProInput4=0,ProInput5=0,ProInput6=0,
//                    ProInput7=0,ProInput8=0,ProThreshold=0;
                    
                
                
                switch (j) {
                    case 0: {
                        ProInput1 = DoubleRounder.round(preg * d,4);
                        break;
                    }
                    case 1: {
                        ProInput2 = DoubleRounder.round(glucoselevel * d,4);
                        break;
                    }
                    case 2: {
                        ProInput3 = DoubleRounder.round(pressure * d,4);
                        break;
                    }
                    case 3: {
                        ProInput4 = DoubleRounder.round(foldthickness * d,4);
                        break;
                    }
                    case 4: {
                        ProInput5 = DoubleRounder.round(insulin * d,4);
                        break;
                    }
                    case 5: {
                        ProInput6 = DoubleRounder.round(bmi * d,4);
                        break;
                    }
                    case 6: {
                        ProInput7 = DoubleRounder.round(pedigree * d,4);
                        break;
                    }
                    case 7: {
                        ProInput8 = DoubleRounder.round(age * d,4);
                        break;
                    }
                    case 8: {
                        ProThreshold = DoubleRounder.round(1 * d,4);
                        break;
                    }
                }
//            double sum=ProInput1+ProInput2+ProInput3+ProInput4+
//                        ProInput5+ProInput6+ProInput7+ProInput8+
//                        ProThreshold;

                j++;

//            System.out.println(sum);
                //  System.out.println(ProInput1);
                // System.out.println(j++);
            }
            /**
             * Sum of ith Input to hidden layer neuron3
             */
            sum = DoubleRounder.round(ProInput1 + ProInput2 + ProInput3 + ProInput4
                    + ProInput5 + ProInput6 + ProInput7 + ProInput8
                    + ProThreshold,4);
            SumList.set_sum_I_to_HL1_N3(sum , i);
//            System.out.println(sum);

            /**
             * Looping input value for Input to Hidden Layer Neuron4
             */
            j = 0;

            for (double d : WeightMatrixList.getI_to_HL1_N4().values()) {
//            double ProInput1=0,ProInput2=0,ProInput3=0,
//                    ProInput4=0,ProInput5=0,ProInput6=0,
//                    ProInput7=0,ProInput8=0,ProThreshold=0;

                
                
                switch (j) {
                    case 0: {
                        ProInput1 = DoubleRounder.round(preg * d,4);
                        break;
                    }
                    case 1: {
                        ProInput2 = DoubleRounder.round(glucoselevel * d,4);
                        break;
                    }
                    case 2: {
                        ProInput3 = DoubleRounder.round(pressure * d,4);
                        break;
                    }
                    case 3: {
                        ProInput4 = DoubleRounder.round(foldthickness * d,4);
                        break;
                    }
                    case 4: {
                        ProInput5 = DoubleRounder.round(insulin * d,4);
                        break;
                    }
                    case 5: {
                        ProInput6 = DoubleRounder.round(bmi * d,4);
                        break;
                    }
                    case 6: {
                        ProInput7 = DoubleRounder.round(pedigree * d,4);
                        break;
                    }
                    case 7: {
                        ProInput8 = DoubleRounder.round(age * d,4);
                        break;
                    }
                    case 8: {
                        ProThreshold = DoubleRounder.round(1 * d,4);
                        break;
                    }
                }
//            double sum=ProInput1+ProInput2+ProInput3+ProInput4+
//                        ProInput5+ProInput6+ProInput7+ProInput8+
//                        ProThreshold;

                j++;

//            System.out.println(sum);
                //  System.out.println(ProInput1);
                // System.out.println(j++);
            }
            /**
             * Sum of ith Input to hidden layer neuron4
             */
            sum = DoubleRounder.round(ProInput1 + ProInput2 + ProInput3 + ProInput4
                    + ProInput5 + ProInput6 + ProInput7 + ProInput8
                    + ProThreshold,4);
            SumList.set_sum_I_to_HL1_N4(sum , i);
//            System.out.println(sum);

        }

//System.out.println(WeightMatrixList.getHL_to_Output().size());

//int i=0;
//for(Double d:SumList.get_sum_I_to_HL1_N1())
//{
//System.out.println(d);
//System.out.println("i,"+i);
//i++;
//    }
    }   
}
