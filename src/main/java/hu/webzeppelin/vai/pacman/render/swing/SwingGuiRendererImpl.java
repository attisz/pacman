package hu.webzeppelin.vai.pacman.render.swing;

import static com.google.common.util.concurrent.Uninterruptibles.sleepUninterruptibly;
import static java.util.concurrent.TimeUnit.SECONDS;

import hu.webzeppelin.vai.pacman.render.GuiRenderer;
import javax.swing.*;

public class SwingGuiRendererImpl implements GuiRenderer, DrawablePanelHolder {

    private DrawablePanel drawablePanel = new DrawablePanel();

    @Override
    public void createAndShowGui() {
        SwingUtilities.invokeLater(this::createAndShowGUI);
    }

    @Override
    public DrawablePanel getDrawablePanel() {
        return drawablePanel;
    }

    private void createAndShowGUI() {
        JFrame f = new JFrame("Pac-Man");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(drawablePanel);
        f.pack();
        f.setVisible(true);

        new Thread(() -> {
            while (true) {
                sleepUninterruptibly(1, SECONDS);
                drawablePanel.repaint();
            }
        }).start();
    }
}
