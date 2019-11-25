package net.lab0.azure.api.graph.storagekeys

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface StorageKeysApi {
  /**
   * Resolve a descriptor to a storage key.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/graph/storagekeys/{subjectDescriptor}")
  fun getStorageKey(
    @Path("subjectDescriptor") subjectDescriptor: String,
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
