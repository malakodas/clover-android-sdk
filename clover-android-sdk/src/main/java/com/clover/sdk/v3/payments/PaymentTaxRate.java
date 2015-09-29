/**
 * Copyright (C) 2015 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class PaymentTaxRate implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }
  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }
  public java.lang.Long getRate() {
    return genClient.cacheGet(CacheKey.rate);
  }
  public java.lang.Boolean getIsDefault() {
    return genClient.cacheGet(CacheKey.isDefault);
  }
  public java.lang.Long getTaxableAmount() {
    return genClient.cacheGet(CacheKey.taxableAmount);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<PaymentTaxRate> {
    id {
      @Override
      public Object extractValue(PaymentTaxRate instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    name {
      @Override
      public Object extractValue(PaymentTaxRate instance) {
        return instance.genClient.extractOther("name", java.lang.String.class);
      }
    },
    rate {
      @Override
      public Object extractValue(PaymentTaxRate instance) {
        return instance.genClient.extractOther("rate", java.lang.Long.class);
      }
    },
    isDefault {
      @Override
      public Object extractValue(PaymentTaxRate instance) {
        return instance.genClient.extractOther("isDefault", java.lang.Boolean.class);
      }
    },
    taxableAmount {
      @Override
      public Object extractValue(PaymentTaxRate instance) {
        return instance.genClient.extractOther("taxableAmount", java.lang.Long.class);
      }
    },
    ;
  }

  private GenericClient<PaymentTaxRate> genClient = new GenericClient<PaymentTaxRate>(this);

  /**
   * Constructs a new empty instance.
   */
  public PaymentTaxRate() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PaymentTaxRate(String json) throws IllegalArgumentException {
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public PaymentTaxRate(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PaymentTaxRate(PaymentTaxRate src) {
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }


  @Override
  public void validate() {
    genClient.validateLength(getId(), 13);

    genClient.validateNull(getName(), "name");
    genClient.validateLength(getName(), 127);

    genClient.validateNull(getRate(), "rate");
    if (getRate() != null && ( getRate() < 0)) throw new IllegalArgumentException("Invalid value for 'getRate()'");

    genClient.validateNull(getTaxableAmount(), "taxableAmount");
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'rate' field is set and is not null */
  public boolean isNotNullRate() {
    return genClient.cacheValueIsNotNull(CacheKey.rate);
  }

  /** Checks whether the 'isDefault' field is set and is not null */
  public boolean isNotNullIsDefault() {
    return genClient.cacheValueIsNotNull(CacheKey.isDefault);
  }

  /** Checks whether the 'taxableAmount' field is set and is not null */
  public boolean isNotNullTaxableAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.taxableAmount);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'rate' field has been set, however the value could be null */
  public boolean hasRate() {
    return genClient.cacheHasKey(CacheKey.rate);
  }

  /** Checks whether the 'isDefault' field has been set, however the value could be null */
  public boolean hasIsDefault() {
    return genClient.cacheHasKey(CacheKey.isDefault);
  }

  /** Checks whether the 'taxableAmount' field has been set, however the value could be null */
  public boolean hasTaxableAmount() {
    return genClient.cacheHasKey(CacheKey.taxableAmount);
  }


  /**
   * Sets the field 'id'.
   */
  public PaymentTaxRate setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'name'.
   */
  public PaymentTaxRate setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'rate'.
   */
  public PaymentTaxRate setRate(java.lang.Long rate) {
    return genClient.setOther(rate, CacheKey.rate);
  }

  /**
   * Sets the field 'isDefault'.
   */
  public PaymentTaxRate setIsDefault(java.lang.Boolean isDefault) {
    return genClient.setOther(isDefault, CacheKey.isDefault);
  }

  /**
   * Sets the field 'taxableAmount'.
   */
  public PaymentTaxRate setTaxableAmount(java.lang.Long taxableAmount) {
    return genClient.setOther(taxableAmount, CacheKey.taxableAmount);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'rate' field, the 'has' method for this field will now return false */
  public void clearRate() {
    genClient.clear(CacheKey.rate);
  }
  /** Clears the 'isDefault' field, the 'has' method for this field will now return false */
  public void clearIsDefault() {
    genClient.clear(CacheKey.isDefault);
  }
  /** Clears the 'taxableAmount' field, the 'has' method for this field will now return false */
  public void clearTaxableAmount() {
    genClient.clear(CacheKey.taxableAmount);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public PaymentTaxRate copyChanges() {
    PaymentTaxRate copy = new PaymentTaxRate();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PaymentTaxRate src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PaymentTaxRate(src).getJSONObject(), src.genClient);
    }
  }

  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    return genClient.getBundle();
  }

  @Override
  public String toString() {
    return genClient.toString();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    genClient.writeToParcel(dest, flags);
  }

  public static final android.os.Parcelable.Creator<PaymentTaxRate> CREATOR = new android.os.Parcelable.Creator<PaymentTaxRate>() {
    @Override
    public PaymentTaxRate createFromParcel(android.os.Parcel in) {
      PaymentTaxRate instance = new PaymentTaxRate(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PaymentTaxRate[] newArray(int size) {
      return new PaymentTaxRate[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PaymentTaxRate> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PaymentTaxRate>() {
    @Override
    public PaymentTaxRate create(org.json.JSONObject jsonObject) {
      return new PaymentTaxRate(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 127;

    public static final boolean RATE_IS_REQUIRED = true;
    public static final long RATE_MIN = 0;

    public static final boolean ISDEFAULT_IS_REQUIRED = false;

    public static final boolean TAXABLEAMOUNT_IS_REQUIRED = true;

  }

}
