/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumlist;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author User Used to store sum values of weight matrices in each layer
 */
public class SumList {
    /**
     * Variables to store sum values
     */
    private static double SumHiddenLayerN1;
    private static double SumHiddenLayerN2;
    private static double SumHiddenLayerN3;
    private static double SumHiddenLayerN4;
    private static double SumOutput;
    
    /**
     * The variable used to accommodate position in the list
     * in integer format
     */
    private static int sumposition; 
    
    /**
     * List where sum is stored
     */  
    private static Map<Integer,Double> Sum_Inputs_to_HiddenLayer1_N1= new LinkedHashMap<>();

    private static Map<Integer,Double> Sum_Inputs_to_HiddenLayer1_N2 = new LinkedHashMap<>();

    private static Map<Integer,Double> Sum_Inputs_to_HiddenLayer1_N3 = new LinkedHashMap<>();
    
    private static Map<Integer,Double> Sum_Inputs_to_HiddenLayer1_N4 = new LinkedHashMap<>();
    
    private static Map<Integer,Double> Sum_HiddenLayer1_to_Output = new LinkedHashMap<>();
    
    
    /**
     * Used to store sum value from input to hidden neuron1
     * @param SumHiddenLayerN1 Is the incoming sum for hidden neuron1 in double
     * @param sumposition The position of incoming input in Map in integer 
     * format
     */
     public static void set_sum_I_to_HL1_N1(double SumHiddenLayerN1 , int sumposition) {
        SumList.SumHiddenLayerN1=SumHiddenLayerN1;
        SumList.sumposition = sumposition;
        Sum_Inputs_to_HiddenLayer1_N1.put(SumList.sumposition , SumList.SumHiddenLayerN1);
    }
     
     /**
      * Used to store sum value from input to hidden neuron2
      * @param SumHiddenLayerN2 Is the incoming sum for hidden neuron2 in double
      * @param sumposition The position of incoming input in Map in integer 
      * format
      */
     
     public static void set_sum_I_to_HL1_N2(double SumHiddenLayerN2, int sumposition) {
        SumList.SumHiddenLayerN2=SumHiddenLayerN2;
        SumList.sumposition = sumposition;
        Sum_Inputs_to_HiddenLayer1_N2.put(SumList.sumposition , SumList.SumHiddenLayerN2);
    }
     
     /**
      * Used to store sum value from input to hidden neuron3
      * @param SumHiddenLayerN3 Is the incoming sum for hidden neuron3 in double
      * @param sumposition The position of incoming input in Map in integer 
      * format
      */
     public static void set_sum_I_to_HL1_N3(double SumHiddenLayerN3, int sumposition) {
        SumList.SumHiddenLayerN3=SumHiddenLayerN3;
        SumList.sumposition = sumposition;
        Sum_Inputs_to_HiddenLayer1_N3.put(SumList.sumposition , SumList.SumHiddenLayerN3);
    }
     
     /**
      * Used to store sum value from input to hidden neuron4
      * @param SumHiddenLayerN4 Is the incoming sum for hidden neuron4 in double
      * @param sumposition The position of incoming input in Map in integer 
      * format
      */
     public static void set_sum_I_to_HL1_N4(double SumHiddenLayerN4, int sumposition) {
        SumList.SumHiddenLayerN4=SumHiddenLayerN4;
        SumList.sumposition = sumposition;
        Sum_Inputs_to_HiddenLayer1_N4.put(SumList.sumposition , SumList.SumHiddenLayerN4);
    }
     
     
     /**
      * Used to store sum value from hidden neuron4 to output
      * @param SumOutput Is the incoming sum for output in double
      * @param sumposition The position of incoming input in Map in integer 
      * format
      */
     public static void set_sum_HL_to_Output(double SumOutput, int sumposition) {
        SumList.SumOutput=SumOutput;
        SumList.sumposition = sumposition;
        Sum_HiddenLayer1_to_Output.put(SumList.sumposition , SumList.SumOutput);
    }
     
     /**
      * 
      * @return Returns List of sums in Neuron1 of hidden layer in double
      */
    public static Map<Integer,Double> get_sum_I_to_HL1_N1() {
        return SumList.Sum_Inputs_to_HiddenLayer1_N1;
    }
    
    /**
     * 
     * @return Returns List of sums in Neuron2 of hidden layer in double
     */
    public static Map<Integer,Double> get_sum_I_to_HL1_N2() {
        return SumList.Sum_Inputs_to_HiddenLayer1_N2;
    }
    
    /**
     * 
     * @return Returns List of sums in Neuron3 of hidden layer in double
     */
    public static Map<Integer,Double> get_sum_I_to_HL1_N3() {
        return SumList.Sum_Inputs_to_HiddenLayer1_N3;
    }
    
    /**
     * 
     * @return Returns List of sums in Neuron4 of hidden layer in double
     */
    public static Map<Integer,Double> get_sum_I_to_HL1_N4() {
        return SumList.Sum_Inputs_to_HiddenLayer1_N4;
    }
    
    /**
     * 
     * @return Returns List of sums in Output of hidden layer in double
     */
    public static Map<Integer,Double> get_sum_HL_to_Output() {
        return SumList.Sum_HiddenLayer1_to_Output;
    }
  
}
