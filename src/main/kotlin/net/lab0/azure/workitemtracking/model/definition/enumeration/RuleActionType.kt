package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Type of action to take when the rule is triggered.
 */
enum class RuleActionType {
  /**
   * Make the target field required. Example :
   * {"actionType":"$makeRequired","targetField":"Microsoft.VSTS.Common.Activity","value":""}
   */
  @Json(name = "makeRequired")
  MAKE_REQUIRED,

  /**
   * Make the target field read-only. Example :
   * {"actionType":"$makeReadOnly","targetField":"Microsoft.VSTS.Common.Activity","value":""}
   */
  @Json(name = "makeReadOnly")
  MAKE_READ_ONLY,

  /**
   * Set a default value on the target field. This is used if the user creates a integer/string
   * field and sets a default value of this field.
   */
  @Json(name = "setDefaultValue")
  SET_DEFAULT_VALUE,

  /**
   * Set the default value on the target field from server clock. This is used if user creates the
   * field like Date/Time and uses default value.
   */
  @Json(name = "setDefaultFromClock")
  SET_DEFAULT_FROM_CLOCK,

  /**
   * Set the default current user value on the target field. This is used if the user creates the
   * field of type identity and uses default value.
   */
  @Json(name = "setDefaultFromCurrentUser")
  SET_DEFAULT_FROM_CURRENT_USER,

  /**
   * Set the default value on from existing field to the target field.  This used wants to set a
   * existing field value to the current field.
   */
  @Json(name = "setDefaultFromField")
  SET_DEFAULT_FROM_FIELD,

  /**
   * Set the value of target field to given value. Example : {actionType: "$copyValue", targetField:
   * "ScrumInherited.mypicklist", value: "samplevalue"}
   */
  @Json(name = "copyValue")
  COPY_VALUE,

  /**
   * Set the value from clock.
   */
  @Json(name = "copyFromClock")
  COPY_FROM_CLOCK,

  /**
   * Set the current user to the target field. Example :
   * {"actionType":"$copyFromCurrentUser","targetField":"System.AssignedTo","value":""}.
   */
  @Json(name = "copyFromCurrentUser")
  COPY_FROM_CURRENT_USER,

  /**
   * Copy the value from a specified field and set to target field. Example : {actionType:
   * "$copyFromField", targetField: "System.AssignedTo", value:"System.ChangedBy"}. Here, value is
   * copied from "System.ChangedBy" and set to "System.AssingedTo" field.
   */
  @Json(name = "copyFromField")
  COPY_FROM_FIELD,

  /**
   * Set the value of the target field to empty.
   */
  @Json(name = "setValueToEmpty")
  SET_VALUE_TO_EMPTY,

  /**
   * Use the current time to set the value of the target field. Example : {actionType:
   * "$copyFromServerClock", targetField: "System.CreatedDate", value: ""}
   */
  @Json(name = "copyFromServerClock")
  COPY_FROM_SERVER_CLOCK,

  /**
   * Use the current user to set the value of the target field.
   */
  @Json(name = "copyFromServerCurrentUser")
  COPY_FROM_SERVER_CURRENT_USER
}
