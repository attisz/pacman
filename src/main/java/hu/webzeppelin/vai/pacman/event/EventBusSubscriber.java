package hu.webzeppelin.vai.pacman.event;

import com.google.common.eventbus.EventBus;

public interface EventBusSubscriber {
    default void registerTo(EventBus eventBus) {
        eventBus.register(this);
    }
}
