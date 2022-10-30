public class Author {
    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    private String name;
    private String email;
    private char gender;

    void talk(Author a) {
        a.name = a.name + "王八蛋";
    }
}
