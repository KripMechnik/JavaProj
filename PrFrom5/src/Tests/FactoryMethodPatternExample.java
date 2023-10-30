package Tests;

interface Product {
    void doSomething();
}

class ConcreteProduct implements Product {
    public void doSomething() {
        System.out.println("Doing something in ConcreteProduct.");
    }
}

abstract class Creator {
    public abstract Product createProduct();

    public void performAction() {
        Product product = createProduct();
        product.doSomething();
    }
}

class ConcreteCreator extends Creator {
    public Product createProduct() {
        return new ConcreteProduct();
    }
}

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        creator.performAction();
    }
}
