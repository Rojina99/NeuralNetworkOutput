/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightmatrix;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author User Used to store values of weight matrix
 */
public class WeightMatrixList implements Serializable{
    
    /**
     * The incoming weights values from previous layers to stated layer 
     */
    private static double HiddenLayerN1;
    private static double HiddenLayerN2;
    private static double HiddenLayerN3;
    private static double HiddenLayerN4;
    private static double Output;
    
    /**
     * The variable used to accommodate position in the list
     * in integer format
     */
    private static int inputweightposition;
    
    /*
    List for weight matrix incoming in each neuron 
    */
    
    private static Map<Integer,Double> Inputs_to_HiddenLayer1_N1= new LinkedHashMap<>();

    private static Map<Integer,Double> Inputs_to_HiddenLayer1_N2 = new LinkedHashMap<>();

    private static Map<Integer,Double> Inputs_to_HiddenLayer1_N3 = new LinkedHashMap<>();
    
    private static Map<Integer,Double> Inputs_to_HiddenLayer1_N4 = new LinkedHashMap<>();
    
    private static Map<Integer,Double> HiddenLayer1_to_Output = new LinkedHashMap<>();
    
    
     /**
     * Add input to hidden layer neuron1 weights to the list
     * @param HiddenLayerN1 Is the value incoming from input to hidden layer neuron 1 value in double format
     * @param i Value of position incoming to linked list in integer format  
     */
    public static void setI_to_HL1_N1(double HiddenLayerN1,int i) {
        WeightMatrixList.HiddenLayerN1=HiddenLayerN1;
        WeightMatrixList.inputweightposition = i;
        Inputs_to_HiddenLayer1_N1.put( WeightMatrixList.inputweightposition , WeightMatrixList.HiddenLayerN1);
    }
    
     /**
     * Add input to hidden layer neuron2 weights to the list
     * @param HiddenLayerN2 Is the value incoming from input to hidden layer neuron 2 value in double format
     * @param i Value of position incoming to linked list in integer format
     */
    public static void setI_to_HL1_N2(double HiddenLayerN2,int i) {
         WeightMatrixList.HiddenLayerN2=HiddenLayerN2;
         WeightMatrixList.inputweightposition = i;
        Inputs_to_HiddenLayer1_N2.put( WeightMatrixList.inputweightposition , WeightMatrixList.HiddenLayerN2);
    }
    
     /**
     * Add input to hidden layer neuron3 weights to the list
     * @param HiddenLayerN3 Is the value incoming from input to hidden layer neuron 3 value in double format
     * @param i Value of position incoming to linked list in integer format
     */
    public static void setI_to_HL1_N3(double HiddenLayerN3, int i) {
         WeightMatrixList.HiddenLayerN3=HiddenLayerN3;
         WeightMatrixList.inputweightposition = i;
        Inputs_to_HiddenLayer1_N3.put( WeightMatrixList.inputweightposition , WeightMatrixList.HiddenLayerN3);
    }
    
     /**
     * Add input to hidden layer neuron4 weights to the list
     * @param HiddenLayerN4 Is the value incoming from input to hidden layer neuron 4 value in double format
     * @param i Value of position incoming to linked list in integer format
     */
    public static void setI_to_HL1_N4(double HiddenLayerN4,int i) {
         WeightMatrixList.HiddenLayerN4=HiddenLayerN4;
         WeightMatrixList.inputweightposition = i;
        Inputs_to_HiddenLayer1_N4.put( WeightMatrixList.inputweightposition , WeightMatrixList.HiddenLayerN4);
    }
    
      /**
     * Add  hidden layer to output weights to the list
     * @param Output Is the value incoming from  hidden layer  to output  in double format
     * @param i Value of position incoming to linked list in integer format
     */
    public static void setHL_to_Output(double Output,int i) {
         WeightMatrixList.Output=Output;
         WeightMatrixList.inputweightposition = i;
        HiddenLayer1_to_Output.put( WeightMatrixList.inputweightposition , WeightMatrixList.Output);
    }
    
    
     /**
     * 
     * @return list of input to hidden layer neuron 1 value in double format
     */

    public static Map<Integer,Double> getI_to_HL1_N1() {
        return WeightMatrixList.Inputs_to_HiddenLayer1_N1;
    }
    
    /**
     * 
     * @return list of input to hidden layer neuron 2 value in double format
     */

    public static Map<Integer,Double> getI_to_HL1_N2() {
        return WeightMatrixList.Inputs_to_HiddenLayer1_N2;
    }
    
    /**
     * 
     * @return list of input to hidden layer neuron 3 value in double format
     */

    public static Map<Integer,Double> getI_to_HL1_N3() {
        return WeightMatrixList.Inputs_to_HiddenLayer1_N3;
    }
    
    /**
     * 
     * @return list of input to hidden layer neuron 4 value in double format
     */

    public static Map<Integer,Double> getI_to_HL1_N4() {
        return WeightMatrixList.Inputs_to_HiddenLayer1_N4;
    }
    
    /**
     * 
     * @return list of  hidden layer neurons to output value in double format
     */

    public static Map<Integer,Double> getHL_to_Output() {
        return WeightMatrixList.HiddenLayer1_to_Output;
    }
}
