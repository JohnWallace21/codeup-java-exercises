package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }
    public String nameGetter() {
        return name;
    }

    public void nameSetter(String name) {
        this.name = name;
    }

    public String catGetter(){
        return category;
    }
    public String catSetter(String category){
        this.category = category;
        return null;
    }
}
