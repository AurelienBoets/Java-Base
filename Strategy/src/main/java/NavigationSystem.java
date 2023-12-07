public class NavigationSystem {
    private String destination;

    public NavigationSystem(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void navigate(NavigationStrategy navigationStrategy){
        navigationStrategy.navigate(destination);
    }
}
