package animalkingdom;

abstract class AbstractAnimals {
    protected String eat;
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int year;

    public AbstractAnimals(String name, int year) {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    abstract String move();
    abstract String breath();
    abstract String reproduce();

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }
    int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Animal Name: " + name + ", Year discovered: " + year;
    }

}