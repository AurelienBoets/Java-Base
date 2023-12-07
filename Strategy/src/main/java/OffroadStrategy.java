public class OffroadStrategy implements NavigationStrategy{
    @Override
    public void navigate(String destination) {
        System.out.println("Navigation hors-route vers "+destination);
    }
}
