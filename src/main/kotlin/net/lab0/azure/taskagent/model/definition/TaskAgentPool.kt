package net.lab0.azure.taskagent.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface TaskAgentPool : TaskAgentPoolReference {
  /**
   * Gets or sets an agentCloudId
   */
  val agentCloudId: Int

  /**
   * Gets or sets a value indicating whether or not a queue should be automatically provisioned for
   * each project collection or not.
   */
  val autoProvision: Boolean

  /**
   * Gets or sets a value indicating whether or not the pool should autosize itself based on the
   * Agent Cloud Provider settings
   */
  val autoSize: Boolean

  val createdBy: IdentityRef

  /**
   * Gets the date/time of the pool creation.
   */
  val createdOn: String

  val owner: IdentityRef

  val properties: PropertiesCollection
}
