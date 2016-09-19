package AbstractFactoryDemo;

/**
 * Created by young on 16-9-19.
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextFiled createTextFiled() {
        return new SpringTextFiled();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
