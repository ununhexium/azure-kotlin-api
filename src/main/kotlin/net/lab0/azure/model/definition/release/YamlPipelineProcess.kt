package net.lab0.azure.model.definition.release

import kotlin.String
import kotlin.collections.List

interface YamlPipelineProcess : PipelineProcess {
  val errors: List<String>

  val filename: String

  val fileSource: YamlFileSource

  val resources: YamlPipelineProcessResources
}
