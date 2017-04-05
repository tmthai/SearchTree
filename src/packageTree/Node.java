package packageTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cutie Pie on 3/7/2017.
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
