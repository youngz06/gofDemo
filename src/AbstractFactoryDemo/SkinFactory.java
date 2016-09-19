package AbstractFactoryDemo;

/**
 * Created by young on 16-9-19.
 */
public interface SkinFactory {
    public Button createButton();
    public TextFiled createTextFiled();
    public ComboBox createComboBox();
}
