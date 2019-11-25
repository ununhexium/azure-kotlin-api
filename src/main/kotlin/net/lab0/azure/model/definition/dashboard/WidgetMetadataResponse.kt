package net.lab0.azure.model.definition.dashboard

import kotlin.String

interface WidgetMetadataResponse {
  val uri: String

  val widgetMetadata: WidgetMetadata
}
