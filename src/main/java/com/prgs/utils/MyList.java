package com.prgs.utils;

import java.util.ArrayList;
import java.util.List;

public class MyList<TV> {
  List<TV> variables;

  public MyList() {
    variables = new ArrayList<>();
  }

  void add(TV str) {
    variables.add(str);
  }

  TV get(int i) {
    return variables.get(i);
  }

  public static void main(String[] args) {

    MyList<String> sArray = new MyList<>();
    sArray.add("SEF");
    MyList<Integer> intArray = new MyList<>();
    intArray.add(10);
  }
}
