package com.haponenka.app.factory;

import com.haponenka.app.entity.CustomArray;
import com.haponenka.app.exception.CustomArrayException;

public class CustomArrayFactory {

  public CustomArray createCustomArray(int[] elements) throws CustomArrayException {
    if (elements != null) {
      return new CustomArray(elements);
    } else {
      throw new CustomArrayException("Cannot create CustomArray from null array");
    }
  }
}
