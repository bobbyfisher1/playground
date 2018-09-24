package org.xtext.eis.typing.types;

import org.xtext.eis.typing.EisType;

@SuppressWarnings("all")
public class NullType implements EisType {
  @Override
  public String toString() {
    return "null";
  }
}
