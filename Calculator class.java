/*Name- Raj Gupta
 * PRN-21070126068
 * AIML B1
 * Calculator class
 */
import java.math.*;
public class Calculator {
    double[] result =new double[1]; // 1  gives size of array
    double[] result_array=new double[7]; // This will give us results
    public double[]  performAdditionoperation(double[] numbers)
    
    {   
        result[0]=numbers[0]+numbers[1];
        
       
       return result;  // result is given in array form
    }
    public double[] performSubtractionoperation(double[] numbers)
    {   
        result[0]=numbers[0]-numbers[1];
        
       
        
        return result;
    }
    public double[] performMultiplicationoperation(double [] numbers )
    {   
        result[0]=numbers[0]*numbers[1];
        
       
        
        return result;

    }
    public double[] performDivisionoperation(double [] numbers){
        
            result[0]=numbers[0]/numbers[1];
            
           

    
    
    return result;
    }
    public double[] performArrayoperation(double []numbers){
        int size=numbers.length;
        result_array[0]=0; //   addition operation
        result_array[2]=1; //   multiplication operation
        for (int i=0;i<size;i++)
        { result_array[0]=result_array[0]+numbers[i];
          result_array[2]=result_array[2]*numbers[i];

        };
        result_array[1]=numbers[0]; //subtraction operation
        result_array[3]=numbers[0]; // for division operation
        for (int i=1;i<size;i++)
        {
            result_array[1]=result_array[1]-numbers[i];
            result_array[3]=result_array[3]/numbers[i];


        };
        result_array[4]=result_array[0]/size; //sum/size=mean 
        double sqdiff=0;
        for (int i=0;i<size;i++)
        {
            
            sqdiff=sqdiff+((numbers[i]-result_array[4])*(numbers[i]-result_array[4]));// calculation

        };
        result_array[5]=sqdiff/size; /size=variance
        result_array[6]=Math.sqrt(result_array[5]); //Standard Deviation 

        return result_array;
        

        
             
    }
    
}