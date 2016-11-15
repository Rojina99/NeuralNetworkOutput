/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activationfunction;

import org.decimal4j.util.DoubleRounder;
import weightmatrix.NNConfig;

/**
 *
 * @author User User Uses TanH Function to activate the sum in Neurons
 */
public class TanhActivation {
    
    /**
     * Variables to store the incoming sums
     */
       private double input;
       private static double weight_matrix_range;     

   /**
    * Used to apply TanH function to incoming sum and return activated output 
    * after the function is applied
    * @param input The incoming sum to which TanH Activation Function is to be applied in double format
    * @return Returns Returns value after TanH function is applied in double format
    */       
       
    public double get_Tanh_Value(double input)
    {
        this.input=input;
        double tanh_value=DoubleRounder.round(((Math.exp(2*input))-1)/((Math.exp(2*input))+1),9);
        return tanh_value;
    }


    /**
     * Used to apply TanH function derivative to incoming sum and return derivative of activated output 
     * after the function is applied 
     * @param input The incoming sum to which Derivative of 
     * TanH Activation Function is to be applied in double format
     * @return Returns value after Derivative of TanH function is applied in double format
     */
    
     public double get_Tanh_Deriv_Value(double input)
    {
        this.input=input;
        double tanh_value=DoubleRounder.round(((Math.exp(2*input))-1)/((Math.exp(2*input))+1),9);
        double tanh_deriv=DoubleRounder.round((1-(tanh_value*tanh_value)),9);
        return tanh_deriv;
    } 


     /**
      * 
      * @return Returns the range for weight matrix in double format
      */
     
//     public static double get_weight_Matrix_Range()
//     {
//       double th=(NNConfig.input_count+NNConfig.output_count);
//       TanhActivation.weight_matrix_range=4*Math.sqrt(6/th);
//       return TanhActivation.weight_matrix_range;
//     }
}
