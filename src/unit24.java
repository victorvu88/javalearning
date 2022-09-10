public class unit24 {
  public static void main(String[] args) {
      Manager man = new Manager();
      man.show();
  }
}
 interface Human {
    public static final int Age = 19;
    int Weight = 63;
    public void show();
    void study();
 }
  class Manager implements Human {
      @Override
      public void show() {
          System.out.println("Age : " + Age);
      }

      @Override
      public void study() {

      }

  }
