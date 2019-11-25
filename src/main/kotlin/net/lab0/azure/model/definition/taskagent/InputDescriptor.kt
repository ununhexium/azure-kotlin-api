package net.lab0.azure.model.definition.taskagent

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.taskagent.InputMode

/**
 * Describes an input for subscriptions.
 */
interface InputDescriptor {
  /**
   * The ids of all inputs that the value of this input is dependent on.
   */
  val dependencyInputIds: List<String>

  /**
   * Description of what this input is used for
   */
  val description: String

  /**
   * The group localized name to which this input belongs and can be shown as a header for the
   * container that will include all the inputs in the group.
   */
  val groupName: String

  /**
   * If true, the value information for this input is dynamic and should be fetched when the value
   * of dependency inputs change.
   */
  val hasDynamicValueInformation: Boolean

  /**
   * Identifier for the subscription input
   */
  val id: String

  /**
   * Mode in which the value of this input should be entered
   */
  val inputMode: InputMode

  /**
   * Gets whether this input is confidential, such as for a password or application key
   */
  val isConfidential: Boolean

  /**
   * Localized name which can be shown as a label for the subscription input
   */
  val name: String

  /**
   * Custom properties for the input which can be used by the service provider
   */
  val properties: JsonObject

  /**
   * Underlying data type for the input value. When this value is specified, InputMode, Validation
   * and Values are optional.
   */
  val type: String

  /**
   * Gets whether this input is included in the default generated action description.
   */
  val useInDefaultDescription: Boolean

  val validation: InputValidation

  /**
   * A hint for input value. It can be used in the UI as the input placeholder.
   */
  val valueHint: String

  val values: InputValues
}
