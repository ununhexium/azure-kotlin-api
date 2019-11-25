package net.lab0.azure.model.definition.taskagent

import kotlin.Int

interface PackageVersion {
  val major: Int

  val minor: Int

  val patch: Int
}
