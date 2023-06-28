package screens;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class ActionButtonTableCell<S> extends TableCell<S, Void> {
    private final Button actionButton;

    public ActionButtonTableCell(String buttonText, Callback<S, S> actionCallback) {
        this.actionButton = new Button(buttonText);
        actionButton.setAlignment(Pos.CENTER);
        this.actionButton.setOnAction(event -> {
            S item = getTableRow().getItem();
            if (item != null) {
                actionCallback.call(item);
            }
        });
    }

    public static <S> Callback<TableColumn<S, Void>, TableCell<S, Void>> forTableColumn(
            String buttonText, Callback<S, S> actionCallback) {
        return column -> new ActionButtonTableCell<>(buttonText, actionCallback);
    }

    @Override
    protected void updateItem(Void item, boolean empty) {
        super.updateItem(item, empty);
        if (empty) {
            setGraphic(null);
        } else {
            setGraphic(actionButton);
        }
    }
}
