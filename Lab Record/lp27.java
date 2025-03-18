// Create a program to demonstrate the use of this and super keywords

class Parent {
  String name;

  Parent(String name) {
    this.name = name;
  }
}

class lp27 extends Parent {
  lp27(String name) {
    super(name);
  }

  void display() {
    System.out.println("Name: " + name);
  }

  public static void main(String[] args) {
    lp27 obj = new lp27("Krishna");
    obj.display();
  }
}