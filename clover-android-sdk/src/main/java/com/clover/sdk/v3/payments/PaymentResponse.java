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
public final class PaymentResponse implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.Boolean getRequestSuccessful() {
    return genClient.cacheGet(CacheKey.requestSuccessful);
  }
  public java.lang.String getResponseErrorMessage() {
    return genClient.cacheGet(CacheKey.responseErrorMessage);
  }
  public com.clover.sdk.v3.payments.Payment getPayment() {
    return genClient.cacheGet(CacheKey.payment);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<PaymentResponse> {
    requestSuccessful {
      @Override
      public Object extractValue(PaymentResponse instance) {
        return instance.genClient.extractOther("requestSuccessful", java.lang.Boolean.class);
      }
    },
    responseErrorMessage {
      @Override
      public Object extractValue(PaymentResponse instance) {
        return instance.genClient.extractOther("responseErrorMessage", java.lang.String.class);
      }
    },
    payment {
      @Override
      public Object extractValue(PaymentResponse instance) {
        return instance.genClient.extractRecord("payment", com.clover.sdk.v3.payments.Payment.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<PaymentResponse> genClient = new GenericClient<PaymentResponse>(this);

  /**
   * Constructs a new empty instance.
   */
  public PaymentResponse() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PaymentResponse(String json) throws IllegalArgumentException {
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
  public PaymentResponse(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PaymentResponse(PaymentResponse src) {
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
  }

  /** Checks whether the 'requestSuccessful' field is set and is not null */
  public boolean isNotNullRequestSuccessful() {
    return genClient.cacheValueIsNotNull(CacheKey.requestSuccessful);
  }

  /** Checks whether the 'responseErrorMessage' field is set and is not null */
  public boolean isNotNullResponseErrorMessage() {
    return genClient.cacheValueIsNotNull(CacheKey.responseErrorMessage);
  }

  /** Checks whether the 'payment' field is set and is not null */
  public boolean isNotNullPayment() {
    return genClient.cacheValueIsNotNull(CacheKey.payment);
  }


  /** Checks whether the 'requestSuccessful' field has been set, however the value could be null */
  public boolean hasRequestSuccessful() {
    return genClient.cacheHasKey(CacheKey.requestSuccessful);
  }

  /** Checks whether the 'responseErrorMessage' field has been set, however the value could be null */
  public boolean hasResponseErrorMessage() {
    return genClient.cacheHasKey(CacheKey.responseErrorMessage);
  }

  /** Checks whether the 'payment' field has been set, however the value could be null */
  public boolean hasPayment() {
    return genClient.cacheHasKey(CacheKey.payment);
  }


  /**
   * Sets the field 'requestSuccessful'.
   */
  public PaymentResponse setRequestSuccessful(java.lang.Boolean requestSuccessful) {
    return genClient.setOther(requestSuccessful, CacheKey.requestSuccessful);
  }

  /**
   * Sets the field 'responseErrorMessage'.
   */
  public PaymentResponse setResponseErrorMessage(java.lang.String responseErrorMessage) {
    return genClient.setOther(responseErrorMessage, CacheKey.responseErrorMessage);
  }

  /**
   * Sets the field 'payment'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentResponse setPayment(com.clover.sdk.v3.payments.Payment payment) {
    return genClient.setRecord(payment, CacheKey.payment);
  }


  /** Clears the 'requestSuccessful' field, the 'has' method for this field will now return false */
  public void clearRequestSuccessful() {
    genClient.clear(CacheKey.requestSuccessful);
  }
  /** Clears the 'responseErrorMessage' field, the 'has' method for this field will now return false */
  public void clearResponseErrorMessage() {
    genClient.clear(CacheKey.responseErrorMessage);
  }
  /** Clears the 'payment' field, the 'has' method for this field will now return false */
  public void clearPayment() {
    genClient.clear(CacheKey.payment);
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
  public PaymentResponse copyChanges() {
    PaymentResponse copy = new PaymentResponse();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PaymentResponse src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PaymentResponse(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<PaymentResponse> CREATOR = new android.os.Parcelable.Creator<PaymentResponse>() {
    @Override
    public PaymentResponse createFromParcel(android.os.Parcel in) {
      PaymentResponse instance = new PaymentResponse(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PaymentResponse[] newArray(int size) {
      return new PaymentResponse[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PaymentResponse> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PaymentResponse>() {
    @Override
    public PaymentResponse create(org.json.JSONObject jsonObject) {
      return new PaymentResponse(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean REQUESTSUCCESSFUL_IS_REQUIRED = false;

    public static final boolean RESPONSEERRORMESSAGE_IS_REQUIRED = false;

    public static final boolean PAYMENT_IS_REQUIRED = false;

  }

}
