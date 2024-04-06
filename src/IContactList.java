interface IContactList {
    public void addContact(Contact contact);
    public void addContact(String name, String phone);
    public Contact searchContact(String name);
    public void list();
}