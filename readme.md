1.
GitHub Repo ist erfolgreich angelegt. Jedes Teammitglied ist eingeladen.

2.
Readme ist erfolgreich angelegt und Schritt 1 und 2 sind nachgetragen.

3.
Wir mussten erstmal Maven installieren. Dies geschah indem wir die apache-maven-3.9.9-bin.zip runterluden, diese entpacken und den bin ordner in die Systemvariablen PATH hinzu.
Visual Studio bot eine automatische Funktion beim umwandeln der standalone Java Datei in ein Maven Projekt. Diese nutzen wir ;)
Um das Projekt zu kompelieren nutzen wir folgenden Befehl:
```cmd
mvn compile
```
Um den Testvorgang anzustoßen werden wir folgenden Befehl nutzen:
```cmd
mvn test compile
```
4.
Wir haben eine dependencies für AssertJ und drei für JUnit 5 hinzugefügt, um flüssiges Testen zu ermöglichen und Assertions schreiben zu können
Ebenfalls haben wir uns dazu entschieden, für ein konstantes Testen zum Build-Cycle hinzuzufügen, dass automatisch getestet wird. Das heißt, dass bei folgendem Befehl auch gleichzeitig getestet wird:
```cmd
mvn package
```