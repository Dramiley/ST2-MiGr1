3. Wir mussten erstmal Maven installieren. Dies geschah indem wir die apache-maven-3.9.9-bin.zip runterluden, diese entpacken und den bin ordner in die Systemvariablen PATH hinzu.
Visual Studio bot eine automatische Funktion beim umwandeln der standalone Java Datei in ein Maven Projekt. Diese nutzen wir ;)
Um das Projekt zu kompelieren nutzen wir folgenden Befehl:
```cmd
mvn compile
```
Um den Testvorgang anzustoßen werden wir folgenden Befehl nutzen:
```cmd
mvn test compile
```