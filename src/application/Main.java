package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	// primaryStage: primeiroPalco
	public void start(Stage primaryStage) {
		try {
			// loader: carregador
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			Parent parent = loader.load();
			// Scene: Cena - mainScene: cenaPrincipal
			Scene mainScene = new Scene(parent);
			primaryStage.setScene(mainScene);
			// primaryStage.setTitle("Sample JavaFX application");
			primaryStage.setTitle("Aplicação JavaFX modelo");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
