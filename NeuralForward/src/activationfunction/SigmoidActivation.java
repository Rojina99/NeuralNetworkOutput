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
 * @author User Uses Signoid Function to activate the sum in Neurons
 */
public class SigmoidActivation {
    /**
     * Variables to store the incoming sums
     */
    private double input;
    private static double weight_matrix_range;
            
   /**
    * Used to apply Sigmoid function to incoming sum and return  activated output 
    * after the function is applied
    * @param input The incoming sum to which Sigmoid Activation Function is to be applied in double format
    * @return Returns value after Sigmoid function is applied in double format
    */
    public double get_Sigmoid_Value(double input)
    {
        this.input=input;
        double sigmoid_value=DoubleRounder.round(1/(1+Math.exp(-this.input)),9);
        return sigmoid_value;
    }
    
    
    /**
     * Used to apply Sigmoid function derivative to incoming sum and return derivative of activated output 
     * after the function is applied 
     * @param input The incoming sum to which Derivative of 
     * Sigmoid Activation Function is to be applied in double format
     * @return Returns value after Derivative of Sigmoid function is applied in double format
     */
     public double get_Sigmoid_Deriv_Value(double input)
    {
        this.input=input;
        double sigmoid_value=DoubleRounder.round(1/(1+Math.exp(-this.input)),9);
        double sigmoid_deriv=DoubleRounder.round(sigmoid_value*(1-sigmoid_value),9);
        return sigmoid_deriv;
    }
     
     
     /**
      * 
      * @return Returns the range for weight matrix in double format
      */
     public static double get_weight_Matrix_Range()
     {
       double th=(NNConfig.input_count+NNConfig.output_count);
       SigmoidActivation.weight_matrix_range=Math.sqrt(6/th);
       return SigmoidActivation.weight_matrix_range;
     }
}
