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

public class displayClubFX {
    public void displayClubOnAction(){

        AnchorPane W1789994_anchPane = new AnchorPane();
        W1789994_anchPane.setId("W1789994_anchPane");



        //W1789994_Table
        TableView<SportsClub> W1789994_table = new TableView<>();
        W1789994_table.setId("W1789994_table");

        TableColumn<SportsClub, String> W1789994_IDColumn = new TableColumn<>("Club ID");
        W1789994_IDColumn.setCellValueFactory(new PropertyValueFactory<>("clubID"));
        W1789994_IDColumn.setMinWidth(100);

        TableColumn<SportsClub, String> W1789994_nameColumn = new TableColumn<>("Club Name");
        W1789994_nameColumn.setCellValueFactory(new PropertyValueFactory<>("clubName"));
        W1789994_nameColumn.setMinWidth(150);

        TableColumn<SportsClub, String> W1789994_winsCol = new TableColumn<>("Club Wins");
        W1789994_winsCol.setCellValueFactory(new PropertyValueFactory<>(""));
        W1789994_winsCol.setMinWidth(100);
        W1789994_winsCol.setCellValueFactory(new Callback<CellDataFeatures<SportsClub, String>, ObservableValue<String>>() {



            public ObservableValue<String> call(TableColumn.CellDataFeatures<SportsClub, String> param) {
                if (param.getValue() instanceof SportsClub) {
                    return new ObservableValue<String>() {

                        public void addListener(InvalidationListener listener) {}

                        @Override
                        public void removeListener(InvalidationListener listener) {}

                        @Override
                        public void addListener(ChangeListener<? super String> listener) {}

                        @Override
                        public void removeListener(ChangeListener<? super String> listener) {}

                        @Override
                        public String getValue() {
                            return String.valueOf(param.getValue().getClubStatistics().getWinCount());
                        }
                    };
                }
                return null;
            }
            });

        TableColumn<SportsClub, String> W1789994_losesCol = new TableColumn<>("Club Loses");
        W1789994_losesCol.setCellValueFactory(new PropertyValueFactory<>(""));
        W1789994_losesCol.setMinWidth(100);
        W1789994_losesCol.setCellValueFactory(new Callback<CellDataFeatures<SportsClub, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<SportsClub, String> param) {
                if (param.getValue() instanceof SportsClub) {
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
                            return String.valueOf(param.getValue().getClubStatistics().getLossCount());
                        }
                    };
                }
                return null;
            }
        });

        TableColumn<SportsClub, String> W1789994_drawCol = new TableColumn<>("Club Ties");
        W1789994_drawCol.setCellValueFactory(new PropertyValueFactory<>(""));
        W1789994_drawCol.setMinWidth(100);
        W1789994_drawCol.setCellValueFactory(new Callback<CellDataFeatures<SportsClub, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<SportsClub, String> param) {
                if (param.getValue() instanceof SportsClub) {
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
                            return String.valueOf(param.getValue().getClubStatistics().getDrawCount());
                        }
                    };
                }
                return null;
            }
        });

        TableColumn<SportsClub, String> goalsColumn = new TableColumn<>("Club Goals");
        goalsColumn.setCellValueFactory(new PropertyValueFactory<>(""));
        goalsColumn.setMinWidth(100);
        goalsColumn.setCellValueFactory(new Callback<CellDataFeatures<SportsClub, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<SportsClub, String> param) {
                if (param.getValue() instanceof SportsClub) {
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
                            return String.valueOf(param.getValue().getClubStatistics().getGoalsScored());
                        }
                    };
                }
                return null;
            }
        });

        TableColumn<SportsClub, String> pointsColumn = new TableColumn<>("Club Points");
        pointsColumn.setCellValueFactory(new PropertyValueFactory<>(""));
        pointsColumn.setMinWidth(100);
        pointsColumn.setCellValueFactory(new Callback<CellDataFeatures<SportsClub, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<SportsClub, String> param) {
                if (param.getValue() instanceof SportsClub) {
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
                            return String.valueOf(param.getValue().getClubStatistics().getClubPoints());
                        }
                    };
                }
                return null;
            }
        });

        TableColumn<SportsClub, String> receivedColumn = new TableColumn<>("Goals Received");
        receivedColumn.setCellValueFactory(new PropertyValueFactory<>(""));
        receivedColumn.setMinWidth(100);
        receivedColumn.setCellValueFactory(new Callback<CellDataFeatures<SportsClub, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<SportsClub, String> param) {
                if (param.getValue() instanceof SportsClub) {
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
                            return String.valueOf(param.getValue().getClubStatistics().getGoalsReceived());
                        }
                    };
                }
                return null;
            }
        });

        W1789994_table.getColumns().add(W1789994_IDColumn);
        W1789994_table.getColumns().add(W1789994_nameColumn);
        W1789994_table.getColumns().add(pointsColumn);
        W1789994_table.getColumns().add(W1789994_winsCol);
        W1789994_table.getColumns().add(W1789994_drawCol);
        W1789994_table.getColumns().add(W1789994_losesCol);
        W1789994_table.getColumns().add(goalsColumn);
        W1789994_table.getColumns().add(receivedColumn);

        W1789994_table.setLayoutY(60);

        TextField searchBar = new TextField();
        searchBar.setId("searchBar");
        searchBar.setPromptText("Search");
        searchBar.setLayoutY(10);
        searchBar.setLayoutX(20);

        ObservableList<SportsClub> SportsClubObservableList = FXCollections.observableArrayList();
        PremierLeagueManager.clubList.sort(new CompareStat().reversed());
        SportsClubObservableList.addAll(PremierLeagueManager.clubList);

        FilteredList<SportsClub> memberFilteredList = new FilteredList<>(SportsClubObservableList, s -> true);
        searchBar.textProperty().addListener((observable, oldValue, newValue) -> memberFilteredList.setPredicate(SportsClub -> {
            if (newValue == null || newValue.isEmpty()) return true;
                return SportsClub.getW1789994_clubName().toLowerCase().contains(newValue.toLowerCase());
        }));
        SortedList<SportsClub> SportsClubSortedList = new SortedList<>(memberFilteredList);
        SportsClubSortedList.comparatorProperty().bind(W1789994_table.comparatorProperty());

        W1789994_table.setItems(SportsClubSortedList);
        W1789994_anchPane.getChildren().addAll(searchBar, W1789994_table);
        Scene scene = new Scene(W1789994_anchPane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }




}

