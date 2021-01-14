import java.util.Objects;

public class Fingal {
    public int glaz;
    public Fingal(int glaz) {
        this.glaz=glaz;
    }


public  class Punch {
        private String name;
        Punch(String name) {
            this.name=name;
        }

    public String getName() {
        return name;
    }
}
    public void fingal(String High) {
        Punch punch = new Punch("удар");
        if (glaz==1) {
            System.out.println(" Под глазом красовался "+ High);
        }
        if (glaz==0) {
            System.out.println(punch.getName()+" пришелся по другому глазу");
        }
        if (glaz==2) {
            System.out.println("нет синяков");
        }
    }

    @Override
    public String toString() {
        return "Fingal{" +
                "glaz=" + glaz +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fingal fingal = (Fingal) o;
        return glaz == fingal.glaz;
    }

    @Override
    public int hashCode() {
        return Objects.hash(glaz);
    }
}
