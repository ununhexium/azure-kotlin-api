package net.lab0.azure.tfvc.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ChangesetChangesApi {
  /**
   * Retrieve Tfvc changes for a given changeset.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id ID of the changeset. Default: null
   * @param skip Number of results to skip. Default: null
   * @param top The maximum number of results to return. Default: null
   */
  @GET("/{organization}/_apis/tfvc/changesets/{id}/changes")
  fun getChangesetChanges(
    @Path("organization") organization: String,
    @Path("id") id: Int,
    @Query("${'$'}skip") skip: Int,
    @Query("${'$'}top") top: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
