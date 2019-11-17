package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Type of condition. $When. This condition limits the execution of its children to cases when
 * another field has a particular value, i.e. when the Is value of the referenced field is equal to the
 * given literal value. $WhenNot.This condition limits the execution of its children to cases when
 * another field does not have a particular value, i.e.when the Is value of the referenced field is not
 * equal to the given literal value. $WhenChanged.This condition limits the execution of its children
 * to cases when another field has changed, i.e.when the Is value of the referenced field is not equal
 * to the Was value of that field. $WhenNotChanged.This condition limits the execution of its children
 * to cases when another field has not changed, i.e.when the Is value of the referenced field is equal
 * to the Was value of that field.
 */
enum class RuleConditionType {
  /**
   * $When. This condition limits the execution of its children to cases when another field has a
   * particular value, i.e. when the Is value of the referenced field is equal to the given literal
   * value.
   */
  @Json(name = "when")
  WHEN,

  /**
   * $WhenNot.This condition limits the execution of its children to cases when another field does
   * not have a particular value, i.e.when the Is value of the referenced field is not equal to the
   * given literal value.
   */
  @Json(name = "whenNot")
  WHEN_NOT,

  /**
   * $WhenChanged.This condition limits the execution of its children to cases when another field
   * has changed, i.e.when the Is value of the referenced field is not equal to the Was value of that
   * field.
   */
  @Json(name = "whenChanged")
  WHEN_CHANGED,

  /**
   * $WhenNotChanged.This condition limits the execution of its children to cases when another field
   * has not changed, i.e.when the Is value of the referenced field is equal to the Was value of that
   * field.
   */
  @Json(name = "whenNotChanged")
  WHEN_NOT_CHANGED,

  @Json(name = "whenWas")
  WHEN_WAS,

  @Json(name = "whenStateChangedTo")
  WHEN_STATE_CHANGED_TO,

  @Json(name = "whenStateChangedFromAndTo")
  WHEN_STATE_CHANGED_FROM_AND_TO,

  @Json(name = "whenWorkItemIsCreated")
  WHEN_WORK_ITEM_IS_CREATED,

  @Json(name = "whenValueIsDefined")
  WHEN_VALUE_IS_DEFINED,

  @Json(name = "whenValueIsNotDefined")
  WHEN_VALUE_IS_NOT_DEFINED
}
