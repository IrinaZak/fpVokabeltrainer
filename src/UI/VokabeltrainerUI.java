package UI;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class VokabeltrainerUI extends Application {
	private Parent root;
	private TextField translation;
	private Button start;
	private Button add;
	private Button dictionary;
	private Button confirm;
	private Label text;
	private Label german;
	private Label english;
	private Label translate;
	private Label fromGermanToEnglish;
	private Label changeTranslation;
	private Label word;
	private Label output;
	
	private VokabeltrainerUI vokabelbuch;
	
	@Override
	public void init() throws Exception {
		
		vokabelbuch = new VokabeltrainerUI(); 
		
	translation = new TextField();
	translation.setPrefWidth(300);
	translation.setPromptText("Translation");
	
	start = new Button("Trainieren");
	start.setPrefWidth(150);
	
	dictionary = new Button("Wörterbuch");
	dictionary.setPrefWidth(150);
	
	confirm = new Button("Bestätigen");
	confirm.setOnAction(event -> {
		String input = translation.getText().trim();
		});
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Vowel");
		Scene scene = new Scene(root,800,100);		
		primaryStage.setScene(scene);
		primaryStage.show();	
}
	
private Parent createSceneGraph() {
		
		BorderPane pane = new Border();
		FlowPane inputPanel = new FlowPane();
		inputPanel.getChildren().addAll(translate, word, fromGermanToEnglish, translation, confirm, changeTranslation);
		
		FlowPane outputPanel = new FlowPane();
		outputPanel.getChildren().addAll();
		
		pane.setTop(inputPanel);
		pane.setTop(start);
		pane.setTop(dictionary);
		pane.setCenter(confirm);
		pane.setBottom(output);
		pane.setBottom(changeTranslation);
		pane.setCenter(word);
		
		return pane;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}


