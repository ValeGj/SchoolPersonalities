public class Teacher extends Person implements WorkAssign,WorkStatus,Salary{

    Teacher(String name) {
        super(name);
    }

    /**
     * override of the getSalary method for the Salary interface
     * @return the salary for the teacher which is calculated by multiplying the teacherFactor with the basicSalary
     *
     * @author Valentina Gjorgjieska
     * @version 1.0
     * @since 2020-09-28
     */
    @Override
    public double getSalary() {
        return teacherFactor * basicSalary;
    }

    /**
     * override of the assignToSubject method for the WorkAssign interface
     * The assignToSubject() methode just prints the information that a subject is assigned to the
     * teacher on the standard output.
     *
     *  @author Valentina Gjorgjieska
     *  @version 1.0
     *  @since 2020-09-28
     */
    @Override
    public void assignToSubject() {
        System.out.println("Subject assigned to the teacher " + this.getName());
    }

    /**
     * override of the fire method for the WorkStatus interface
     * The fire() methode just prints the information that a teacher is fired on the standard output.
     *
     *  @author Valentina Gjorgjieska
     *  @version 1.0
     *  @since 2020-09-28
     */
    @Override
    public void fire(){
        System.out.println("Teacher " + this.getName() + " got fired.");
    }
}
