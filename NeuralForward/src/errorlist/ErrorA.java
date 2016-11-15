/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorlist;

import arraylist.ThisArrayList;
import org.decimal4j.util.DoubleRounder;
import outputlist.OutputList;


/**
 * 
 * @author User Used to calulate error deviated from actual values in computed 
 * output
 */
public class ErrorA {

    public double errA() {
        /**
         * Reading input to tally it with corresponding output
         */
//        ReadCSVTraining readcsv = new ReadCSVTraining();
//        readcsv.ReadCSV();
        double A = 0;   
    
        for (int i = 0; i < OutputList.get_Output_HL_to_Output().size(); i++) {

              double ActualOutput = OutputList.get_Output_HL_to_Output().get(i);
//            double ExpectedOutput = 1.0 ;
//            double Error = DoubleRounder.round(ExpectedOutput - ActualOutput,5);
//            double absError = Math.abs(Error);
//            ErrorList.set_Error_Output(Error , i);
//            ErrorList.set_abs_Error_Output(absError, i);
            
            System.out.println(i+"\tActualOutput"+ActualOutput/*+"\t Expected Output"+ExpectedOutput*/);
            A = ActualOutput; 
        }
        return A;
    }
}
