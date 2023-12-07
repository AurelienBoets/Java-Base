public class SalaryAdjuster implements EmployeeVisitor{
    @Override
    public void visit(Designer designer) {
        System.out.println("Ajustement du salaire du designer");
    }

    @Override
    public void visit(Developer developer) {
        System.out.println("Ajustement du salaire du développeur");
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("Ajustement du salaire du manager");
    }
}
