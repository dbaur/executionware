package de.uniulm.omi.cloudiator.sword.core.logging;

import de.uniulm.omi.cloudiator.sword.api.logging.Logger;

/**
 * Created by Daniel Seybold on 03.08.2015.
 */
public class SystemOutLogger implements Logger {

    @Override
    public boolean isTraceEnabled() {
        return true;
    }

    @Override
    public boolean isDebugEnabled() {
        return true;
    }

    @Override
    public boolean isInfoEnabled() {
        return true;
    }

    @Override
    public boolean isWarnEnabled() {
        return true;
    }

    @Override
    public boolean isErrorEnabled() {
        return true;
    }

    @Override
    public boolean isFatalEnabled() {
        return true;
    }

    @Override
    public void trace(String message) {
        System.out.println(message);
    }

    @Override
    public void debug(String message) {
        System.out.println(message);
    }

    @Override
    public void info(String message) {
        System.out.println(message);
    }

    @Override
    public void warn(String message) {
        System.out.println(message);
    }

    @Override
    public void warn(String message, Throwable throwable) {
        System.out.println(message);
        throwable.printStackTrace();
    }

    @Override
    public void error(String message) {
        System.err.println(message);
    }

    @Override
    public void error(String message, Throwable throwable) {
        System.err.println(message);
        throwable.printStackTrace();
    }

    @Override
    public void fatal(String message) {
        System.err.println(message);
    }

    @Override
    public void fatal(String message, Throwable throwable) {
        System.err.println(message);
        throwable.printStackTrace();
    }
}
