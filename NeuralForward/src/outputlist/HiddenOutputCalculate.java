/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputlist;

import activationfunction.RectifiedLinearUnitActivation;
import activationfunction.TanhActivation;
import org.decimal4j.util.DoubleRounder;
import sumlist.HiddenSumCalculation;
import sumlist.SumList;

/**
 *
 * @author User Used to calculate output in hidden layers
 */
public class HiddenOutputCalculate {
    
    /**
     * Stores value of sum after activation function is applied in neurons of hidden layer
     */
    
    public void HiddenOutputCalc()
    {
//        HiddenSumCalculation sc=new HiddenSumCalculation();
//        sc.HiddenSumCalc();
        
        /**
         * To Activate outputs 
         */
//        TanhActivation th=new TanhActivation();
        RectifiedLinearUnitActivation th = new RectifiedLinearUnitActivation();
        
        /**
         * Loops through sum list and stores its corresponding output after activation function is applied 
         */
        for(int i=0;i<SumList.get_sum_I_to_HL1_N4().size();i++)
        {
           /**
            * Values of sum in hidden layer
            */
           double sum_HiddenLayerN1=DoubleRounder.round(SumList.get_sum_I_to_HL1_N1().get(i),4);
           double sum_HiddenLayerN2=DoubleRounder.round(SumList.get_sum_I_to_HL1_N2().get(i),4);
           double sum_HiddenLayerN3=DoubleRounder.round(SumList.get_sum_I_to_HL1_N3().get(i),4);
           double sum_HiddenLayerN4=DoubleRounder.round(SumList.get_sum_I_to_HL1_N4().get(i),4);
           
           /**
            * Apply activation to corresponding sum values
            */
           double op_HiddenLayerN1=DoubleRounder.round(th.get_Relu_Value(sum_HiddenLayerN1),4);
           double op_HiddenLayerN2=DoubleRounder.round(th.get_Relu_Value(sum_HiddenLayerN2),4);
           double op_HiddenLayerN3=DoubleRounder.round(th.get_Relu_Value(sum_HiddenLayerN3),4);
           double op_HiddenLayerN4=DoubleRounder.round(th.get_Relu_Value(sum_HiddenLayerN4),4);
           
           /**
            * Stores output in hidden layer after activation function is applied
            */
           OutputList.set_Output_I_to_HL1_N1(op_HiddenLayerN1 , i);
           OutputList.set_Output_I_to_HL1_N2(op_HiddenLayerN2 , i);
           OutputList.set_Output_I_to_HL1_N3(op_HiddenLayerN3 , i);
           OutputList.set_Output_I_to_HL1_N4(op_HiddenLayerN4 , i);
           
           
        } 
    }
}
