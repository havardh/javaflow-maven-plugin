package com.github.havardh.javaflow.plugins.exceptions;

import static java.lang.String.format;

public class PackageDirectoryNotFound extends RuntimeException {

  public PackageDirectoryNotFound(String packageName, String folder) {
    super(format(
        "Base directory for package '%s' was not found. \n" +
        "Expected to find it here: %s",
        packageName,
        folder
    ));
  }

}
