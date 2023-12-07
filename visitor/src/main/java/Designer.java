public class Designer extends Employee{
    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}
