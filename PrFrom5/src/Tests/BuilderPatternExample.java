package Tests;

class Item {
    private String property1;
    private String property2;
    private String property3;

    // Приватный конструктор, чтобы объект можно было создать только через Builder
    private Item(Builder builder) {
        this.property1 = builder.property1;
        this.property2 = builder.property2;
        this.property3 = builder.property3;
    }

    public String getProperty1() {
        return property1;
    }

    public String getProperty2() {
        return property2;
    }

    public String getProperty3() {
        return property3;
    }

    // Вложенный статический класс Builder
    public static class Builder {
        private String property1;
        private String property2;
        private String property3;

        public Builder setProperty1(String property1) {
            this.property1 = property1;
            return this;
        }

        public Builder setProperty2(String property2) {
            this.property2 = property2;
            return this;
        }

        public Builder setProperty3(String property3) {
            this.property3 = property3;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }
}

public class BuilderPatternExample {
    public static void main(String[] args) {
        Item product = new Item.Builder()
                .setProperty1("Value 1")
                .setProperty2("Value 2")
                .setProperty3("Value 3")
                .build();

        System.out.println("Property 1: " + product.getProperty1());
        System.out.println("Property 2: " + product.getProperty2());
        System.out.println("Property 3: " + product.getProperty3());
    }
}
