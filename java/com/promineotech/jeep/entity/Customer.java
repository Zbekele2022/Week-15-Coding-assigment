package com.promineotech.jeep.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
  private Long customerPK;
  private String customerId;
  private String firstName;
  private String lastName;
  private String phone;
  public static Object builder() {
    // TODO Auto-generated method stub
    return null;
  }
  public Object getCustomerPK() {
    // TODO Auto-generated method stub
    return null;
  }
}