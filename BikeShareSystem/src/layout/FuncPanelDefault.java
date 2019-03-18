package layout;

import javax.swing.*;

import application.*;

/**
 * FuncPanelDefault
 * 
 * @author Xin Yifei
 * @version 0.6
 */
public class FuncPanelDefault extends JPanel {
    private static final long serialVersionUID = 1L;

    public FuncPanelDefault() {
        this.setName("Default");
        this.add(new JLabel("Default Page..."));
    }

    public static void main(String[] args) {
        MainUser.setup();
    }
}