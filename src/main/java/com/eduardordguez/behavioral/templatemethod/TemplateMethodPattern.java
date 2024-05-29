package com.eduardordguez.behavioral.templatemethod;

/**
 * `Template Method` is a behavioral design pattern that defines the skeleton of an algorithm in
 * the superclass but lets subclasses override specific steps of the algorithm without changing
 * its structure.
 */
public class TemplateMethodPattern {

  public static void main(String[] args) {
    DataProcessor csvDataProcessor = new CsvDataProcessor();
    csvDataProcessor.process();

    DataProcessor xmlDataProcessor = new XmlDataProcessor();
    xmlDataProcessor.process();
  }

}
