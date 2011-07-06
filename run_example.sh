#!/bin/bash
ant jar
javac -cp output/* Hist4jExample.java
java -cp .:output/hist4j-trunk.jar Hist4jExample
