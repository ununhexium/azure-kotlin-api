package net.lab0.azure.api.tfvc.shelvesetworkitems

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ShelvesetWorkItemsApi {
  /**
   * Get work items associated with a shelveset.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param shelvesetId Shelveset's unique ID
   */
  @GET("/{organization}/_apis/tfvc/shelvesets/workitems")
  fun getShelvesetWorkItems(
    @Path("organization") organization: String,
    @Query("shelvesetId") shelvesetId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
