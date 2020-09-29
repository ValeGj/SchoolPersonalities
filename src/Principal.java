public class Principal extends Person implements WorkAssign,Salary {

    Principal(String name) {
        super(name);
    }

    /**
     * override of the getSalary method for the Salary interface
     * @return the salary for the principle which is calculated by multiplying the principleFactor with the
     * teacherFactor adding one and multiplying it with the basicSalary
     *
     * @author Valentina Gjorgjieska
     * @version 1.0
     * @since 2020-09-28
     */
    @Override
    public double getSalary() {
        return (principleFactor * teacherFactor + 1) * basicSalary;
    }


    /**
     * override of the assignToSubject method for the WorkAssign interface
     * The assignToSubject() methode just prints the information that a subject is assigned to the
     * principle on the standard output.
     *
     *  @author Valentina Gjorgjieska
     *  @version 1.0
     *  @since 2020-09-28
     */
    @Override
    public void assignToSubject() {
        System.out.println("Subject assigned to the principle " + this.getName());
    }
}
