class Tree extends VillageComponent {
    public String type;

    public Tree(String type) {
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println(type + " tree");
    }
}