public class Main {
    public static void main(String[] args) throws NoNameException {
        BomzhKorotiska Neznayka= new BomzhKorotiska("Незнайка", 2, Mestoimenie.ИМЯ);
        try {Neznayka.checkName();} catch (NoNameException noName) {System.err.println("ERROR"+noName.getMessage());}
        BomzhKorotiska Kozlik= new BomzhKorotiska("Козлик", 2, Mestoimenie.ИМЯ);
        try {Kozlik.checkName();} catch (NoNameException noName) {System.err.println("ERROR"+noName.getMessage());}
        Balagan balagan= new Balagan ("Закрыт", "Веселый балаган");
        WorkKorotishka Korotishka= new WorkKorotishka("Коротышка", 1, Time.Вчерашний, true, true, 0, Mestoimenie.ИМЯ);
        try {Korotishka.checkName();} catch (NoNameException noName) {System.err.println("ERROR"+noName.getMessage());}
        BallFlyMan NN= new BallFlyMan("Кто-то", 9);
        try {NN.checkName();} catch (NoNameException noName) {System.err.println("ERROR"+noName.getMessage());}
        Train train = new Train("поезд");
        Ball ball= new Ball(1);
        Wind wind= new Wind("воздух");
        Master master =new Master("хозяин");
        Problem problem = new Problem(false);
        Mesto mesto = new Mesto("улица, где стояло знакомое увеселительное здание");
        Money money = new Money("там", "сантик");
        Search search= new Search("их поиски", "не увенчались упехом");
        Day day = new Day("в этот День");
        Arbeit work = new Arbeit("работа");
        Room room=new Room("комната");
        Hope hope = new Hope();
        Let let= new Let();
        Friends friends = new Friends(Neznayka.getName(), Korotishka.getName());
        Room.WaterDispenser waterDispenser = new Room.WaterDispenser("рукомойник");
        Room.WaterDispenser.Hole hole = new Room.WaterDispenser.Hole("отверстие");
        Room.Bed beds =new Room.Bed("кровати");
        Room.Door door = new Room.Door("препятствие");
        Room.Door.Handle handle =new Room.Door.Handle("ручка");
        Neznayka.setSos(Mestoimenie.ОНИ);
        money.act("магическое");
        friends.hear();
        wind.buzz("приглушенное");
        wind.beganToEnter(hole.Place("имевшегося под", waterDispenser.getName()), "теплый");
        friends.feel(room.become("тепло "));
        friends.climb(beds.getName());
        friends.sleep("пригревшись");
        friends.standUp(Mestoimenie.ОНИ, "ранехонько","Утром");
        friends.run("поскорее");
        money.setName("остатки монеток");
        money.save();
        let.arose(door.getName(),Mestoimenie.ОНИ);
        door.setName("дверь шкафа");
        door.open(false, "наглухо");
        friends.leave(" там ", "свои шляпы");
        Kozlik.pull("Сколько", false, "ручка");
        handle.protrude(door.getName());
        money.setName("сантик");
        handle.demanded(money.getName(), handle.service("хранение вещей"));
        Kozlik.see();
        Kozlik.make("ничего", false);
        money.setName("монетка");
        Kozlik.climb("карман", money.getName());
        friends.popped("забегаловка");
        friends.breakfast("наскоро");
        friends.hurry("вокзал");
        friends.hope(train.arrive(false,true));
        System.out.println();
        friends.setFriend("их");
        hope.hope(friends.friend(), false);
        train.input(train.arrive(true,false));
        System.out.println();
        //ТЕКСТ С 3 ЛАБЫ
        Neznayka.search("снова");
        work.vName();
        day.intName();
        search.search();
        //Kozlik.setSos(Mestoimenie.ОН);
        Kozlik.Say();
        balagan.openFull();
        money.up();
        Neznayka.stay();
        mesto.input();
        System.out.println("");
        mesto.Pozition="Помостье";
        Neznayka.see();
        Korotishka.stay();
        mesto.input();
        Korotishka.dodge();
        ball.fly("лицо");
        Korotishka.zenki();
        Korotishka.attention(false);
        problem.fullState("подобные ");
        if (NN.power>Korotishka.dodgeSkill) {
            Fight.Borba(Korotishka, NN, ball, Kozlik);
        } else {
               throw  new DodgeException("КОРОТЫШКА УВЕРНУЛСЯ, ВСЕЛЕННАЯ ТАКОЕ НЕ ПЕРЕЖИЛА");
        }
       /* try {

        } catch (DodgeException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем Баланс \r\n"+ "  Ловкость коротышки="+ Korotishka.getDodgeSkill()+"\r\n"+"Мощность кидающего мяч коротышки "+ NN.getPower());
            return;
        } */
        Korotishka.name="Бедняга";
        Korotishka.see();
        Korotishka.run("дом", "поскорей");
        Korotishka.name="Несчастный коротышка";
        Kozlik.sad();
        Korotishka.input();
        Kozlik.smile();
        money.earn();
        //ТЕКСТ С 3 ЛАБЫ
        Kozlik.setSos(Mestoimenie.ОН);
        Kozlik.keep(false, "предложить свои услуги ");
        master.getName();
        WorkKorotishka KorotishkaNew= new WorkKorotishka("Коротышка", 2, Time.Сегодняшний, true, true, 8, Mestoimenie.ОН);
        KorotishkaNew.jump(" стоявший рядом ", " помост ");
        KorotishkaNew.shout();
        KorotishkaNew.stuck(" голова ", " отверстие в занавеске ");
        ball.quantity=10;
        ball.fly("в него");



    }
}
