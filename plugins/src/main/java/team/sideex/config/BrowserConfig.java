package team.sideex.config;

import org.apache.jmeter.config.ConfigTestElement;
import org.apache.jmeter.engine.event.LoopIterationEvent;
import org.apache.jmeter.engine.event.LoopIterationListener;
import org.apache.jmeter.testelement.ThreadListener;
import org.apache.jmeter.threads.JMeterVariables;

public abstract class BrowserConfig extends ConfigTestElement implements LoopIterationListener, ThreadListener {
    private static final String BROWSER_ADDITIONAL_ARGS = "BROWSER_ADDITIONAL_ARGS";

    public String getBrowserAdditionalArgs() {
        return getPropertyAsString(BROWSER_ADDITIONAL_ARGS);
    }

    public void setBrowserAdditionalArgs(String args) {
        setProperty(BROWSER_ADDITIONAL_ARGS, args);
    }

    @Override
    public void iterationStart(LoopIterationEvent iterEvent) {

    }

    @Override
    public void threadStarted() {

    }

    @Override
    public void threadFinished() {

    }
}
