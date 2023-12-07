public class RoadStrategy implements NavigationStrategy{
    @Override
    public void navigate(String destination) {
        System.out.println("Navigation routière vers "+destination);
    }
}
