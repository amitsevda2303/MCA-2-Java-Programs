// Write a program to implement encapsulation

class lp30 {
  private String name;

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }

  public static void main(String[] args) {
    lp30 obj = new lp30();
    obj.setName("Krishna");
    System.out.println("Name: " + obj.getName());
  }
}