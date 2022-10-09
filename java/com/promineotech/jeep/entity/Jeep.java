package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import java.util.Comparator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter

public class Jeep<modelPk> implements Comparable<Jeep> {
        private Long modelPK;
        private JeepModel modelId;
        private String trimLevel;
        private int numDoors;
        private int wheelSize;
        private BigDecimal basePrice;
        public static Object builder() {
        return null;
          }
        @JsonIgnore
        // @formatter:Off
public Long getModelPK() {
          // TODO Auto-generated method stub
          return modelPK;
          }
@SuppressWarnings("rawtypes")
@Override
public int compareTo(Jeep that) {
 return Comparator
      .comparing(Jeep::getModelId)
      .thenComparing(Jeep:: getTrimLevel)
      .thenComparing(Jeep:: getNumDoors)
      .compare(this,that);
  //@formatter:on

}

        // INSERT INTO models (model_id, trim_level, num_doors, wheel_size, base_price) VALUES('WRANGLER', 'Sport', 2, 17, 28475.00);
        // INSERT INTO models (model_id, trim_level, num_doors, wheel_size, base_price) VALUES('WRANGLER', 'Sport', 4, 17, 31975.00);

    
public Long setModelPk() {
  // TODO Auto-generated method stub
  return null;
}
public Object setModelPK(Object object) {
  // TODO Auto-generated method stub
  return null;
}
        }


