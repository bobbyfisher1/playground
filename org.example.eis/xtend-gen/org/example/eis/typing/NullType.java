package org.example.eis.typing;

import org.example.eis.typing.DefineType;

@SuppressWarnings("all")
public class NullType implements DefineType {
  @Override
  public String toString() {
    return "null";
  }
}
