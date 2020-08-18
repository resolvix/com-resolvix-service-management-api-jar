package com.resolvix.service.management.api;

/**
 * Defines an interface for a service component.
 */
public interface ServiceComponent {

    enum Status {

        STARTED,

        STOPPED;
    }

    /**
     * Returns the current status of the service component.
     *
     * @return the status
     */
    Status getStatus();

    /**
     * Signals the service component to initialise itself, if it has
     * not already done so.
     */
    void initialise();

    /**
     * Signals the service component to restart itself.
     */
    default void restart() {
        start();
        stop();
    }

    /**
     * Signals the service component to start.
     */
    void start();

    /**
     * Signals the service component to stop.
     */
    void stop();
}
