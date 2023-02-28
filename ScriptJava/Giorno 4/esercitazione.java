public class esercitazione {
  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      int time = 0;
      time = (int) (Math.random() * 50);
      System.out.println(time);
      if (time > 25) {
        System.out.println("over 25");
      } else {
        System.out.println("under 25");
      }
    }
  }
}
