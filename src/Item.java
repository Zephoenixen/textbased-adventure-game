public class Item {
    protected String name;
    protected String shorthand;

    Item(String n, String sh){
        name = n;
        shorthand = sh;
    }

    public String getName() {
        return name;
    }

    public String getShorthand() {
        return shorthand;
    }

    @Override
    public String toString() {
        return Grammar(getName()) + getName();
    }

    private String Grammar(String word){
        char ch = word.toLowerCase().charAt(1);
        if(isVowel(ch)) return "an ";
        else return "a ";
    }

    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
