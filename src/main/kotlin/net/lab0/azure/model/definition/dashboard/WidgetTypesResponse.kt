package net.lab0.azure.model.definition.dashboard

import kotlin.String
import kotlin.collections.List

interface WidgetTypesResponse {
  val _links: ReferenceLinks

  val uri: String

  val widgetTypes: List<WidgetMetadata>
}
