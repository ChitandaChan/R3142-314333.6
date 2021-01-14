public class Money {
    private String place;
    public String name;

    public Money(String Place, String Name) {
        this.place = Place;
        this.name = Name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public String getName() {
        return name;
    }

    public void up() {
        System.out.println(" можно попытаться подзаработать " + getPlace());
    }

    public void down() {
        System.out.println(" можно попытаться потратить" + getPlace());
    }

    public void earn() {
        System.out.println("сможет заработать " + getName());
    }
    public void act(String definition) {
        System.out.println(getName()+" произвел "+definition+" действие");
    }
    public void save() {
        System.out.println(" чтобы сохранить "+getName());
    }
}