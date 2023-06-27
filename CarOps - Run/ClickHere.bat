@echo off
set PATH=lib\javafx-sdk-20.0.1\bin;%PATH%
start "" javaw --module-path "lib\javafx-sdk-20.0.1\lib" --add-modules javafx.controls,javafx.graphics,javafx.fxml -jar execute.jar
