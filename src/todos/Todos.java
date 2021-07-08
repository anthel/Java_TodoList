package todos;
import java.util.*;



public class Todos {
    private ArrayList<String> todo = new ArrayList<String>();

    public Todos(ArrayList<String> todo) {
        this.todo = todo;
    }

    public ArrayList<String> getTodos() {
        return todo;
    }
}
