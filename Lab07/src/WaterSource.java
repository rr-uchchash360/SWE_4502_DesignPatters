class WaterSource extends VillageComponent {
    public String type;

    public WaterSource(String type) {
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println(type + " water source");
    }
}