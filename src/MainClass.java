
public class MainClass {
public static void main(String[] args){
AppleTree a = new AppleTree();
BananaTree b = new BananaTree();
Tiger t = new Tiger();
Deer d = new Deer();
System.out.println("Apple Tree");
a.carbon();
a.oxygen();
a.get();
System.out.println("Banana Tree");
b.carbon();
b.oxygen();
b.get();
System.out.println("Tiger");
t.eat();
t.sleep();
System.out.println("Deer");
d.eat();
d.sleep();
}
}

