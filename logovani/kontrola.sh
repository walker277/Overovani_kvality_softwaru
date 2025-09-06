#!/bin/bash
rm oks-01-log*.txt
clear
javac -d . -cp log4j-api-2.11.1.jar:log4j-core-2.11.1.jar:. -encoding UTF-8 src/oks01/*.java

java -cp log4j-api-2.11.1.jar:log4j-core-2.11.1.jar:. oks01.Hlavni neexistujici.txt fav
java -cp log4j-api-2.11.1.jar:log4j-core-2.11.1.jar:. oks01.Hlavni priklady-oks-01-2.txt fav
java -cp log4j-api-2.11.1.jar:log4j-core-2.11.1.jar:. oks01.Hlavni priklady-oks-01-1.txt fav
