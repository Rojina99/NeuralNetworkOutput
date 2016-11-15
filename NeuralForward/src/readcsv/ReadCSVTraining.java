/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readcsv;

import arraylist.ThisArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author User Used to read values from normalized csv file
 */
public class ReadCSVTraining {
    
    public  void ReadCSV() {
        String fileName = "PimaIndians-1to1Normalized(-1to1)training.csv";
        File fileinput = new File(fileName);//Read from File

        try {
            Scanner inputValue = new Scanner(fileinput);
            inputValue.next();//To skip first rows
            
            //ThisArrayList thislist = new ThisArrayList();//Creates object of class ThisArrayList to
                                                         //access list of individual columns

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
            
            double outputclass;
            
            double sum = 0;
            double no_of_prices = 0;

            /**
             * To get values from csv file
             */
//            ArrayList<Double> pregnants= new ArrayList<>();
//
//            ArrayList<Double> glucoselevel = new ArrayList<>();
//
//            ArrayList<Double> bloodpressure = new ArrayList<>();
//
//            ArrayList<Double> foldthickness = new ArrayList<>();
//
//            ArrayList<Double> seruminsulin = new ArrayList<>();
//
//            ArrayList<Double> bmis = new ArrayList<>();
//
//            ArrayList<Double> pedigreefunction = new ArrayList<>();
//
//            ArrayList<Double> ages = new ArrayList<>();
            int i = 0;
            
            /**
             * Reads values from input file in string format
             */
            while (inputValue.hasNext()) {
                
                String data = inputValue.next();//Used to check there exist next value or not
                
                String[] values = data.split(",");
                
                //System.out.println(data);//Firstly I just printed all data values

                
                /**
                 * To convert String values to double
                 */
                
                no_of_times_preg = Double.parseDouble(values[0]);
                ThisArrayList.setPregnancy_Times(no_of_times_preg , i);

                
                /*------To do Normalization Here------*/
                plasma_glucose_concentration = Double.parseDouble(values[1]);
                ThisArrayList.setGlucose_Concentration(plasma_glucose_concentration , i);
                
                
                blood_pressure = Double.parseDouble(values[2]);
                ThisArrayList.setBlood_Pressure(blood_pressure , i);
                
                
                skin_fold_thickness = Double.parseDouble(values[3]);
                ThisArrayList.setFold_thickness(skin_fold_thickness , i);
                
                
                two_hour_serum_insulin = Double.parseDouble(values[4]);
                ThisArrayList.setTwo_Hour_SerumInsulin(two_hour_serum_insulin , i);
                
                
                bmi = Double.parseDouble(values[5]);
                ThisArrayList.setBMI(bmi , i);
                
                
                diabetes_pedigree_function = Double.parseDouble(values[6]);
                ThisArrayList.setDiabetes_Pedigree(diabetes_pedigree_function , i);
                
                
                age = Double.parseDouble(values[7]);
                ThisArrayList.setAge(age , i);
                
                outputclass = Double.parseDouble(values[8]);
                
                
//                String outputclass1=values[8];
//                
//                if(outputclass1.contentEquals("tested_negative"))
//                {
//                    outputclass=-1.0;
//                }
//                else
//                {
//                    outputclass=1.0;
//                }
                ThisArrayList.setOutput_Class(outputclass , i);
                
                i++;
                
                }
            
//            List<Double> o=ThisArrayList.getOutput_Class();
//            for(Double d:o)
//            {
//                System.out.println(d);
//            }
                
//               List<Double> gc=ThisArrayList.getGlucose_Concentration();
//               
//               for(Double d:gc)
//               {
//                   System.out.println(d);
//               }
                //System.out.println(no_of_times_preg+","+plasma_glucose_concentration+","+blood_pressure+","+skin_fold_thickness+","+two_hour_serum_insulin+","+bmi+","+diabetes_pedigree_function+","+age);
               
                
                /*Double normal = Double.parseDouble(values[0]);
                sum+=normal;
                no_of_prices++;
                System.out.println(normal);*/ //I can print values[0] if I want to print in String format
            
//            SortArrayList st=new SortArrayList();
//            st.setSort_Age();
//            st.setSort_BMI();
//            st.setSort_Blood_Pressure();
//            st.setSort_Diabetes_Pedigree();
//            st.setSort_Glucose_Concentration();
//            st.setSort_Pregnancy_Times();
//            st.setSort_Fold_thickness();
//            st.setSort_Two_Hour_SerumInsulin();
            
            //System.out.println(ThisArrayList.max_age_value+","+ThisArrayList.min_age_value);
            
            //System.out.println(ThisArrayList.max_bmi_value+","+ThisArrayList.min_bmi_value);
           
            //System.out.println(ThisArrayList.max_pressure_value+","+ThisArrayList.min_pressure_value);
            
            //System.out.println(ThisArrayList.max_pedigree_value+","+ThisArrayList.min_pedigree_value);
            
            //System.out.println(ThisArrayList.max_glucose_value+","+ThisArrayList.min_glucose_value);
            
            //System.out.println(ThisArrayList.max_preg_value+","+ThisArrayList.min_preg_value);
            
            //System.out.println(ThisArrayList.max_foldthickness_value+","+ThisArrayList.min_foldthickness_value);
            
            //System.out.println(ThisArrayList.max_seruminsulin_value+","+ThisArrayList.min_seruminsulin_value);
            
//            NormalizeInput n=new NormalizeInput();
//            n.setNormalizeInput_Zero();
//            n.setNormalizeInput_One();
            
            //double average=sum/no_of_prices;
            
            inputValue.close();//Used to free OS for other programs to use the file
        } catch (FileNotFoundException f) {
            f.printStackTrace();
            
            
            
            
            
        }
        
        
    }
}
