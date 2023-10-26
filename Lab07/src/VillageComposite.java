import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class VillageComposite extends VillageComponent {
    public List<VillageComponent> components = new ArrayList<>();

    @Override
    public void display() {
        for (VillageComponent component : components) {
            component.display();
        }
    }

    public void addComponent(VillageComponent component) {
        components.add(component);
    }

    public void removeComponent(VillageComponent component) {
        components.remove(component);
    }
}
