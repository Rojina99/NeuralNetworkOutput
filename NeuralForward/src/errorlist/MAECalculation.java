/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorlist;

import org.decimal4j.util.DoubleRounder;

/**
 *
 * @author User
 */
public class MAECalculation {
     /**
     * Variable to accommodate mean absolute error
     */
    public static double absoluteerror = 0;
    
    public void MAECalc()
    {
        double i=0;
        
        double absoluteerrorsum=0;
        
        /**
         * Looping through all error values to calculate mean squared error
         */
        for(double d:ErrorList.get_abs_Error_Output().values())
        {
          absoluteerrorsum=DoubleRounder.round(absoluteerrorsum+d,7);
          i++;
        } 
//        System.out.println(i);
        MAECalculation.absoluteerror=DoubleRounder.round(absoluteerrorsum/i,7);
//        System.out.println(MSECalculation.squarederror);
    }
}
