module co.edu.poli.actividad1_1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.poli.actividad1_1 to javafx.fxml;
    exports co.edu.poli.actividad1_1;
}
