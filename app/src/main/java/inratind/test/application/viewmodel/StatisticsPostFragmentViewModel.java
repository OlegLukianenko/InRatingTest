package inratind.test.application.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import javax.inject.Inject;

import inratind.test.application.data.repository.RepositoryApi;
import inratind.test.application.data.retrofit.ResponseWrap;
import inratind.test.application.data.retrofit.response.InformationPost;
import inratind.test.application.data.retrofit.response.StatsStatistics;

import static inratind.test.application.app.home.StatisticsPostFragment.ID;
import static inratind.test.application.app.home.StatisticsPostFragment.TOKEN;


public class StatisticsPostFragmentViewModel extends ViewModel {

    @Inject
    RepositoryApi repositoryApi;

    @Inject
    public StatisticsPostFragmentViewModel() {
    }

    private MutableLiveData<Boolean> progressBarVisibility = new MutableLiveData<>();

    private MutableLiveData<ResponseWrap<StatsStatistics>> userLikersAllMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<ResponseWrap<StatsStatistics>> userCommentatorsAllMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<ResponseWrap<StatsStatistics>> userMentionsAllMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<ResponseWrap<StatsStatistics>> userRepostersAllMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<ResponseWrap<InformationPost>> informationOfPostMutableLiveData = new MutableLiveData<>();

    //Send

    public void sendUserLikersAllRequest() {
        repositoryApi.getUserLikersAllPost(TOKEN, ID, userLikersAllMutableLiveData);
    }

    public void sendCommentatorsAllPostRequest() {
        repositoryApi.getCommentatorsAllPost(TOKEN, ID, userCommentatorsAllMutableLiveData);
    }

    public void sendMentionsAllPostRequest() {
        repositoryApi.getMentionsAllPost(TOKEN, ID, userMentionsAllMutableLiveData);
    }

    public void sendRepostersAllPostRequest() {
        repositoryApi.getRepostersAllPost(TOKEN, ID, userRepostersAllMutableLiveData);
    }

    public void sendInformationRequest() {
        repositoryApi.getInformationOfPost(TOKEN, ID, informationOfPostMutableLiveData);
    }


    public MutableLiveData<ResponseWrap<StatsStatistics>> getUserLikersAllResponseMutable() {
        return userLikersAllMutableLiveData;
    }

    public MutableLiveData<ResponseWrap<StatsStatistics>> getUserCommentatorsAllResponseMutable() {
        return userCommentatorsAllMutableLiveData;
    }

    public MutableLiveData<ResponseWrap<StatsStatistics>> getUserMentionsAllResponseMutable() {
        return userMentionsAllMutableLiveData;
    }

    public MutableLiveData<ResponseWrap<StatsStatistics>> getUserRepostersAllResponseMutable() {
        return userRepostersAllMutableLiveData;
    }

    public MutableLiveData<ResponseWrap<InformationPost>> getInformationOfPostResponseMutable() {
        return informationOfPostMutableLiveData;
    }

    public MutableLiveData<Boolean> getProgressBarEvent() {
        return progressBarVisibility;
    }

}
