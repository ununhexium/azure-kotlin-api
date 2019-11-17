package net.lab0.azure.tfvc.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.tfvc.model.definition.TfvcItemRequestData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ItemBatchApi {
  /**
   * Post for retrieving a set of items given a list of paths or a long path. Allows for specifying
   * the recursionLevel and version descriptors for each path.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/tfvc/itembatch")
  fun getItemsBatch(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: TfvcItemRequestData
  ): Call<JsonValue>
}
