package PizzaFactory;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = PizzaStoreFactory.createPizzaStore("New York");
        PizzaStore chicagoPizzaStore = PizzaStoreFactory.createPizzaStore("Chicago");
        PizzaStore californiaPizzaStore = PizzaStoreFactory.createPizzaStore("California");

        Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");
        Pizza chicagoPepperoniPizza = chicagoPizzaStore.orderPizza("pepperoni");
        Pizza californiaVeggiePizza = californiaPizzaStore.orderPizza("veggie");
    }
}