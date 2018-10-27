package hu.webzeppelin.vai.pacman.render.swing;

import com.google.common.eventbus.Subscribe;
import hu.webzeppelin.vai.pacman.event.EventBusSubscriber;
import hu.webzeppelin.vai.pacman.event.TickEvent;
import java.awt.*;
import java.util.concurrent.atomic.AtomicLong;
import javax.swing.*;

public class DrawablePanel extends JPanel implements EventBusSubscriber {

    private AtomicLong counter = new AtomicLong(0);

    public DrawablePanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(250, 200);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(String.format("This is my custom Panel!"), 10, 20 + (int) counter.getAndIncrement());
    }

    @Subscribe
    public void handle(TickEvent tickEvent) {
        repaint();
    }
}
