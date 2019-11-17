package net.lab0.azure.dashboard.model.definition

import kotlin.String

interface WidgetMetadataResponse {
  val uri: String

  val widgetMetadata: WidgetMetadata
}
