package application;

import java.util.*;
import javax.swing.*;

import layout.*;

/**
 * MainStation
 * 
 * @author Xin Yifei
 * @version 0.9
 */
public class MainStation {

    public static LinkedList<JPanel> funcSet = new LinkedList<JPanel>();
    public static Boolean restart = false;
    public static String station = null;

    public static void setup() {
        funcSet = new LinkedList<JPanel>();
        funcSet.add(new FuncPanelStation());
        // funcSet.add(new FuncPanelTest());
        new MainLayout(funcSet);
    }

    public static void main(String[] args) {
        setup();
    }
}