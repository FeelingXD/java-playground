package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Day{
  MONDAY("월요일"),
  TUESDAY("화요일");
  public String name;
  public void setName(String name){
    this.name=name;
  }

}