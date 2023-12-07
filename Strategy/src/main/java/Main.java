public class Main {
    public static void main(String[] args) {
        NavigationSystem navigationSystem=new NavigationSystem("Lille");
        navigationSystem.navigate(new EconomicStrategy());
    }
}
