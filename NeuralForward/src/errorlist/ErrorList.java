/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorlist;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author User Store the list of error generated in computed output
 */
public class ErrorList {
    /**
     * Variable to accommodate errors
     */
    private static double erroroutput;
    private static double abserroroutput;
    
    /**
     * The variable used to accommodate position in the list
     * in integer format
     */
    private static int errorposition;
    
    /**
     * List to store errors
     */
    private static Map<Integer,Double> errorlists=new LinkedHashMap<>();
    private static Map<Integer,Double> abserrorlists=new LinkedHashMap<>();
    
    /**
     * Used to store error value in double format
     * @param erroroutput Is the value of error in double format
     * @param errorposition The value of position of list in integer format 
     */
     public static void set_Error_Output(double erroroutput , int errorposition) {
        ErrorList.erroroutput=erroroutput;
        ErrorList.errorposition = errorposition;
        errorlists.put(ErrorList.errorposition , ErrorList.erroroutput);
    }
     
     /**
      * 
      * @return Returns list of error in double format
      */
     public static Map<Integer,Double> get_Error_Output() {
        return ErrorList.errorlists;
    }
     
     /**
     * Used to store error value in double format
     * @param erroroutput Is the value of absolute error in double format
     * @param errorposition The value of position of list in integer format 
     */
     public static void set_abs_Error_Output(double erroroutput , int errorposition) {
        ErrorList.abserroroutput=erroroutput;
        ErrorList.errorposition = errorposition;
        abserrorlists.put(ErrorList.errorposition , ErrorList.abserroroutput);
    }
     
     /**
      * 
      * @return Returns list of absolute error in double format
      */
     public static Map<Integer,Double> get_abs_Error_Output() {
        return ErrorList.abserrorlists;
    }
}
