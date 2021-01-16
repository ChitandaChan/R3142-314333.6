import java.util.Objects;

public class Punch {
    public int glaz;
    public Punch(int glaz) {
        this.glaz=glaz;
    }


        class Fingal {
        private String name;
        Fingal(String name) {
            this.name=name;
        }

    public String getName() {
        return name;
    }
}
    public void fingal(String High) {
        Fingal fingal = new Fingal("удар");
        if (glaz==1) {
            System.out.println(" Под глазом красовался "+ High);
        }
        if (glaz==0) {
            System.out.println(fingal.getName()+" пришелся по другому глазу");
        }
        if (glaz==2) {
            System.out.println("нет синяков");
        }
    }


}
