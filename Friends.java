public class Friends {
    private String nameFriend1;
    private String nameFriend2;
    private String friend;
    Friends(String nameFriend1, String nameFriend2) { }
    public void setFriend(String friend) {
        this.friend = friend;
    }

    public String friend() {
        return friend;
    }
    public void climb(String place){
        setFriend("друзья");
        System.out.print(friend()+" забрались в "+place+" ");
    }
    public void sleep(String state) {
        System.out.println(" и "+state +" заснули ");
    }
    public void hear() {
        System.out.print("Послышалось ");
    }
    public void feel(String act) {
        System.out.print("Почувствовав что "+ act);
    }
    public void standUp(Mestoimenie mestoimenie, String time, String day ) {
        if (mestoimenie == Mestoimenie.ОНИ) {
            setFriend("Они");
            System.out.print(day +" "+ friend()+" проснулись " + time);
        }
    }
    public void run(String speed) {
       class Hotel{
        private String name;
        Hotel(String name) {
            this.name=name;
        }
          public String getName() {
              return name;
          }
      }
     Hotel hotel=new Hotel("гостиница");
       System.out.print(" решили "+speed+" угнать из "+hotel.getName());
    }
    public void leave(String where, String object) {
        System.out.println(" "+where+" "+friend()+" оставили "+ object);

    }
    public void popped(String where) {
        System.out.print("Заскочив в "+where+" ");

    }
    public void breakfast(String speed) {
        System.out.print(speed+" позавтракав ");
    }
    public void hurry(String where) {
        System.out.println(friend()+" поспешили на " +where);
    }
    public void hope(String act) {
        System.out.print(friend()+" надеятся, что "+act);
    }
}
