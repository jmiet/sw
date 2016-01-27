package zad3;

import javax.swing.*;

/**
 * Created by A on 2016-01-27.
 */
public class doIt {
    public static void run (final JFrame f, final int w, final int h){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                f.setTitle(f.getClass().getSimpleName());
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(w,h);
                f.setVisible(true);
            }
        });
    }
}
