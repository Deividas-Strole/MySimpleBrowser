module com.visitormaker.mysimplebrowser {
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.web;

    opens com.visitormaker.mysimplebrowser to javafx.fxml;
    exports com.visitormaker.mysimplebrowser;
}