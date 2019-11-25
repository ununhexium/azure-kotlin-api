package net.lab0.azure.model.definition.serviceendpoint

import kotlin.String
import kotlin.collections.List

interface DataSource {
  val authenticationScheme: AuthenticationSchemeReference

  val callbackContextTemplate: String

  val callbackRequiredTemplate: String

  val endpointUrl: String

  val headers: List<AuthorizationHeader>

  val initialContextTemplate: String

  val name: String

  val requestContent: String

  val requestVerb: String

  val resourceUrl: String

  val resultSelector: String
}
