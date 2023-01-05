package designPatterns.factory;

import designPatterns.factory.components.button.AndroidButton;
import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.dropdown.AndroidDropDown;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.menu.AndroidMenu;
import designPatterns.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropDown createDropDown() {
        return new AndroidDropDown();
    }
}
