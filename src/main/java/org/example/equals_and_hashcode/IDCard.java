package org.example.equals_and_hashcode;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class IDCard {
  String owner;

  @Override
  public boolean equals(Object obj) {
    if (this==obj){
      return true;
    }
    if (obj instanceof IDCard){
      return this.owner.equals(((IDCard) obj).owner);
    }
    return false;
  }
}
