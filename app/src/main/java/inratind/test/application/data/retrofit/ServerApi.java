package inratind.test.application.data.retrofit;

import inratind.test.application.data.retrofit.response.InformationPost;
import inratind.test.application.data.retrofit.response.StatsStatistics;
import inratind.test.application.data.retrofit.response.RequestId;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ServerApi {

    @POST("posts/get")
    Call<InformationPost> getInformationOfPost(@Header("Authorization") String Bearer, @Body RequestId id);

    @POST("posts/likers/all")
    Call<StatsStatistics> getLikersAll(@Header("Authorization") String Bearer, @Body RequestId id);

    @POST("posts/commentators/all")
    Call<StatsStatistics> getCommentatorsAll(@Header("Authorization") String Bearer, @Body RequestId id);

    @POST("posts/mentions/all")
    Call<StatsStatistics> getMentionsAll(@Header("Authorization") String Bearer, @Body RequestId id);

    @POST("posts/reposters/all")
    Call<StatsStatistics> getRepostersAll(@Header("Authorization") String Bearer, @Body RequestId id);

}