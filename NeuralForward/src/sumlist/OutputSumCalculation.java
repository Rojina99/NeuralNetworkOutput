/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumlist;

import java.util.List;
import org.decimal4j.util.DoubleRounder;
import weightmatrix.WeightMatrixList;

/**
 *
 * @author User Used to calculate sum values in output
 */
public class OutputSumCalculation {
    
    public void OutputSumcalc()
    {
    
                  
//            HiddenSumCalculation sc=new HiddenSumCalculation();
//            sc.HiddenSumCalc();
        
           // System.out.println(WeightMatrixList.getHL_to_Output().size());
           
          // System.out.println(SumList.get_sum_I_to_HL1_N1().size());
           
                       

            
          /**
          * Used to set sum values for Hidden Layer Neuron1 to Output for
          * entire input
          */
             
           for (int i=0;i<SumList.get_sum_I_to_HL1_N1().size();i++) {

            //   System.out.println("i,"+i);
           double ProInput1=0,ProInput2=0,ProInput3=0,ProInput4=0,ProThreshold=0;
            
           /**
            * Values of sum from previous layer
            */
           double sumI_to_HN1=SumList.get_sum_I_to_HL1_N1().get(i);
           double sumI_to_HN2=SumList.get_sum_I_to_HL1_N2().get(i);
           double sumI_to_HN3=SumList.get_sum_I_to_HL1_N3().get(i);
           double sumI_to_HN4=SumList.get_sum_I_to_HL1_N4().get(i);

           /**
            * Loops through weight matrix to calculate values of sum in output 
            * layer for single input
            */
                int j =0;
                for(double d:WeightMatrixList.getHL_to_Output().values())
                {
                switch (j) {
                    case 0: {
                        ProInput1 = DoubleRounder.round(sumI_to_HN1 * d,4);
                        break;
                    }
                    case 1: {
                        ProInput2 = DoubleRounder.round(sumI_to_HN2 * d,4);
                        break;
                    }
                    case 2: {
                        ProInput3 = DoubleRounder.round(sumI_to_HN3 * d,4);
                        break;
                    }
                    case 3: {
                        ProInput4 = DoubleRounder.round(sumI_to_HN4 * d,4);
                        break;
                    }
                                        
                    case 5: {
                        ProThreshold = DoubleRounder.round(1 * d,4);
                        break;
                    }
                }
            
                j++;
                
                }

                double sum = DoubleRounder.round(ProInput1 + ProInput2 + ProInput3 + ProInput4+ ProThreshold,4);
                SumList.set_sum_HL_to_Output(sum , i);
                
                //System.out.println(sum);
                //  System.out.println(ProInput1);
                // System.out.println(j++);
            }                                         
                   
                                      
             //         System.out.println(sum);
        }
    
}
