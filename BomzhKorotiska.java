import java.util.Objects;

public class BomzhKorotiska implements Witness, Stand {
    private String name;
    private int eye;
    private Mestoimenie sos;
    private  int count;

    public BomzhKorotiska(String name, int eye, Mestoimenie sos) {
    this.sos=sos;
    this.eye=eye;
    this.name=name;
    count =  Count.getBomszKorotishkacount();
}
    public String getName() {
    return this.name;
    }
    public void checkName() throws NoNameException {
        if (getName()=="") {
            throw new NoNameException(" нет имени");
        }
    }
    public void setSos(Mestoimenie sos) {
        this.sos = sos;
    }

    public Mestoimenie getSos() {
        return sos;
    }

    public Mestoimenie getEnum() {
    return sos;
}
    public void search(String sost) {
        switch (sos) {
            case ОНИ:
                System.out.print(sost+ " "+ getEnum() + " отпраились искать ");
                break;
            case ОНА:
                System.out.println(sost+ " "+ getEnum() + " отпраилась искать  ");
                break;
            case ОН:
                System.out.println(sost+ " "+ getEnum() + " отпраился искать  ");
                break;
            case ОНО:
                System.out.println(sost+ " "+ getEnum() + " отпраилось искать  ");
                break;
            case ИМЯ:
                System.out.println(sost+ " "+ getName() + " отпраился искать  ");
                break;
        }
    }
        public void Go () {
            switch (sos) {
                case ОНИ:
                    System.out.println(getEnum() + " явились");
                    break;
                case ОНА:
                    System.out.println(getEnum() + " идет сегодня работу");
                    break;
                case ОН:
                    System.out.println(getEnum() + " идет сегодня работу");
                    break;
                case ОНО:
                    System.out.println(getEnum() + " идет сегодня работу");
                    break;
                case ИМЯ:
                    System.out.println(getName() + " идет сегодня работу");
                    break;
            }
        }
        public void see () {
            if (this.eye > 0) {
                switch (sos) {
                    case ОНИ:
                        System.out.print(getEnum() + " видят ");
                        break;
                    case ОНА:
                        System.out.println(getEnum() + " видит");
                        break;
                    case ОН:
                        System.out.println(getEnum() + " видит");
                        break;
                    case ОНО:
                        System.out.println(getEnum() + " видит");
                        break;
                    case ИМЯ:
                        System.out.println(getName() + " видит");
                        break;
                }
            }
            if (this.eye == 0) {
                System.out.println("Ничего не вижу");
            }
        }
    public void Say() {
        switch (sos) {
            case ОНИ:
                System.out.print(getEnum() + "говорят: это ничего,");
                break;
            case ОНА:
                System.out.print(getEnum() + " говорит: это ничего, ");
                break;
            case ОН:
                System.out.print(getEnum() + " говорит: это ничего, ");
                break;
            case ОНО:
                System.out.print(getEnum() + " говорит: это ничего, ");
                break;
            case ИМЯ:
                System.out.print(getName() + " говорит: это ничего, ");
                break;
        }
    }
    public void stay() {
        switch (sos) {
            case ОНИ:
                System.out.print(getEnum() + " явились на");
                break;
            case ОНА:
                System.out.println(getEnum() + " явилась");
                break;
            case ОН:
                System.out.print(getEnum() + " явился");
                break;
            case ОНО:
                System.out.println(getEnum() + " явилось");
                break;
            case ИМЯ:
                System.out.println(getName() + " явился");
                break;
        }
    }
    public void getEnum1() {
        switch(sos) {
            case ОНИ:
                System.out.print( "ОНИ");
        }
    }
    public  void smile() {
        switch (sos) {
            case ОНИ:
                getEnum1();
                System.out.print(" обрадовались, ");
                break;
            case ОНА:
                System.out.print(getEnum() + " обрадовалась, ");
                break;
            case ОН:
                System.out.print(getEnum() + " обрадовался, ");
                break;
            case ОНО:
                System.out.print(getEnum() + " обрадовался, ");
                break;
            case ИМЯ:
                System.out.print(getName() + " обрадовался, ");
                break;
        }

    }
    public  void payment(Boolean fidelity) {
        if (fidelity==true) {
            System.out.println(" рассчеты "+getName()+" оказались верными");
        } else {
            System.out.println(" рассчеты "+getName()+" оказались неверными");
        }
    }
    public  void sad() {
        System.out.print(getName()+ " было жалко ");
    }
    public  void keep(Boolean speed, String act) {
        String treason = new String("");
        if (speed == false) {
            treason=" не ";
        } else {
            treason="";
        }
        switch (sos) {
            case ОНИ:
                System.out.print(getEnum()+ treason + " успели "+act);
                break;
            case ОНА:
                System.out.print(getEnum()+ treason + " успела "+act);
                break;
            case ОН:
                System.out.print(getEnum()+ treason + " успел "+act);
                break;
            case ОНО:
                System.out.print(getEnum()+ treason + " успело "+act);
                break;
            case ИМЯ:
                System.out.print(getName()+ treason + " успел "+act);
                break;
        }


    }
    public void pull(String time, boolean success, String object) {
           if (success==true) {
               System.out.print(time+" дергал "+getName()+" за "+object);
           } else {
               System.out.print(time+" ни дергал "+getName()+" за "+object+" ");
           }
    }
    public void climb(String where, String target) {
        System.out.println(getName()+" полез в "+where+" за "+target);
    }
    public void make(String object, boolean success) {
        if (success==true) {
            System.out.print(object +" делаешь ");
        } else {
            System.out.print(object +" не поделаешь ");
        }
    }
    @Override
    public String toString() {
        return "BomzhKorotiska{" +
                "name='" + name + '\'' +
                ", eye=" + eye +
                ", sos=" + sos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BomzhKorotiska that = (BomzhKorotiska) o;
        return eye == that.eye &&
                count == that.count &&
                Objects.equals(name, that.name) &&
                sos == that.sos;
    }

    @Override
    public int hashCode() {
        return (eye<<1)+(count<<2);
    }
}
