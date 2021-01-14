public class Wind {
    private String name;
    Wind(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void buzz(String definition) {
        System.out.println(definition+" гудение");
    }
    public void beganToEnter(String of, String heat) {
        System.out.println(" из "+of+" начал поступать "+heat+" "+getName());
    }
}
