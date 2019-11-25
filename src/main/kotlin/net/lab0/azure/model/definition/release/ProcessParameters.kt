package net.lab0.azure.model.definition.release

import kotlin.collections.List

interface ProcessParameters {
  val dataSourceBindings: List<DataSourceBindingBase>

  val inputs: List<TaskInputDefinitionBase>

  val sourceDefinitions: List<TaskSourceDefinitionBase>
}
