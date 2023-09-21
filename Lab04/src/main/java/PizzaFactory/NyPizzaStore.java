package PizzaFactory;

`public class NyPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NyCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NyPepperoniPizza();
        }
        else if (type.equals("clam")){
            return new NyClamPizza();
        }
        else if (type.equals("veggie")){
            return new NyVeggiePizza();
        }

        return null;
    }
}
