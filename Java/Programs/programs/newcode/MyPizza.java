package programs.newcode;

public enum MyPizza {
    REGULAR(120),
    MEDIUM(220),
    LARGE(420);

    public int price;

    MyPizza(int price){
        this.price = price;
    }
}
