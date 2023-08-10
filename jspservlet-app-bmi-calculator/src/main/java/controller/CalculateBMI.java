package controller;
import java.text.DecimalFormat;
public class CalculateBMI {

	public static double calculate(double height, double weight)
	{
	DecimalFormat df=new DecimalFormat("0.00");
	 double bmi = weight / (height * height);
	 bmi=Double.parseDouble(df.format(bmi*10000));
	 return bmi;
   }
 
   public static String description(double bmi)
	{
	 if (bmi < 18.5) 
	 {
	   return "Under Weight";
	 } 
	 else if (bmi >= 18.5 && bmi < 24.9)
	{
	   return "Normal";
	 } 
	 else if (bmi >= 25 && bmi < 29.9)
	  {
	   return "Over Weight";
	 }
	  else if (bmi >= 30 && bmi < 34.9) 
	  {
	   return "Obese";
	 }
	  else
	   {
	   return "Extremely Obese";
	 }
   }
}