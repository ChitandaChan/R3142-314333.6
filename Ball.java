public class Ball {
    public int quantity;
    public Ball(int quanity) {
        this.quantity=quanity;
    }
    public void fly(String target) {
        if (quantity==1) {
            System.out.println(" мяч летит в " + target);
        } else {
            System.out.println(" мячи летят в " + target);
        }
    }
    public void punch() {
        if (quantity==1) {
            System.out.println("Мяч попадает в цель");
        } else {
            System.out.println("Мячи попадают в цель");
        }
        }
    public void punch(AbstractUdar a) {
        a.Udar();
    }
}
