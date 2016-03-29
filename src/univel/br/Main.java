package univel.br;

import java.io.IOException;

import ch.makery.address.MainApp;
import ch.makery.address.view.PersonOverviewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class Main {
	
	public void showPersonOverview() {
        try {
            // Carrega a person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/Layout.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Define a person overview no centro do root layout.
            rootLayout.setCenter(personOverview);

            // Dá ao controlador acesso à the main app.
            Layout controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
