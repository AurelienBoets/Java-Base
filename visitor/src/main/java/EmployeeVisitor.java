public interface EmployeeVisitor {
    public void visit(Designer designer);
    public void visit(Developer developer);
    public void visit(Manager manager);
}
