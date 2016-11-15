/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputlist;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author User Used to store sum values after activation function is applied
 */
public class OutputList {
    
    /**
     * Variables to store Output Values
     */
    
    private static double OutputHiddenLayerN1;
    private static double OutputHiddenLayerN2;
    private static double OutputHiddenLayerN3;
    private static double OutputHiddenLayerN4;
    private static double Activ_Output;
   
    /**
     * The variable used to accommodate position in the list
     * in integer format
     */
    private static int outputposition; 
    
    /**
     * List to store output in double format
     */
    private static Map<Integer,Double> Output_Inputs_to_HiddenLayer1_N1= new LinkedHashMap<>();

    private static Map<Integer,Double> Output_Inputs_to_HiddenLayer1_N2 = new LinkedHashMap<>();

    private static Map<Integer,Double> Output_Inputs_to_HiddenLayer1_N3 = new LinkedHashMap<>();
    
    private static Map<Integer,Double> Output_Inputs_to_HiddenLayer1_N4 = new LinkedHashMap<>();
    
    private static Map<Integer,Double> Output_HiddenLayer1_to_Output = new LinkedHashMap<>();
    
    
      /**
       * Stores the value of output of hidden layer neuron 1 in double format
       * @param OutputHiddenLayerN1 is the value of output in hidden layer neuron1 in double format
       * @param outputposition The value of position in the list in integer 
       * format
       */  
     public static void set_Output_I_to_HL1_N1(double OutputHiddenLayerN1 , int outputposition) {
        OutputList.OutputHiddenLayerN1=OutputHiddenLayerN1;
        OutputList.outputposition = outputposition;
        Output_Inputs_to_HiddenLayer1_N1.put(OutputList.outputposition , OutputList.OutputHiddenLayerN1);
    }
     
     /**
      * Stores the value of output of hidden layer neuron 2 in double format
      * @param OutputHiddenLayerN2 is the value of output in hidden layer neuron2 in double format
      * @param outputposition The value of position in the list in integer 
      * format
      */
     public static void set_Output_I_to_HL1_N2(double OutputHiddenLayerN2 , int outputposition) {
        OutputList.OutputHiddenLayerN2=OutputHiddenLayerN2;
        OutputList.outputposition = outputposition;
        Output_Inputs_to_HiddenLayer1_N2.put(OutputList.outputposition , OutputList.OutputHiddenLayerN2);
    }
     
     /**
      * Stores the value of output of hidden layer neuron 3 in double format
      * @param OutputHiddenLayerN3 is the value of output in hidden layer neuron3 in double format 
      * @param outputposition The value of position in the list in integer 
      * format
      */
     public static void set_Output_I_to_HL1_N3(double OutputHiddenLayerN3 , int outputposition) {
        OutputList.OutputHiddenLayerN3=OutputHiddenLayerN3;
        OutputList.outputposition = outputposition;
        Output_Inputs_to_HiddenLayer1_N3.put(OutputList.outputposition , OutputList.OutputHiddenLayerN3);
    }
     
     /**
      * Stores the value of output of hidden layer neuron 4 in double format
      * @param OutputHiddenLayerN4 is the value of output in hidden layer neuron4 in double format
      * @param outputposition The value of position in the list in integer 
      * format
      */
     public static void set_Output_I_to_HL1_N4(double OutputHiddenLayerN4 , int outputposition) {
        OutputList.OutputHiddenLayerN4=OutputHiddenLayerN4;
        OutputList.outputposition = outputposition;
        Output_Inputs_to_HiddenLayer1_N4.put(OutputList.outputposition , OutputList.OutputHiddenLayerN4);
    }
     
     /**
      * Stores the value of output of output layer in double format
      * @param SumOutput is the value of output in output layer in double format
      * @param outputposition The value of position in the list in integer 
      * format
      */
     public static void set_Output_HL_to_Output(double SumOutput , int outputposition) {
        OutputList.Activ_Output=SumOutput;
        OutputList.outputposition = outputposition;
        Output_HiddenLayer1_to_Output.put(OutputList.outputposition , OutputList.Activ_Output);
    }
     
     /**
      * 
      * @return List of outputs in neuron 1 of hidden layers in double format
      */
    public static Map<Integer,Double> get_Output_I_to_HL1_N1() {
        return OutputList.Output_Inputs_to_HiddenLayer1_N1;
    }
    
    /**
     * 
     * @return List of outputs in neuron 2 of hidden layers in double format
     */
    public static Map<Integer,Double> get_Output_I_to_HL1_N2() {
        return OutputList.Output_Inputs_to_HiddenLayer1_N2;
    }
    
    /**
     * 
     * @return List of outputs in neuron 3 of hidden layers in double format
     */
    public static Map<Integer,Double> get_Output_I_to_HL1_N3() {
        return OutputList.Output_Inputs_to_HiddenLayer1_N3;
    }
    
    /**
     * 
     * @return List of outputs in neuron 4 of hidden layers in double format
     */
    public static Map<Integer,Double> get_Output_I_to_HL1_N4() {
        return OutputList.Output_Inputs_to_HiddenLayer1_N4;
    }
    
    /**
     * 
     * @return List of outputs in output layers in double format
     */
    public static Map<Integer,Double> get_Output_HL_to_Output() {
        return OutputList.Output_HiddenLayer1_to_Output;
    }
    
}
