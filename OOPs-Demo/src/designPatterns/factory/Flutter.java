package designPatterns.factory;

public class Flutter {
    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform) {
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("This changes the theme");
    }

    public void setRefreshRate(){
        System.out.println("This changes the refresh rate");
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(platform);
    }
}
