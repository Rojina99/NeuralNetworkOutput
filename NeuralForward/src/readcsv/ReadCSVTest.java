/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readcsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ReadCSVTest {
        String fileName = "PimaIndians2.csv";
        File file = new File(fileName);//Read from File

        
            Scanner inputValue;

    public ReadCSVTest() throws FileNotFoundException {
        this.inputValue = new Scanner(file);
    
            inputValue.next();//To skip first rows
            
            /**
             * Initializing variables as double for normalizing them
             */
            double no_of_times_preg;
            
            double plasma_glucose_concentration;
            
            double blood_pressure;
            
            double skin_fold_thickness;
            
            double two_hour_serum_insulin;
            
            double bmi;
            
            double diabetes_pedigree_function;
            
            double age;
            
            
            double sum=0;
            double no_of_prices=0;
            
            /**
             * To get values from csv file
             */
            
            while (inputValue.hasNext()) {
                String data = inputValue.next();//Used to check there exist next value or not
                String[] values = data.split(",");
                //System.out.println(data);//Firstly I just printed all data values
                
                
                /**
                 * To convert String values to double
                 */
                no_of_times_preg=Double.parseDouble(values[0]);
                /*------To do Normalization Here------*/
                plasma_glucose_concentration=Double.parseDouble(values[1]);
                
                blood_pressure=Double.parseDouble(values[2]);
                
                skin_fold_thickness=Double.parseDouble(values[3]);
                
                two_hour_serum_insulin=Double.parseDouble(values[4]);
                
                bmi=Double.parseDouble(values[5]);
                
                diabetes_pedigree_function=Double.parseDouble(values[6]);
                
                age=Double.parseDouble(values[7]);     
                
                //System.out.println(no_of_times_preg+","+plasma_glucose_concentration+","+blood_pressure+","+skin_fold_thickness+","+two_hour_serum_insulin+","+bmi+","+diabetes_pedigree_function+","+age);
                        
                /*Double normal = Double.parseDouble(values[0]);
                sum+=normal;
                no_of_prices++;
                System.out.println(normal);*/ //I can print values[0] if I want to print in String format
            }
            
            //double average=sum/no_of_prices;
    
            inputValue.close();//Used to free OS for other programs to use the file
    }
    
}
