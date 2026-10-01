public class Item {
    protected String name;
    protected String shorthand;
    protected String grammar;

    Item(String n, String sh, String g){
        name = n;
        shorthand = sh;
        grammar = g;
    }

    public String getName() {
        return name;
    }

    public String getGrammar() {
        return grammar;
    }

    public String getShorthand() {
        return shorthand;
    }

    @Override
    public String toString() {
        StringBuilder strbud;
        strbud = new StringBuilder(grammar).append(" ").append(name);
        return strbud.toString();
    }
}
