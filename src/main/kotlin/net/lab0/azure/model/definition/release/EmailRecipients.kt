package net.lab0.azure.model.definition.release

import kotlin.String
import kotlin.collections.List

interface EmailRecipients {
  val emailAddresses: List<String>

  val tfsIds: List<String>
}
