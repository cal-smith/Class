public class TestMoney {
  public static void main(String[] args) {
    Money money;
    String actual,expected;
    
    System.out.print("        Money() test : ");
    money = new Money();
    actual = money.getMoney();
    expected = "$0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected)) {
      System.out.println(" pass");
    } else{
      System.out.println(" fail");
    }
    
    System.out.print("Money(int, int) test : ");
    money = new Money(0,0);
    actual = money.getMoney();
    expected = "$0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
 
    System.out.print("Money(int, int) test : ");
    money = new Money(12,7);
    actual = money.getMoney();
    expected = "$12.07";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("Money(int, int) test : ");
    money = new Money(3,4023);
    actual = money.getMoney();
    expected = "$43.23";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("     Money(int) test : ");
    money = new Money(0);
    actual = money.getMoney();
    expected = "$0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("     Money(int) test : ");
    money = new Money(63);
    actual = money.getMoney();
    expected = "$0.63";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("     Money(int) test : ");
    money = new Money(21387);
    actual = money.getMoney();
    expected = "$213.87";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("  Money(double) test : ");
    money = new Money(0.0);
    actual = money.getMoney();
    expected = "$0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("  Money(double) test : ");
    money = new Money(12.04);
    actual = money.getMoney();
    expected = "$12.04";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.println();
    money = new Money(100, 40);
    System.out.println("starting money: " + money.getMoney());
    money.add(10);
    System.out.println("added 10 cents: " + money.getMoney());
    money.add(1, 0);
    System.out.println("added 1 dollar: " + money.getMoney());
    System.out.println("money removed: " + money.remove(60));
    actual = money.getMoney();
    System.out.println(actual);
  }
}