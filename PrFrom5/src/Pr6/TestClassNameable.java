package Pr6;

public class TestClassNameable implements Nameable {
    private String name;

    public TestClassNameable(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        TestClassNameable test = new TestClassNameable("NameOfObject");
        System.out.println(test.getName());
    }
}
