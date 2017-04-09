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

public class  service {

    public static void main(String[] args)
    {
        Node s= Init();
        String f = "Find Me";
        searchNode(s,f);
        printTree(Arrays.asList(s));
    }

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

    public static boolean searchNode(Node start, String fin)
    {
        //Apply Depth First Search algorithm
        System.out.println("We visit "+ start.getName());
        if(start.getName().equals(fin)) {
            System.out.println("We found your node in the Tree");
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


    public static void printTree(List<Node> listNodes)
    {
        // Use Breath First Search for printing all nodes of each level
        List<Node> listchildren = new ArrayList<>();
        for(int i=0; i<listNodes.size(); i++) {
            System.out.print(listNodes.get(i).getName()+" ");
            listchildren.addAll(listNodes.get(i).getChildren());
        }

        if(!listchildren.isEmpty()) {
            System.out.println();
            printTree(listchildren);
        }
    }
}
