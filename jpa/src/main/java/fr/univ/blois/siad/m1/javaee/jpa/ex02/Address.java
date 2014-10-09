package fr.univ.blois.siad.m1.javaee.jpa.ex02;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author: François Robert
 */
@Entity
public class Address {

  @Id
  private long id;

  public Address() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
