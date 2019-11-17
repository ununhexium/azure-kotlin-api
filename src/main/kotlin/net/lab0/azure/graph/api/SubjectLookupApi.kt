package net.lab0.azure.graph.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.graph.model.definition.GraphSubjectLookup
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface SubjectLookupApi {
  /**
   * Resolve descriptors to users, groups or scopes (Subjects) in a batch.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/graph/subjectlookup")
  fun lookupSubjects(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: GraphSubjectLookup
  ): Call<JsonValue>
}
