class Pessoa {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pessoa(String name, int age) {
        this.setAge(age);
        this.setName(name);
    }

    public String toString() {
        return "Pessoa{nome=" + name + ", idade=" + age + "}";
    }

}