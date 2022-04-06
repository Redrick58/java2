package gradleproject1;
import java.util.*;

public class RecIntegral {

        private String lowerIntegral;
        private String upperIntegral;
        private String integralStep;
        private String integralResult;
        
        public RecIntegral(String lowerIntegral, String upperIntegral,String integralStep){
                this.lowerIntegral = lowerIntegral;
                this.upperIntegral = upperIntegral;
                this.integralStep = integralStep;
                this.integralResult = "0";
        }
    
        public RecIntegral(String lowerIntegral, String upperIntegral,String integralStep,String integralResult){
                this.lowerIntegral = lowerIntegral;
                this.upperIntegral = upperIntegral;
                this.integralStep = integralStep;
                this.integralResult = integralResult;
        }
    
        public void setResult(String integralResult){
            this.integralResult = integralResult;
        }
        
        public String getLowerIntegral(){
            return this.lowerIntegral;
        }
        
        public String getUpperIntegral(){
            return this.upperIntegral;
        }
        
        public String getIntegralStep(){
            return this.integralStep;
        }
        
        public String getIntegralResult(){
            return this.integralResult;
        }
        
        public double calculateIntegral(){
            
            double l = Double.valueOf(this.lowerIntegral);
            double h = Double.valueOf(this.upperIntegral);
            double s = Double.valueOf(this.integralStep);
            double n = (h-l)/s;
            double result = 0;
            
            for(int i=1; i<n-1; i++){
                double index = l+i*s;
                result += (Math.sin(Math.pow(index, 2)));
            }
            
            result += (Math.sin(Math.pow(l, 2)) + Math.sin(Math.pow(h, 2)))/2;
            result = s*result;
            this.integralResult = Double.toString(result);
            return result;
        }
           
}
