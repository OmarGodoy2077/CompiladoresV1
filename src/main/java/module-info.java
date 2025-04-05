module com.example.compi {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.antlr.antlr4.runtime;
    requires java.desktop;
    requires antlr4;


    opens com.example.compi to javafx.fxml;
    exports com.example.compi;
}