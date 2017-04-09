package packageTree;

import packageTree.Node.*;
import java.lang.*;
import  java.lang.Object;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JComponent;
import java.util.List;

/**
 * Created by Tam Thai on 4/5/2017.
 */

/* Create the application 'service' for searching for a target node in a tree of nodes.
 *
 */
public class service {

    /* start the application to use/test the search algorithm
     *
     */
    public static void main(String[] args)
    {
        Node s= Init();
        String f = "Find Me";
        searchNode(s,f);
    }

    /* define the search tree
     *
     */
    public static Node Init()
    {
        Node s = new Node("Start");
        Node A1 = new Node("A1");
        Node A2 = new Node("A2");
        Node B1 = new Node("B1");
        Node B2 = new Node("B2");
        Node B3 = new Node("B3");
        Node C1 = new Node("C1");
        Node FindMe = new Node("Find Me");
        Node C2 = new Node("C2");
        Node D1 = new Node("D1");

        s.getChildren().add(A1);
        s.getChildren().add(A2);
        A1.getChildren().add(B1);
        B1.getChildren().add(C1);
        A2.getChildren().add(B2);
        A2.getChildren().add(B3);
        B2.getChildren().add(FindMe);
        FindMe.getChildren().add(D1);
        B3.getChildren().add(C2);

        return s;

    }

    /* Method for recursively searching the tree,
     * and printing out the name of each node visited until target node is found.
     */
    public static boolean searchNode(Node start, String fin)
    {
        //Apply Depth First Search algorithm
        System.out.println(start.getName());
        if(start.getName().equals(fin)) {
            return true;
        }
        List<Node> children = start.getChildren();
        if(!children.isEmpty()){
            for(int i=0; i<children.size(); i++)
            {
                if(searchNode(children.get(i),fin))
                    return true;
            }
        }
        return false;
    }
}