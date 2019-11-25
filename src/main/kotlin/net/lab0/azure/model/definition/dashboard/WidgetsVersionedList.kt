package net.lab0.azure.model.definition.dashboard

import kotlin.String
import kotlin.collections.List

/**
 * Wrapper class to support HTTP header generation using CreateResponse, ClientHeaderParameter and
 * ClientResponseType in WidgetV2Controller
 */
interface WidgetsVersionedList {
  val eTag: List<String>

  val widgets: List<Widget>
}
