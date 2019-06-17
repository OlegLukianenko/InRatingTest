package inratind.test.application.data.repository;

import android.arch.lifecycle.MutableLiveData;

import inratind.test.application.data.retrofit.ResponseWrap;
import inratind.test.application.data.retrofit.response.InformationPost;
import inratind.test.application.data.retrofit.response.StatsStatistics;


public interface RepositoryApi {

     void getUserLikersAllPost(String token, int productId, MutableLiveData<ResponseWrap<StatsStatistics>> userMutableLiveData);

     void getCommentatorsAllPost(String token, int productId, MutableLiveData<ResponseWrap<StatsStatistics>> userMutableLiveData);

     void getMentionsAllPost(String token, int productId, MutableLiveData<ResponseWrap<StatsStatistics>> userMutableLiveData);

     void getRepostersAllPost(String token, int productId, MutableLiveData<ResponseWrap<StatsStatistics>> userMutableLiveData);

     void getInformationOfPost(String token, int productId, MutableLiveData<ResponseWrap<InformationPost>> userMutableLiveData);

}
