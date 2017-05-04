package com.github.havardh.javaflow.plugins;

import java.util.List;
import java.util.Map;

public class Api {

  private String packageName;
  private List<String> suffixes;
  private String output;
  private Map<String, String> types;

  public Api() {}

  public String getPackageName() {
    return packageName;
  }

  public List<String> getSuffixes() {
    return suffixes;
  }

  public String getOutput() {
    return output;
  }

  public Map<String, String> getTypes() {
    return types;
  }
}
