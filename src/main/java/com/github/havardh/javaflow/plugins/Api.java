package com.github.havardh.javaflow.plugins;

import static java.util.Collections.emptyMap;
import static java.util.Collections.singletonList;
import static java.util.Optional.ofNullable;

import java.util.List;
import java.util.Map;

import com.github.havardh.javaflow.plugins.exceptions.MissingPackageParameter;

public class Api {

  private String packageName;
  private List<String> suffixes;
  private String output;
  private Map<String, String> types;
  private Map<String, Boolean> verifications;

  public Api() {}

  public String getPackageName() {
    return ofNullable(packageName).orElseThrow(MissingPackageParameter::new);
  }

  public List<String> getSuffixes() {
    return ofNullable(suffixes).orElse(singletonList(".java"));
  }

  public String getOutput() {
    return ofNullable(output).orElse("flow.js");
  }

  public Map<String, String> getTypes() {
    return ofNullable(types).orElse(emptyMap());
  }

  public Map<String, Boolean> getVerifications() {
    return ofNullable(verifications).orElse(emptyMap());
  }
}
