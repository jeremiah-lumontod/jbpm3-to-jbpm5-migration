/**
 * StringParseException.java
 *
 * This file was generated by XMLSpy 2009sp1 Enterprise Edition.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the XMLSpy Documentation for further details.
 * http://www.altova.com/xmlspy
 */


package com.migration.types;


public class StringParseException extends SchemaTypeException {
  int position;

  public StringParseException(String text, int newposition) {
    super(text);
    position = newposition;
  }

  public StringParseException(Exception other) {
    super(other);
  }
}
