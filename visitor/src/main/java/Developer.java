public class Developer extends Employee{
    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}
