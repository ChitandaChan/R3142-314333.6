public class Room {
    private String name;
    Room(String name) {
        this.name=name;
    }
    public static class WaterDispenser {
        public  String name;
        WaterDispenser(String name) {
            this.name=name;
        }
        public  static class Hole{
            private String name;
            Hole(String name) {
                this.name=name;
            }

            public String getName() {
                return name;
            }
            public String Place(String place, String where) {
                return getName()+" "+place+" "+where;
            }
        }

        public String getName() {
            return name;
        }
    }
    public static class Bed {
        private String name;
        Bed(String name){
            this.name=name;
        }

        public String getName() {
            return name;
        }
    }
    public static class Door {
        private String name;
        Door(String name){
            this.name=name;
        }
        public  static class Handle{
            private String name;
            Handle(String name) {
                this.name=name;
            }

            public String getName() {
                return name;
            }
            public void protrude(String where) {
                System.out.print(" язычок высовываться из "+where);
            }
            public void demanded(String money, String service) {
                System.out.println( " требовал "+money+" за "+service);
            }
        public String service(String turn) {
                return turn;
        }
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void open(boolean open, String state) {
            if (open==true) {
                System.out.println(getName()+" "+state+" открыта ");
            } else {
                System.out.print(" "+getName()+" "+state+" закрыта ");
            }
        }
    }
    public String become(String word) {
        return getName()+" становится "+word;
    }

    public String getName() {
        return name;
    }

}
