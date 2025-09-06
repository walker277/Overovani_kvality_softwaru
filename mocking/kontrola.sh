#!/bin/bash

# Kompilace
javac -d . -cp "apiguardian-api-1.0.0.jar:byte-buddy-1.9.7.jar:byte-buddy-agent-1.9.7.jar:hamcrest-core-1.3.jar:junit-jupiter-api-5.3.2.jar:junit-jupiter-engine-5.3.2.jar:junit-jupiter-params-5.3.2.jar:junit-platform-commons-1.3.2.jar:junit-platform-engine-1.3.2.jar:junit-platform-launcher-1.3.2.jar:junit-platform-runner-1.3.2.jar:junit-platform-suite-api-1.3.2.jar:mockito-core-2.24.0.jar:mockito-junit-jupiter-2.24.0.jar:objenesis-2.6.jar:opentest4j-1.1.1.jar:." -encoding UTF-8 test/oks04/*.java

# Spuštění
java -cp "apiguardian-api-1.0.0.jar:byte-buddy-1.9.7.jar:byte-buddy-agent-1.9.7.jar:hamcrest-core-1.3.jar:junit-jupiter-api-5.3.2.jar:junit-jupiter-engine-5.3.2.jar:junit-jupiter-params-5.3.2.jar:junit-platform-commons-1.3.2.jar:junit-platform-engine-1.3.2.jar:junit-platform-launcher-1.3.2.jar:junit-platform-runner-1.3.2.jar:junit-platform-suite-api-1.3.2.jar:mockito-core-2.24.0.jar:mockito-junit-jupiter-2.24.0.jar:objenesis-2.6.jar:opentest4j-1.1.1.jar:." oks04.Kontrola_Prj_04

