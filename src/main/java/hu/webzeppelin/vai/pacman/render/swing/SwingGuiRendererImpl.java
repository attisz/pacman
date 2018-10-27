package hu.webzeppelin.vai.pacman.render.swing;

import static com.google.common.util.concurrent.Uninterruptibles.sleepUninterruptibly;
import static java.util.concurrent.TimeUnit.SECONDS;

import com.google.common.eventbus.EventBus;
import hu.webzeppelin.vai.pacman.event.TickEvent;
import hu.webzeppelin.vai.pacman.render.GuiRenderer;
import javax.swing.*;

public class SwingGuiRendererImpl implements GuiRenderer, DrawablePanelHolder {

    private final EventBus eventBus;
    private DrawablePanel drawablePanel = new DrawablePanel();

    public SwingGuiRendererImpl(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void createAndShowGui() {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
            startSystemTicking();
        });
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
    }

    private void startSystemTicking() {
        new Thread(() -> {
            while (true) {
                sleepUninterruptibly(1, SECONDS);
                eventBus.post(new TickEvent());
            }
        }).start();
    }
}
