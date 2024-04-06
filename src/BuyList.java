import java.util.ArrayList;

class BuyList implements IBuyList {
    private ArrayList<Item> list;

    public BuyList() {
        this.list = new ArrayList<Item>();
    }

    @Override
    public void add(Item i) {
        this.list.add(i);
    }

    public void add(String name, double value) {
        this.list.add(new Item(name, value));
    }

    @Override
    public void remove(int index) {
        this.list.remove(index);
    }

    @Override
    public void remove(Item i) {
        this.list.remove(i);
    }

    @Override
    public void list() {
        System.out.println("Lista de compras:");
        for (Item i : this.list)
            System.out.printf("Nome: %s, Valor: %.2f\n", i.getName(), i.getValue());
    }

}