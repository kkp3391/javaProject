package myapp.viewPackage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import common.BoardVO;
import common.InputBoardVO;
import common.InputDAO;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;

//Board.fxml
//BoardController.java
public class BoardController implements Initializable {
	@FXML
	TableView<BoardVO> tableView;
	@FXML
	TextField boardNo, title;
	@FXML
	ComboBox<String> publicity;
	@FXML
	DatePicker exitDate;
	@FXML
	TextArea contents;
	@FXML
	Button updateBtn, deleteBtn, addBtn;

	private Stage primarystage;
	public void setPrimaryStage(Stage primaryStage) {
		this.primarystage = primaryStage;
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		deleteBtn.setOnAction(e -> deleteBtnAction(e));
		addBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				addBtnAction(event);
				
			}
			
		});
		
		ObservableList<BoardVO> list = InputDAO.boardList();
		tableView.setPrefWidth(450);
	     tableView.setLayoutX(30);

		
		TableColumn<BoardVO, Integer> tcBoardNo = (TableColumn<BoardVO, Integer>) tableView.getColumns().get(0);
		tcBoardNo.setCellValueFactory(new PropertyValueFactory<BoardVO, Integer>("boardNo"));

		 tcBoardNo.setPrefWidth(70);

		TableColumn<BoardVO, String> tcTitle = (TableColumn<BoardVO, String>) tableView.getColumns().get(1);
		tcTitle.setCellValueFactory(new Callback<CellDataFeatures<BoardVO, String>, ObservableValue<String>>() {

			@Override
			public ObservableValue<String> call(CellDataFeatures<BoardVO, String> param) {

				return param.getValue().titleproperty();
			}

		});
		TableColumn<BoardVO, String> tcPub = new TableColumn<BoardVO, String>("공개");
		tcPub.setCellValueFactory(new PropertyValueFactory<BoardVO, String>("publicity"));
		tableView.getColumns().add(tcPub);

		
		
	      TableColumn<BoardVO, String> tcContents = new TableColumn<BoardVO, String>("내용");
	      tcContents.setCellValueFactory(new Callback<CellDataFeatures<BoardVO, String>, ObservableValue<String>>(){

			@Override
			public ObservableValue<String> call(CellDataFeatures<BoardVO, String> param) {
				
				return param.getValue().contentsproperty();
			}
	    	  
	      });
	      
	      tableView.getColumns().add(tcContents);
	      tcContents.setPrefWidth(150);

	      tableView.setItems(list);  
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<BoardVO>() {

			@Override
			public void changed(ObservableValue<? extends BoardVO> arg0, BoardVO oldVal, BoardVO newVal) {
				  if (newVal != null) {
		               System.out.println(newVal.getBoardNo());

				boardNo.setText(String.valueOf(newVal.getBoardNo()));
				title.setText(newVal.getTitle());
				publicity.setValue(newVal.getPublicity());
				contents.setText(newVal.getcontents());
				exitDate.setValue(LocalDate.parse(newVal.getExitDate()));
				  }
			}

		});
	}

	public void updateBtnAction(ActionEvent e) {
		BoardVO vo = new BoardVO();
		vo.setBoardNo(Integer.parseInt(boardNo.getText()));
		vo.setContents(contents.getText());
		vo.setExitDate(exitDate.getValue().toString());
		vo.setPublicity(publicity.getValue());
		InputDAO.updateBoard(vo);
		tableView.setItems(InputDAO.boardList());
	}

	public void deleteBtnAction(ActionEvent e) {
		BoardVO vo = new BoardVO();
	      vo.setBoardNo(Integer.parseInt(boardNo.getText()));
	      InputDAO.deleteBoard(vo);
	      tableView.setItems(InputDAO.boardList());

		
//삭제기능
	}
//새창을 보여주는 기능
	  public void addBtnAction(ActionEvent e) {
	      Stage stage = new Stage(StageStyle.DECORATED);
	      stage.initModality(Modality.WINDOW_MODAL);
	      stage.initOwner(primarystage);
	      
	      try {
	         AnchorPane ap = FXMLLoader.load(getClass().getResource("BoardAdd.fxml"));
	         Scene scene = new Scene(ap);
	         stage.setScene(scene);
	         stage.show();
	         
	         Button btnReg = (Button) ap.lookup("#btnReg");
	         Button btnCancel = (Button) ap.lookup("#btnCancel");
	         
	         btnCancel.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	               stage.close();
	            }
	         });
	         
	         btnReg.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	               InputBoardVO vo = new InputBoardVO();
	               TextField txtTitle = (TextField) ap.lookup("#txtTitle");
	               vo.setTitle(txtTitle.getText());
	               
	               ComboBox comboPublic = (ComboBox) ap.lookup("#comboPublic");
	               vo.setPublicity(comboPublic.getValue().toString());
	               
	               PasswordField txtPassword = (PasswordField) ap.lookup("#txtPassword");
	               vo.setPasswd(txtPassword.getText());
	               
	               DatePicker dateExit = (DatePicker) ap.lookup("#dateExit");
	               vo.setExitDate(dateExit.getValue().toString());
	               
	               TextArea txtContent = (TextArea) ap.lookup("#txtContent");
	               vo.setContents(txtContent.getText());
	               InputDAO.insertBoard(vo);
	               tableView.setItems(InputDAO.boardList());
	               
	            }
	         });
	      
	         
	      } catch (IOException e1) {
	         // TODO Auto-generated catch block
	         e1.printStackTrace();
	      }
	      
	   }
	}