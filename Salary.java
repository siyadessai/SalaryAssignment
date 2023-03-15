package employeeSalary;
/**
 * 
 * @author Siya
 *
 */
public class Salary {
    
    private double basicSalary; 
    private double HRA; 
    private double DA;
    private double grossSalary; 
    private double incomeTax; 
    private double netSalary; 
   /**
    * 
    * @param basicSalary Calculation
    */
    public Salary(double basicSalary) {
        this.basicSalary = basicSalary;
        this.HRA = 0.1 * basicSalary;
        this.DA = 0.73 * basicSalary;
        this.grossSalary = basicSalary + HRA + DA;
        this.incomeTax = 0.3 * grossSalary;
        this.netSalary = grossSalary - incomeTax;
    }

   /**
    * 
    * @return basic salary
    */
    public double getBasicSalary() {
        return basicSalary;
    }

    /**
     * *
     * @param  setting basicSalary
     */
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
/**
 * 
 * @return House Rent Allowance
 */
    public double getHRA() {
        return HRA;
    }

   /**
    * *
    * @return Dearness Allowance
    */
    public double getDA() {
        return DA;
    }

    /**
     * *
     * @return Gross Salary
     */
    public double getGrossSalary() {
        return grossSalary;
    }

   /**
    * 
    * @return get Income Tax
    */
    public double getIncomeTax() {
        return incomeTax;
    }
/**
 * *
 * @return get Net salary
 */
    public double getNetSalary() {
        return netSalary;
    }
}