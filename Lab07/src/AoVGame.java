public class AoVGame {
    public static void main(String[] args) {
        VillageBuilder builder = new VillageBuilder();

        builder.buildHouse("Brick");
        builder.buildTree("Mango");
        builder.buildWaterSource("Swimming Pool");

        VillageComposite village = builder.getVillage();

        VillageIterator iterator = new VillageIterator(village);
        while (iterator.hasNext()) {
            iterator.next().display();
        }
    }
}