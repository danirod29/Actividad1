/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javauiproject;

import javax.swing.SwingUtilities;
import mainView.MainViewTemplate;

/**
 *
 * @author Daniel RodriguezS
 */
public class JavaUIProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable runApplication = new Runnable() {
            @Override
            public void run() {
                MainViewTemplate mvt = new MainViewTemplate();
            }

        };

        SwingUtilities.invokeLater(runApplication);
    }

}
