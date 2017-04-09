package packageTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tam Thai on 4/5/2017.
 */
public class Node {

    private String name;
    private List<Node> Children = new ArrayList<>();

    Node(String name)
    {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        name = n;
    }

    public List<Node> getChildren() {
        return Children;
    }

    public void setChildren(List<Node> children) {
        Children = children;
    }
}
