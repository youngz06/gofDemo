package AbstractFactoryDemo;

import javafx.scene.control.Skin;

/**
 * Created by young on 16-9-19.
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextFiled createTextFiled() {
        return new SummerTextFiled();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
