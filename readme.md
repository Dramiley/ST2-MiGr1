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

5. 
Wir haben uns mit EclEmma und JaCoCo vertraut gemacht und herausgefunden, dass es sich um ein gemeinsames Plugin handelt, welches die Codeabdeckung des Programms trackt und Feedback dazu gibt. Wir haben uns in Visual Studio Code die Extension "Koverage" installiert, um die JaCoCo Auswertung im IDE zu sehen. Außerdem kann man die Auswertung auf einer ausgegebenen html Website anzeigen. 
Um JaCoCo in Maven zu konfigurieren haben wir ein weiteres Plugin hinzugefügt. 

Die Art der Codeabdeckung bei JaCoCo ist einerseits die Line-Coverage (Linienabdeckung) die einzelne Zeilen überprüft und die Branch-Coverage, die zudem auch einzelne if/else-Statements abdecken kann. Man kann JaCoCo in dem Sinne der Ergebnisausgabe konfigurieren, wir haben uns wie oben genannt für eine html basirte Ausgabe entschieden.

6. 
Wir haben eine weitere dependency für die JUnit TestSuite hinzugefügteine TestSuite erstellt und die Testklassen implementiert. Außerdem habne wir getestet ob der command "mvn compile" uns ausgibt, dass die Tests fehlschlagen, was sich bewahrheitete.
Eine 