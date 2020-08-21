

public class Word {

    private java.lang.String name;


    public Word(java.lang.String name){
        this.name = name;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Word{" +
                "name='" + name + '\'' +
                '}';
    }
}


