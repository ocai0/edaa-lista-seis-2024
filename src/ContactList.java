class ContactList implements IContactList {
    private Contact[] list;
    private int capacity;
    private int lastIndexUsed;
    private boolean expandIfNecessary;

    private void construct(int capacity, boolean expandIfNecessary) {
        this.lastIndexUsed = 0;
        this.list = new Contact[capacity];
        this.capacity = capacity;
        this.expandIfNecessary = expandIfNecessary;
    }

    public ContactList(int capacity, boolean expandIfNecessary) {
        this.construct(capacity, expandIfNecessary);
    }

    public ContactList(int capacity) {
        this.construct(capacity, false);
    }

    @Override
    public void addContact(String name, String phone) {
        this.addContact(new Contact(name, phone));
    }

    @Override
    public void addContact(Contact contact) {
        if (this.lastIndexUsed + 1 > this.capacity) {
            if (this.expandIfNecessary == false) {
                System.out.println("List is full");
                return;
            }
            this.expandInternalList();
        }
        this.list[this.lastIndexUsed++] = contact;
    }

    private void expandInternalList() {
        int newCapacity = this.capacity * 2;
        Contact[] list = new Contact[newCapacity];
        int _index = 0; // '_' stands for local variable
        while (_index < this.capacity) {
            list[_index] = this.list[_index];
            _index++;
        }
        this.list = list;
        this.capacity = newCapacity;
    }

    @Override
    public Contact searchContact(String name) {
        for (Contact c : this.list)
            if (c.getName().equalsIgnoreCase(name))
                return c;
        throw new Error("No Contact was found");
    }

    @Override
    public void list() {
        for (Contact c : this.list)
            System.out.printf("Nome: %s; Telefone: %s\n", c.getName(), c.getPhone());
    }

}