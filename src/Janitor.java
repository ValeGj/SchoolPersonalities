public class Janitor extends Person implements WorkStatus,Salary{

    Janitor (String name){
        super(name);
    }

    /**
     * override of the getSalary method for the Salary interface
     * @return the salary for the janitor which is calculated by multiplying the janitorFactor with the basicSalary
     *
     * @author Valentina Gjorgjieska
     * @version 1.0
     * @since 2020-09-28
     */
    @Override
    public double getSalary() {
        return janitorFactor * basicSalary;
    }

    /**
     * override of the fire method for the WorkStatus interface
     * The fire() methode just prints the information that a janitor is fired on the standard output.
     *
     *  @author Valentina Gjorgjieska
     *  @version 1.0
     *  @since 2020-09-28
     */
    public void fire() {
        System.out.println("Janitor " + this.getName() + " got fired.");
    }
}

