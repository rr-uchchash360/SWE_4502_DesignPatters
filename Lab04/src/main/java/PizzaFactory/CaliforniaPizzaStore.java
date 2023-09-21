package PizzaFactory;

public class CaliforniaPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new CaliforniaPepperoniPizza();
        }
        else if (type.equals("clam")){
            return new CaliforniaClamPizza();
        }
        else if (type.equals("veggie")){
            return new CaliforniaVeggiePizza();
        }
        // More styles of NyPizzas could be added here
        return null;
    }
}
