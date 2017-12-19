package com.github.havardh.javaflow.plugins.exceptions;

public class MissingPackageParameter extends RuntimeException {

  /**
   * Create exception for missing package parameter
   */
  public MissingPackageParameter() {
    super("Missing parameter apis.api.packageName");
  }
}
