package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface LegacyTestSettings {
  val areaId: Int

  val areaPath: String

  val createdBy: String

  val createdByName: String

  val createdDate: String

  val description: String

  val id: Int

  val isAutomated: Boolean

  val isPublic: Boolean

  val lastUpdated: String

  val lastUpdatedBy: String

  val lastUpdatedByName: String

  val machineRoles: List<TestSettingsMachineRole>

  val name: String

  val revision: Int

  val settings: String

  val teamProjectUri: String
}
