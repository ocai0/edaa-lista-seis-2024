class ExercicioDois {
    public static void resolve() {
        BuyList listaCompras = new BuyList();
        listaCompras.add("Super Smash Bros", 120.5);
        listaCompras.add(new Item("Nintendo Game Cube", 650.75));
        Item snes = new Item("Super Nintendo Entertainment System", 317.80);
        listaCompras.add(snes);
        System.out.println("----------------------------------------");
        listaCompras.list();
    }
}