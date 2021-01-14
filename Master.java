public class Master {
    private String name;
    public Master(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void input() {
        System.out.println(getName());
    }
}
