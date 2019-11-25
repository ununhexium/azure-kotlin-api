package net.lab0.azure.model.definition.cloudloadtest

import kotlin.String

interface Diagnostics {
  val diagnosticStoreConnectionString: String

  val lastModifiedTime: String

  val relativePathToDiagnosticFiles: String
}
