package net.lab0.azure.model.definition.graph

import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Represents a set of data used to communicate with a federated provider on behalf of a particular
 * user.
 */
interface GraphFederatedProviderData {
  /**
   * The access token that can be used to communicated with the federated provider on behalf on the
   * target identity, if we were able to successfully acquire one, otherwise <code>null</code>, if we
   * were not.
   */
  val accessToken: String

  /**
   * Whether or not the immediate provider (i.e. AAD) has indicated that we can call them to attempt
   * to get an access token to communicate with the federated provider on behalf of the target
   * identity.
   */
  val canQueryAccessToken: Boolean

  /**
   * The name of the federated provider, e.g. "github.com".
   */
  val providerName: String

  /**
   * The descriptor of the graph subject to which this federated provider data corresponds.
   */
  val subjectDescriptor: String

  /**
   * The version number of this federated provider data, which corresponds to when it was last
   * updated. Can be used to prevent returning stale provider data from the cache when the caller is
   * aware of a newer version, such as to prevent local cache poisoning from a remote cache or store.
   * This is the app layer equivalent of the data layer sequence ID.
   */
  val version: Int
}
