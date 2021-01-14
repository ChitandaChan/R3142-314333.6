public class Fight {
    static void Borba(WorkKorotishka Korotishka , BallFlyMan ballman, Ball ball, BomzhKorotiska Kozlik) throws DodgeException {
        if(Korotishka.getDodgeSkill() > ballman.getPower()){
            ball.fly("Коротышка");
            Korotishka.dodge();
            throw new DodgeException("ВАУ!");
        }
        else{
            ball.punch(new AbstractUdar() {
                @Override
                public void Udar() {
                    System.out.println("Мяч попадает в цель");
                }
            });
            Korotishka.nododge();
            Kozlik.payment(true);
            ballman.shootong(true, "действительно скоро");
            Korotishka.nododge();
            ball.punch();
            Korotishka.setEye(Korotishka.getEye()-1);
            Korotishka.grabHand("подбитый глаз");
            Korotishka.cry("боль");
        }
    }
}
