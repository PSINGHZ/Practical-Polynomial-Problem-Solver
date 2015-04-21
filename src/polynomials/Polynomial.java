
package polynomials;

import java.util.*;


public class Polynomial {
    
    ArrayList<Double> coefficients = new ArrayList<Double>();
    ArrayList<Integer> degrees = new ArrayList<Integer>();
    
    Scanner s = new Scanner(System.in);
    
    int degree;
    
    public Polynomial (int highestDegree) {
        
        degree = highestDegree;
        
        for (int i = highestDegree+1; i >= 0; i--) {
            System.out.println("Enter the coefficient for the x^" + i + " term: ");
            double newCo = s.nextDouble();
            
            coefficients.add(newCo);
            degrees.add(i);
        }        
    }
    
    public display() {
        
        for (int i = 0; i < degree ; i++) {
            
        
            double currentCoefficient = coefficients.get(i);
            int currentDegree = degrees.get(i);
            String print = "";
            
            if (currentDegree == 0) {
                if (currentCoefficient > 0) System.out.println("+ " + currentCoefficient);
                else if (currentCoefficient < 0) System.out.println(currentCoefficient);
            }
            
            else {
                if (currentCoefficient > 0) System.out.println("+ " + currentCoefficient);
                else if (currentCoefficient < 0) System.out.println(currentCoefficient);
            }


        }
    }
    
}
