package net.lab0.azure.api.graph.descriptors

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DescriptorsApi {
  /**
   * Resolve a storage key to a descriptor
   *
   * @param storageKey Storage key of the subject (user, group, scope, etc.) to resolve
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/graph/descriptors/{storageKey}")
  fun getDescriptor(
    @Path("storageKey") storageKey: String,
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
