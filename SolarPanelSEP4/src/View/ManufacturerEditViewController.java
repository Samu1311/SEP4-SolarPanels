package View;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

public class ManufacturerEditViewController {

    @FXML
    private TextField CityField;

    @FXML
    private TextField CountryField;

    @FXML
    private Label EmailLabel;

    @FXML
    private TextField EmailTextField;

    @FXML
    private Label NameLabel;

    @FXML
    private TextField NameTextField;

    @FXML
    private Label PhoneLabel;

    @FXML
    private TextField PhoneTextField;

    @FXML
    private Label PostCodeLabel;

    @FXML
    private TextField PostCodeTextField;

    @FXML
    private Button backButton;

    @FXML
    private Label cityLabel;

    @FXML
    private Label countryLabel;

    @FXML
    private Button displayButton;

    @FXML
    private Button saveButtton;

    private Region root;
    private ViewHandler viewHandler;

    private DatabaseConnector databaseConnector;



    public void init (ViewHandler viewHandler, Region root, DatabaseConnector databaseConnector){
        this.viewHandler = viewHandler;
        this.root = root;
        this.databaseConnector = databaseConnector;
    }
    public Region getRoot() {
        return root;
    }

    public void SavePressed(){

    }
    @FXML public void BackPressed(){
        viewHandler.openView("Home Page");
    }
    @FXML public void DisplayPressed(){
        viewHandler.openView("Manufacturer Display");
    }
}

