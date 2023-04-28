package team.sideex.config;

import org.apache.jmeter.testelement.TestElement;

public class EdgeConfigGui extends BrowserConfigGui {

    @Override
    protected BrowserConfigPanel createBrowserConfigPanel() {
        return new ChromeConfigPanel();
    }

    @Override
    protected String getBrowserName() {
        return "Edge";
    }

    @Override
    protected BrowserConfig createBrowserConfig() {
        return new ChromeConfig();
    }

    @Override
    public void configure(TestElement element) {
        super.configure(element);
        // additional configuration specific to ChromeConfigGui
    }

    @Override
    public void modifyTestElement(TestElement element) {
        super.modifyTestElement(element);
        // additional modifications specific to ChromeConfigGui
    }

}
