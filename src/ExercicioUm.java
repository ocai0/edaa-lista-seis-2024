class ExercicioUm {
    public static void resolve() {
        ContactList listOfContacts = new ContactList(1, true);
        listOfContacts.addContact("Goku", "312-323-1232");
        listOfContacts.addContact(new Contact("Vegeta", "567-567-7665"));
        try {
            Contact result = listOfContacts.searchContact("Vegeta");
            System.out.println("Telefone de contato do 'Vegeta': " + result.getPhone());
        } catch (Error e) {
            System.out.println("O telefone para este contato não foi encontrado");
        }
        listOfContacts.list();
    }
}