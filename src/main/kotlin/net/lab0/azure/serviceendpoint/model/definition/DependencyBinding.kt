package net.lab0.azure.serviceendpoint.model.definition

import kotlin.String

interface DependencyBinding {
  val key: String

  val value: String
}
