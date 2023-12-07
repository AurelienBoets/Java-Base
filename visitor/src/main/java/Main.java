public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager();
        Developer developer=new Developer();
        Designer designer=new Designer();
        designer.accept(new PerformanceEvaluator());
        developer.accept(new PerformanceEvaluator());
        manager.accept(new PerformanceEvaluator());
        designer.accept(new SalaryAdjuster());
        developer.accept(new SalaryAdjuster());
        manager.accept(new SalaryAdjuster());
    }
}
