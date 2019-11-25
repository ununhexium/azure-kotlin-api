package net.lab0.azure.model.definition.taskagent

import javax.json.JsonObject
import kotlin.String

interface VariableGroupParameters {
  /**
   * Sets description of the variable group.
   */
  val description: String

  /**
   * Sets name of the variable group.
   */
  val name: String

  val providerData: VariableGroupProviderData

  /**
   * Sets type of the variable group.
   */
  val type: String

  /**
   * Sets variables contained in the variable group.
   */
  val variables: JsonObject
}
