public class GenericsDemo {
    
    public static void main(String[] args) {
        MyGenericsClass g = new MyGenericsClass();
        g.setMyVar(6);
        g.printValue();
        
        g.setMyVar(6.18);
        g.printValue();
        
        //g.setMyVar("meep");
        //g.printValue();
    }
}

class MyGenericsClass<T extends Number> {
    private T myVar;
    
    void setMyVar(T i) {
        myVar = i;
    }
    
    void printValue() {
        System.out.println("The value is " + myVar);
    }
}
