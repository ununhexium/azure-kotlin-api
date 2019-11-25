package net.lab0.azure.model.definition.notification

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.notification.SubscriptionFieldType

/**
 * Encapsulates the properties of a field type. It describes the data type of a field, the operators
 * it support and how to populate it in the UI
 */
interface NotificationEventFieldType {
  /**
   * Gets or sets the unique identifier of this field type.
   */
  val id: String

  val operatorConstraints: List<OperatorConstraint>

  /**
   * Gets or sets the list of operators that this type supports.
   */
  val operators: List<NotificationEventFieldOperator>

  val subscriptionFieldType: SubscriptionFieldType

  val value: ValueDefinition
}
