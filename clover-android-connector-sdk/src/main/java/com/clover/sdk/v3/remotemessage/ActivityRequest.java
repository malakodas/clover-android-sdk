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
 * <li>{@link #getAction action}</li>
 * <li>{@link #getPayload payload}</li>
 * <li>{@link #getNonBlocking nonBlocking}</li>
 * <li>{@link #getForceLaunch forceLaunch}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class ActivityRequest extends com.clover.sdk.v3.remotemessage.Message {

  /**
   * The name of the action for this activity
   */
  public java.lang.String getAction() {
    return genClient.cacheGet(CacheKey.action);
  }

  /**
   * Data for this activity
   */
  public java.lang.String getPayload() {
    return genClient.cacheGet(CacheKey.payload);
  }

  /**
   * If true, then the activity can be stopped in regular execution.
   */
  public java.lang.Boolean getNonBlocking() {
    return genClient.cacheGet(CacheKey.nonBlocking);
  }

  /**
   * If true, then the activity will cancel other activity and run.  This includes payment activity.
   */
  public java.lang.Boolean getForceLaunch() {
    return genClient.cacheGet(CacheKey.forceLaunch);
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




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<ActivityRequest> {
    action {
      @Override
      public Object extractValue(ActivityRequest instance) {
        return instance.genClient.extractOther("action", java.lang.String.class);
      }
    },
    payload {
      @Override
      public Object extractValue(ActivityRequest instance) {
        return instance.genClient.extractOther("payload", java.lang.String.class);
      }
    },
    nonBlocking {
      @Override
      public Object extractValue(ActivityRequest instance) {
        return instance.genClient.extractOther("nonBlocking", java.lang.Boolean.class);
      }
    },
    forceLaunch {
      @Override
      public Object extractValue(ActivityRequest instance) {
        return instance.genClient.extractOther("forceLaunch", java.lang.Boolean.class);
      }
    },
    method {
      @Override
      public Object extractValue(ActivityRequest instance) {
        return instance.genClient.extractEnum("method", com.clover.sdk.v3.remotemessage.Method.class);
      }
    },
    version {
      @Override
      public Object extractValue(ActivityRequest instance) {
        return instance.genClient.extractOther("version", java.lang.Integer.class);
      }
    },
      ;
  }

  private GenericClient<ActivityRequest> genClient;

  /**
  * Constructs a new empty instance.
  */
  public ActivityRequest() {
    super(false);
    genClient = new GenericClient<ActivityRequest>(this);
    this.setMethod(com.clover.sdk.v3.remotemessage.Method.ACTIVITY_REQUEST);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected ActivityRequest(boolean noInit) {
    super(false);
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public ActivityRequest(String json) throws IllegalArgumentException {
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
  public ActivityRequest(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public ActivityRequest(ActivityRequest src) {
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

  /** Checks whether the 'action' field is set and is not null */
  public boolean isNotNullAction() {
    return genClient.cacheValueIsNotNull(CacheKey.action);
  }

  /** Checks whether the 'payload' field is set and is not null */
  public boolean isNotNullPayload() {
    return genClient.cacheValueIsNotNull(CacheKey.payload);
  }

  /** Checks whether the 'nonBlocking' field is set and is not null */
  public boolean isNotNullNonBlocking() {
    return genClient.cacheValueIsNotNull(CacheKey.nonBlocking);
  }

  /** Checks whether the 'forceLaunch' field is set and is not null */
  public boolean isNotNullForceLaunch() {
    return genClient.cacheValueIsNotNull(CacheKey.forceLaunch);
  }

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



  /** Checks whether the 'action' field has been set, however the value could be null */
  public boolean hasAction() {
    return genClient.cacheHasKey(CacheKey.action);
  }

  /** Checks whether the 'payload' field has been set, however the value could be null */
  public boolean hasPayload() {
    return genClient.cacheHasKey(CacheKey.payload);
  }

  /** Checks whether the 'nonBlocking' field has been set, however the value could be null */
  public boolean hasNonBlocking() {
    return genClient.cacheHasKey(CacheKey.nonBlocking);
  }

  /** Checks whether the 'forceLaunch' field has been set, however the value could be null */
  public boolean hasForceLaunch() {
    return genClient.cacheHasKey(CacheKey.forceLaunch);
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
   * Sets the field 'action'.
   */
  public ActivityRequest setAction(java.lang.String action) {
    return genClient.setOther(action, CacheKey.action);
  }

  /**
   * Sets the field 'payload'.
   */
  public ActivityRequest setPayload(java.lang.String payload) {
    return genClient.setOther(payload, CacheKey.payload);
  }

  /**
   * Sets the field 'nonBlocking'.
   */
  public ActivityRequest setNonBlocking(java.lang.Boolean nonBlocking) {
    return genClient.setOther(nonBlocking, CacheKey.nonBlocking);
  }

  /**
   * Sets the field 'forceLaunch'.
   */
  public ActivityRequest setForceLaunch(java.lang.Boolean forceLaunch) {
    return genClient.setOther(forceLaunch, CacheKey.forceLaunch);
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


  /** Clears the 'action' field, the 'has' method for this field will now return false */
  public void clearAction() {
    genClient.clear(CacheKey.action);
  }
  /** Clears the 'payload' field, the 'has' method for this field will now return false */
  public void clearPayload() {
    genClient.clear(CacheKey.payload);
  }
  /** Clears the 'nonBlocking' field, the 'has' method for this field will now return false */
  public void clearNonBlocking() {
    genClient.clear(CacheKey.nonBlocking);
  }
  /** Clears the 'forceLaunch' field, the 'has' method for this field will now return false */
  public void clearForceLaunch() {
    genClient.clear(CacheKey.forceLaunch);
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
  public ActivityRequest copyChanges() {
    ActivityRequest copy = new ActivityRequest();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(ActivityRequest src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new ActivityRequest(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<ActivityRequest> CREATOR = new android.os.Parcelable.Creator<ActivityRequest>() {
    @Override
    public ActivityRequest createFromParcel(android.os.Parcel in) {
      ActivityRequest instance = new ActivityRequest(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public ActivityRequest[] newArray(int size) {
      return new ActivityRequest[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<ActivityRequest> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<ActivityRequest>() {
    @Override
    public ActivityRequest create(org.json.JSONObject jsonObject) {
      return new ActivityRequest(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ACTION_IS_REQUIRED = false;
    public static final boolean PAYLOAD_IS_REQUIRED = false;
    public static final boolean NONBLOCKING_IS_REQUIRED = false;
    public static final boolean FORCELAUNCH_IS_REQUIRED = false;
    public static final boolean METHOD_IS_REQUIRED = false;
    public static final boolean VERSION_IS_REQUIRED = false;

  }

}
