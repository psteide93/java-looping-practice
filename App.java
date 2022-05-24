class App {
  public static void main(String args[]){
    App.forLoop();
    App.whileLoop();
    App.doWhileLoop();
  }

  private static void forLoop() {
    for(int count = 1; count <= 10; count++ ){
    System.out.println(count);
    }
    System.out.println("Launch!");
  }

  private static void whileLoop() {
    int count = 0;
    while(count < 5){
      System.out.println("I love Java");
      count++;
    }
  }

  private static void doWhileLoop() {
    int count = 0;
    do{
      System.out.println("I love Java");
      count++;
    }while(count < 5);
  }
}


