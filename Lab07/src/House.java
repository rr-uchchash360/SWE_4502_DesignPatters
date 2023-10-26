class House extends VillageComponent {
    public String type;

    public House(String type) {
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println(type + " house");
    }
}