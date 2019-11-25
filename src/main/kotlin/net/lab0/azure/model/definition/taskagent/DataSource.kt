package net.lab0.azure.model.definition.taskagent

import kotlin.String
import kotlin.collections.List

interface DataSource {
  val authenticationScheme: AuthenticationSchemeReference

  val endpointUrl: String

  val headers: List<AuthorizationHeader>

  val name: String

  val resourceUrl: String

  val resultSelector: String
}
