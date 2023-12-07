public class PerformanceEvaluator implements EmployeeVisitor{
    @Override
    public void visit(Designer designer) {
        System.out.println("Evaluation des performances du designer");
    }

    @Override
    public void visit(Developer developer) {
        System.out.println("Evaluation des performances du développeur");
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("Evaluation des performances du manager");
    }
}
