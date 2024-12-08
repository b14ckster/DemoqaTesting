package interfaces;

/**
 * Using for CucumberOptions -> tags:
 */
public interface ITags {

    /**
     * Run all tests on <a href="https://demoqa.com/">demoqa</a>
     */
    String ALL = "@all";

    /**
     * Run tests on <a href="https://demoqa.com/checkbox">checkbox page</a>
     */
    String CHECKBOX = "@checkbox";

    /**
     * Run tests on <a href="https://demoqa.com/radio-button">radio-button page</a>
     */
    String RADIO_BUTTON = "@radio_button";

    /**
     * Run tests on <a href="https://demoqa.com/text-box">text-box</a>
     */
    String TEXT_BOX = "@text_box";

    /**
     * Run tests on <a href="https://demoqa.com/webtables">web-tables page</a>
     */
    String WEB_TABLE = "@web_table";
}
