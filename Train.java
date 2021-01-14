public class Train {
    private  String name;
    Train(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public  String arrive(boolean ast, boolean go) throws MemoryExeption {
        if ((go==true)&(ast==false)) {
            Bandit Migo = new Bandit() {
                @Override
                public String go() {
                    return "Миго появится ";
                }
            };
            Bandit Zhulio = new Bandit() {
                @Override
                public String go() {
                    return "Жулио появится ";
                }
            };
            return Migo.go() + Zhulio.go() + " к приходу "+getName()+" ";
        }
        if ((go==false)&(ast==true)){
            Bandit Migo = new Bandit() {
                @Override
                public String go() {
                    return"Миго не появился ";
                }
            };
            Bandit Zhulio = new Bandit() {
                @Override
                public String go() {
                    return"Жулио не появился ";
                }
            };
            return getName()+" пришел "+Migo.go()+Zhulio.go()+" ";
        } else {
            return "";
        }
    }
    public  void input(String gg) {
        System.out.print(gg);
    }
}
