import jdk.dynalink.NamedOperation;

import java.util.Objects;

public class WorkKorotishka implements DodgeMan, Witness, Stand {
    public String name;
    private int eye;
    private int count;
    public Time time;
    private Boolean health;
    private Boolean state;
    public int dodgeSkill;
    public Mestoimenie mestoimenie;
    public WorkKorotishka(String name, int eye, Time time, Boolean health, Boolean state, int dodgeSkill, Mestoimenie mestoimenie) {
        this.mestoimenie=mestoimenie;
        this.eye=eye;
        this.name=name;
        this.time=time;
        this.health=health;
        this.dodgeSkill=dodgeSkill;
        count = Count.getCountWorkKorotishka();
    }
    public int getDodgeSkill() {return dodgeSkill;}
    public void checkName() throws NoNameException {
        if (getName()=="") {
            throw new NoNameException(" нет имени");
        }
    }
    public void setDodgeSkill(int dodgeSkill) {
        this.dodgeSkill=dodgeSkill;
    }
    public String getName() {
        return this.name;
    }
    public Time getTime() { return  this.time;}
    public int getEye() {
        return eye;
    }

    public void setEye(int eye) {
        this.eye = eye;
    }

    public void see () {
        if (this.eye > 0) {
            System.out.println(getName()+" видит мяч");
        }
        if (this.eye == 0) {
            System.out.println(getName()+" ничего не видит");
        }
    }
    public void dodge() {
        System.out.print(" успел увернуться ");
    }
    public void nododge() {
       System.out.println(getName()+" не успел увернуться");
    }
    public void stay() {
        System.out.print(getTime()+" "+getName()+" "+hp()+"и уже стоит на ");
    }
    public void cry(String cause ) {
        System.out.println(" заливаясь слезами от "+ cause);
    }
    public void run() {
        System.out.println(getName()+" убегает");
    }
    public void zenki() {
        Punch punch =new Punch(this.eye);
        punch.fingal("большой синяк");

    }

    public String hp() {
        if (health == true) {
            return " выздоровел ";
        } else {
            return" не выздоровел ";
        }
    }
    public void run(String place, String state) {
        System.out.println(getName()+" побежал"+" "+ state+ " "+ place);
    }
    public void grabHand(String place) {
        System.out.print("схватившись рукой за"+ place);
    }
    public void attention(Boolean chance) {
        if (chance == true) {
            System.out.print(getName() + " привык обращать внимание на ");
        } else {
            System.out.print(getName() + " привык не обращать внимание на ");
        }
    }
    public  void input() {
        System.out.println(" "+getName());
    }
    public void jump(String placeBefore, String placeAfter ) {
        System.out.print(getName()+placeBefore+" вскочил на " + placeAfter);

    }
    public void shout() {
        System.out.println(getName()+ " закричал");
    }

    public Mestoimenie getEnum() {
        return mestoimenie;
    }

    public void stuck(String thing, String place) {
        switch (mestoimenie) {
            case ОНИ:
                System.out.print(getEnum() + " просунул " + thing + " в "+ place);
                break;
            case ОНА:
                System.out.print(getEnum() +  " просунул " + thing+" в "+ place );
                break;
            case ОН:
                System.out.print(getEnum() +  " просунул " + thing+" в "+ place );
                break;
            case ОНО:
                System.out.print(getEnum() +  " просунул " + thing+" в "+ place );
                break;
            case ИМЯ:
                System.out.print(getName() +  " просунул " + thing+" в "+ place );
                break;
        }
    }
    @Override
    public String toString() {
        return "WorkKorotishka{" +
                "name='" + name + '\'' +
                ", eye=" + eye +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkKorotishka that = (WorkKorotishka) o;
        return eye == that.eye &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return (eye<<1)+(count<<2);
    }
}
