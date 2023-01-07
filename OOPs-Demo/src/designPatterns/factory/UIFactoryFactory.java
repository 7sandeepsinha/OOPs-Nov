package designPatterns.factory;

public class UIFactoryFactory {

    public static UIFactory createUIFactory(SupportedPlatform platform){
        return switch (platform){
            case ANDROID -> new AndroidUIFactory();
            case IOS ->  new IosUIFactory();
            case WINDOWS -> new WindowsUIFactory();
        };
    }
}
