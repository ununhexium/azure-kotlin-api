package net.lab0.azure.tfvc.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ChangesetWorkItemsApi {
  /**
   * Retrieves the work items associated with a particular changeset.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id ID of the changeset.
   */
  @GET("/{organization}/_apis/tfvc/changesets/{id}/workItems")
  fun getChangesetWorkItems(
    @Path("organization") organization: String,
    @Path("id") id: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
