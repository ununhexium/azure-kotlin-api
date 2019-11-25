package net.lab0.azure.model.definition.taskagent

import kotlin.String
import kotlin.collections.List

interface TaskAgentCloudType {
  /**
   * Gets or sets the display name of agnet cloud type.
   */
  val displayName: String

  /**
   * Gets or sets the input descriptors
   */
  val inputDescriptors: List<InputDescriptor>

  /**
   * Gets or sets the name of agent cloud type.
   */
  val name: String
}
