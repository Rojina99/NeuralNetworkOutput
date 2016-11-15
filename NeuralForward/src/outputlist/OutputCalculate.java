/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputlist;

import activationfunction.TanhActivation;
import org.decimal4j.util.DoubleRounder;
import sumlist.OutputSumCalculation;
import sumlist.SumList;

/**
 *
 * @author User Stores values of output after activation function is applied in
 * sums of output layer
 */
public class OutputCalculate {
    
 /**
  * Stores values of output in output layer after activation function is applied
  */
    public void OutputCalc()
    {
//        OutputSumCalculation hsc=new OutputSumCalculation();
//        hsc.OutputSumcalc();
        
        /**
         * To Activate outputs
         */
        TanhActivation th=new TanhActivation();
        
       //  int j=SumList.get_sum_HL_to_Output().size();
      //  System.out.println("j,"+j);
        
      /**
       * Values of output after applying activation function
       */
        for(int i=0;i<SumList.get_sum_HL_to_Output().size();i++)
        {
            double sum_Output=DoubleRounder.round(SumList.get_sum_HL_to_Output().get(i),4);
            
            double op_Output=DoubleRounder.round(th.get_Tanh_Value(sum_Output),4);
            
            OutputList.set_Output_HL_to_Output(op_Output , i);
            
           //System.out.println(SumList.get_sum_HL_to_Output().get(i)+","+OutputList.get_Output_HL_to_Output().get(i));
        }
    }
}
