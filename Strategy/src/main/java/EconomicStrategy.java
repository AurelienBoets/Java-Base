public class EconomicStrategy implements NavigationStrategy{
    @Override
    public void navigate(String destination) {
        System.out.println("Navigation économique vers "+destination);
    }
}
