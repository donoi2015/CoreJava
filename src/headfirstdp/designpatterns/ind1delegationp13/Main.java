package headfirstdp.designpatterns.ind1delegationp13;

class RealPrinter { // the "delegate"
    void print() { 
      System.out.println("something"); 
    }
}

class Printer { // the "delegator"
    private RealPrinter p = new RealPrinter(); // create the delegate
    void print() { 
      p.print(); // delegation
    } 
}

public class Main {
    // to the outside world it looks like Printer actually prints.
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}