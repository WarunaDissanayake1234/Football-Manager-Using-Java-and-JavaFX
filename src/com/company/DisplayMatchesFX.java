package com.company;

import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;

public class DisplayMatchesFX {
    public void displayMatches(){

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setId("anchorPane");

        TableView<Match> table = new TableView<>();
        table.setId("table");

        TableColumn<Match, String> IDColumn = new TableColumn<>("Home Team");
        IDColumn.setCellValueFactory(new PropertyValueFactory<>(""));
        IDColumn.setMinWidth(100);
        IDColumn.setCellValueFactory(new Callback<CellDataFeatures<Match, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Match, String> param) {
                if (param.getValue() instanceof Match) {
                    return new ObservableValue<String>() {
                        @Override
                        public void addListener(InvalidationListener listener) {}

                        @Override
                        public void removeListener(InvalidationListener listener) {}

                        @Override
                        public void addListener(ChangeListener<? super String> listener) {}

                        @Override
                        public void removeListener(ChangeListener<? super String> listener) {}

                        @Override
                        public String getValue() {
                            return String.valueOf(param.getValue().getClubOne().getW1789994_clubName());
                        }
                    };
                }
                return null;
            }
        });
        TableColumn<Match, String> nameColumn = new TableColumn<>("Away Team");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>(""));
        nameColumn.setMinWidth(150);
        nameColumn.setCellValueFactory(new Callback<CellDataFeatures<Match, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Match, String> param) {
                if (param.getValue() instanceof Match) {
                    return new ObservableValue<String>() {
                        @Override
                        public void addListener(InvalidationListener listener) {}

                        @Override
                        public void removeListener(InvalidationListener listener) {}

                        @Override
                        public void addListener(ChangeListener<? super String> listener) {}

                        @Override
                        public void removeListener(ChangeListener<? super String> listener) {}

                        @Override
                        public String getValue() {
                            return String.valueOf(param.getValue().getClubTwo().getW1789994_clubName());
                        }
                    };
                }
                return null;
            }
        });
        TableColumn<Match, String> winsColumn = new TableColumn<>("Goals By Home Team");
        winsColumn.setCellValueFactory(new PropertyValueFactory<>(""));
        winsColumn.setMinWidth(100);
        winsColumn.setCellValueFactory(new Callback<CellDataFeatures<Match, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Match, String> param) {
                if (param.getValue() instanceof Match) {
                    return new ObservableValue<String>() {
                        @Override
                        public void addListener(InvalidationListener listener) {}

                        @Override
                        public void removeListener(InvalidationListener listener) {}

                        @Override
                        public void addListener(ChangeListener<? super String> listener) {}

                        @Override
                        public void removeListener(ChangeListener<? super String> listener) {}

                        @Override
                        public String getValue() {
                            return String.valueOf(param.getValue().getClubOneGoalsScored());
                        }
                    };
                }
                return null;
            }
        });

        TableColumn<Match, String> losesColumn = new TableColumn<>("Goals By Away Team");
        losesColumn.setCellValueFactory(new PropertyValueFactory<>(""));
        losesColumn.setMinWidth(100);
        losesColumn.setCellValueFactory(new Callback<CellDataFeatures<Match, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Match, String> param) {
                if (param.getValue() instanceof Match) {
                    return new ObservableValue<String>() {
                        @Override
                        public void addListener(InvalidationListener listener) {}

                        @Override
                        public void removeListener(InvalidationListener listener) {}

                        @Override
                        public void addListener(ChangeListener<? super String> listener) {}

                        @Override
                        public void removeListener(ChangeListener<? super String> listener) {}

                        @Override
                        public String getValue() {
                            return String.valueOf(param.getValue().getClubTwoGoalsScore());
                        }
                    };
                }
                return null;
            }
        });

        TableColumn<Match, String> dateColumn = new TableColumn<>("Match Date");
        dateColumn.setCellValueFactory(new PropertyValueFactory<>(""));
        dateColumn.setMinWidth(100);
        dateColumn.setCellValueFactory(new Callback<CellDataFeatures<Match, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Match, String> param) {
                if (param.getValue() instanceof Match) {
                    return new ObservableValue<String>() {
                        @Override
                        public void addListener(InvalidationListener listener) {}

                        @Override
                        public void removeListener(InvalidationListener listener) {}

                        @Override
                        public void addListener(ChangeListener<? super String> listener) {}

                        @Override
                        public void removeListener(ChangeListener<? super String> listener) {}

                        @Override
                        public String getValue() {
                            return String.valueOf(param.getValue().getDate().toString());
                        }
                    };
                }
                return null;
            }
        });

        table.getColumns().add(IDColumn);
        table.getColumns().add(nameColumn);
        table.getColumns().add(winsColumn);
        table.getColumns().add(losesColumn);
        table.getColumns().add(dateColumn);

        table.setLayoutY(50);

        TextField searchBar = new TextField();
        searchBar.setId("searchBar");
        searchBar.setPromptText("Search");
        searchBar.setLayoutY(10);

        ObservableList<Match> MatchObservableList = FXCollections.observableArrayList();
        PremierLeagueManager.matchList.sort(new MonthComparator().reversed());
        MatchObservableList.addAll(PremierLeagueManager.matchList);

        FilteredList<Match> memberFilteredList = new FilteredList<>(MatchObservableList, s -> true);
        searchBar.textProperty().addListener((observable, oldValue, newValue) -> memberFilteredList.setPredicate(Match -> {
            if (newValue == null || newValue.isEmpty()) return true;
            else if (Match.getDate().toString().equals(newValue)) return true;
            return Match.getClubOne().getW1789994_clubName().toLowerCase().contains(newValue.toLowerCase());
        }));
        SortedList<Match> MatchSortedList = new SortedList<>(memberFilteredList);
        MatchSortedList.comparatorProperty().bind(table.comparatorProperty());

        table.setItems(MatchSortedList);
        anchorPane.getChildren().addAll(searchBar, table);
        Scene scene = new Scene(anchorPane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }


}

