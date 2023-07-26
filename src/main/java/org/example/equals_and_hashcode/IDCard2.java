package org.example.equals_and_hashcode;

public class IDCard2 extends IDCard{

  public IDCard2(String owner) {
    super(owner);
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public int hashCode() {
    return this.owner.hashCode();
  }
}
