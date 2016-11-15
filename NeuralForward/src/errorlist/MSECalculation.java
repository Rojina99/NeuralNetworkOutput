/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorlist;

import org.decimal4j.util.DoubleRounder;

/**
 *
 * @author User Used to calculate mean squared error
 */
public class MSECalculation {
    
    /**
     * Variable to accommodate mean squared error
     */
    public static double squarederror = 0;
    
    public void MSECalc()
    {
        double i=0;
        
        double squarederrorsum=0;
        
        /**
         * Looping through all error values to calculate mean squared error
         */
        for(double d:ErrorList.get_Error_Output().values())
        {
          squarederrorsum=DoubleRounder.round(squarederrorsum+d*d,7);
          i++;
        } 
//        System.out.println(i);
        MSECalculation.squarederror=DoubleRounder.round(squarederrorsum/i,7);
//        System.out.println(MSECalculation.squarederror);
    }
}
