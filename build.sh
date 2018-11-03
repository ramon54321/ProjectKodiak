#!/usr/bin/env bash

echo 'Compiling...'

mvn -q package

if [[ $? != 0 ]];
then
  exit 1
fi

echo
echo
java -jar target/app-1.0-jar-with-dependencies.jar
echo
echo