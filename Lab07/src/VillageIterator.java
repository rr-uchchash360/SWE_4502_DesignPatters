import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class VillageIterator {
    public Iterator<VillageComponent> iterator;

    public VillageIterator(VillageComponent village) {
        this.iterator = ((VillageComposite) village).components.iterator();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public VillageComponent next() {
        return iterator.next();
    }
}
