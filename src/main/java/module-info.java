module hu.vtg {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens hu.vtg to javafx.fxml;
    exports hu.vtg;
}
