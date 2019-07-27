package library;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BorrowerListData {

    private final ObservableList<Borrower> data
            = FXCollections.observableArrayList();

    public ObservableList<Borrower> getData() {
        return data;
    }

    public BorrowerListData() {

    }

}
