package Practice;

public class Person21 {

    private String name = "";
    private String hobbie = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    @Override
    public String toString() {

        return getName() + " - " + getHobbie();

    }
}
