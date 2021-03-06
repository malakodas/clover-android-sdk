/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
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

package com.clover.sdk.v3.remotemessage;

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getActivities activities}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class RetrieveCustomActivitiesResponseMessage extends com.clover.sdk.v3.remotemessage.Message {

  /**
   * Custom activities that met the request filtering requirements.
   */
  public java.util.List<com.clover.sdk.v3.custom.CustomActivity> getActivities() {
    return genClient.cacheGet(CacheKey.activities);
  }

  /**
   * The list of message types
   */
  @Override
  public com.clover.sdk.v3.remotemessage.Method getMethod() {
    return genClient.cacheGet(CacheKey.method);
  }

  /**
   * The version of this message
   */
  @Override
  public java.lang.Integer getVersion() {
    return genClient.cacheGet(CacheKey.version);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<RetrieveCustomActivitiesResponseMessage> {
    activities {
      @Override
      public Object extractValue(RetrieveCustomActivitiesResponseMessage instance) {
        return instance.genClient.extractListRecord("activities", com.clover.sdk.v3.custom.CustomActivity.JSON_CREATOR);
      }
    },
    method {
      @Override
      public Object extractValue(RetrieveCustomActivitiesResponseMessage instance) {
        return instance.genClient.extractEnum("method", com.clover.sdk.v3.remotemessage.Method.class);
      }
    },
    version {
      @Override
      public Object extractValue(RetrieveCustomActivitiesResponseMessage instance) {
        return instance.genClient.extractOther("version", java.lang.Integer.class);
      }
    },
      ;
  }

  private GenericClient<RetrieveCustomActivitiesResponseMessage> genClient;

  /**
  * Constructs a new empty instance.
  */
  public RetrieveCustomActivitiesResponseMessage() {
    super(false);
    genClient = new GenericClient<RetrieveCustomActivitiesResponseMessage>(this);
    this.setMethod(com.clover.sdk.v3.remotemessage.Method.RETRIEVE_CUSTOM_ACTIVITIES_RESPONSE);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected RetrieveCustomActivitiesResponseMessage(boolean noInit) {
    super(false);
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public RetrieveCustomActivitiesResponseMessage(String json) throws IllegalArgumentException {
    this();
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
  public RetrieveCustomActivitiesResponseMessage(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public RetrieveCustomActivitiesResponseMessage(RetrieveCustomActivitiesResponseMessage src) {
    this();
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

  /** Checks whether the 'activities' field is set and is not null */
  public boolean isNotNullActivities() {
    return genClient.cacheValueIsNotNull(CacheKey.activities);
  }

  /** Checks whether the 'activities' field is set and is not null and is not empty */
  public boolean isNotEmptyActivities() { return isNotNullActivities() && !getActivities().isEmpty(); }

  /** Checks whether the 'method' field is set and is not null */
  @Override
  public boolean isNotNullMethod() {
    return genClient.cacheValueIsNotNull(CacheKey.method);
  }

  /** Checks whether the 'version' field is set and is not null */
  @Override
  public boolean isNotNullVersion() {
    return genClient.cacheValueIsNotNull(CacheKey.version);
  }



  /** Checks whether the 'activities' field has been set, however the value could be null */
  public boolean hasActivities() {
    return genClient.cacheHasKey(CacheKey.activities);
  }

  /** Checks whether the 'method' field has been set, however the value could be null */
  @Override
  public boolean hasMethod() {
    return genClient.cacheHasKey(CacheKey.method);
  }

  /** Checks whether the 'version' field has been set, however the value could be null */
  @Override
  public boolean hasVersion() {
    return genClient.cacheHasKey(CacheKey.version);
  }


  /**
   * Sets the field 'activities'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public RetrieveCustomActivitiesResponseMessage setActivities(java.util.List<com.clover.sdk.v3.custom.CustomActivity> activities) {
    return genClient.setArrayRecord(activities, CacheKey.activities);
  }

  /**
   * Sets the field 'method'.
   */
  @Override
  public Message setMethod(com.clover.sdk.v3.remotemessage.Method method) {
    return genClient.setOther(method, CacheKey.method);
  }

  /**
   * Sets the field 'version'.
   */
  @Override
  public Message setVersion(java.lang.Integer version) {
    return genClient.setOther(version, CacheKey.version);
  }


  /** Clears the 'activities' field, the 'has' method for this field will now return false */
  public void clearActivities() {
    genClient.clear(CacheKey.activities);
  }
  /** Clears the 'method' field, the 'has' method for this field will now return false */
  @Override
  public void clearMethod() {
    genClient.clear(CacheKey.method);
  }
  /** Clears the 'version' field, the 'has' method for this field will now return false */
  @Override
  public void clearVersion() {
    genClient.clear(CacheKey.version);
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
  public RetrieveCustomActivitiesResponseMessage copyChanges() {
    RetrieveCustomActivitiesResponseMessage copy = new RetrieveCustomActivitiesResponseMessage();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(RetrieveCustomActivitiesResponseMessage src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new RetrieveCustomActivitiesResponseMessage(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<RetrieveCustomActivitiesResponseMessage> CREATOR = new android.os.Parcelable.Creator<RetrieveCustomActivitiesResponseMessage>() {
    @Override
    public RetrieveCustomActivitiesResponseMessage createFromParcel(android.os.Parcel in) {
      RetrieveCustomActivitiesResponseMessage instance = new RetrieveCustomActivitiesResponseMessage(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public RetrieveCustomActivitiesResponseMessage[] newArray(int size) {
      return new RetrieveCustomActivitiesResponseMessage[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<RetrieveCustomActivitiesResponseMessage> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<RetrieveCustomActivitiesResponseMessage>() {
    @Override
    public RetrieveCustomActivitiesResponseMessage create(org.json.JSONObject jsonObject) {
      return new RetrieveCustomActivitiesResponseMessage(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ACTIVITIES_IS_REQUIRED = false;
    public static final boolean METHOD_IS_REQUIRED = false;
    public static final boolean VERSION_IS_REQUIRED = false;

  }

}
