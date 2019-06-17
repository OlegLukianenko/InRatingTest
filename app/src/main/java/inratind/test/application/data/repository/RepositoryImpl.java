package inratind.test.application.data.repository;

import android.arch.lifecycle.MutableLiveData;
import android.text.TextUtils;


import java.io.IOException;
import java.net.SocketTimeoutException;

import javax.inject.Inject;

import inratind.test.application.data.retrofit.response.InformationPost;
import inratind.test.application.data.retrofit.response.StatsStatistics;
import inratind.test.application.data.retrofit.response.RequestId;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;
import inratind.test.application.data.retrofit.APIError;
import inratind.test.application.data.retrofit.ResponseWrap;
import inratind.test.application.data.retrofit.ServerApi;
import retrofit2.Retrofit;

import static inratind.test.application.app.home.StatisticsPostFragment.TIMEOUT_CODE;

public class RepositoryImpl implements RepositoryApi {

    @Inject
    ServerApi serverApi;

    @Inject
    Retrofit retrofit;

    @Inject
    protected Converter<ResponseBody, APIError> converter;
    private static final String UNKNOWN_ERROR = "Unknown error: ";

    @Inject
    public RepositoryImpl() {
    }


    @Override
    public void getUserLikersAllPost(String token, int postId, MutableLiveData<ResponseWrap<StatsStatistics>> userLikersAllMutableLiveData) {

        Call<StatsStatistics> messages = serverApi.getLikersAll(token, new RequestId(postId));
        messages.enqueue(new Callback<StatsStatistics>() {
            @Override
            public void onResponse(Call<StatsStatistics> call, Response<StatsStatistics> response) {

                ResponseWrap<StatsStatistics> responseWrap;
                if (response.isSuccessful()) {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), response.body());
                } else {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), getErrorMessage(response));
                }

                userLikersAllMutableLiveData.setValue(responseWrap);
            }

            @Override
            public void onFailure(Call<StatsStatistics> call, Throwable t) {
                ResponseWrap<StatsStatistics> responseWrap;

                if (t instanceof SocketTimeoutException) {
                    responseWrap = new ResponseWrap<>(false, TIMEOUT_CODE, null, t.getMessage());
                } else {
                    responseWrap = new ResponseWrap<>(false, 0, null, t.getMessage());
                }

                userLikersAllMutableLiveData.postValue(responseWrap);
            }
        });
    }

    @Override
    public void getCommentatorsAllPost(String token, int postId, MutableLiveData<ResponseWrap<StatsStatistics>> userCommentatorAllMutableLiveData) {

        Call<StatsStatistics> messages = serverApi.getCommentatorsAll(token, new RequestId(postId));
        messages.enqueue(new Callback<StatsStatistics>() {
            @Override
            public void onResponse(Call<StatsStatistics> call, Response<StatsStatistics> response) {

                ResponseWrap<StatsStatistics> responseWrap;
                if (response.isSuccessful()) {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), response.body());
                } else {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), getErrorMessage(response));
                }

                userCommentatorAllMutableLiveData.setValue(responseWrap);
            }

            @Override
            public void onFailure(Call<StatsStatistics> call, Throwable t) {
                ResponseWrap<StatsStatistics> responseWrap;

                if (t instanceof SocketTimeoutException) {
                    responseWrap = new ResponseWrap<>(false, TIMEOUT_CODE, null, t.getMessage());
                } else {
                    responseWrap = new ResponseWrap<>(false, 0, null, t.getMessage());
                }

                userCommentatorAllMutableLiveData.postValue(responseWrap);
            }
        });

    }

    @Override
    public void getMentionsAllPost(String token, int postId, MutableLiveData<ResponseWrap<StatsStatistics>> userMentionsAllMutableLiveData) {

        Call<StatsStatistics> messages = serverApi.getMentionsAll(token, new RequestId(postId));
        messages.enqueue(new Callback<StatsStatistics>() {
            @Override
            public void onResponse(Call<StatsStatistics> call, Response<StatsStatistics> response) {

                ResponseWrap<StatsStatistics> responseWrap;
                if (response.isSuccessful()) {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), response.body());
                } else {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), getErrorMessage(response));
                }

                userMentionsAllMutableLiveData.setValue(responseWrap);
            }

            @Override
            public void onFailure(Call<StatsStatistics> call, Throwable t) {
                ResponseWrap<StatsStatistics> responseWrap;

                if (t instanceof SocketTimeoutException) {
                    responseWrap = new ResponseWrap<>(false, TIMEOUT_CODE, null, t.getMessage());
                } else {
                    responseWrap = new ResponseWrap<>(false, 0, null, t.getMessage());
                }

                userMentionsAllMutableLiveData.postValue(responseWrap);
            }
        });

    }

    @Override
    public void getRepostersAllPost(String token, int postId, MutableLiveData<ResponseWrap<StatsStatistics>> userRepostersAllMutableLiveData) {

        Call<StatsStatistics> messages = serverApi.getRepostersAll(token, new RequestId(postId));
        messages.enqueue(new Callback<StatsStatistics>() {
            @Override
            public void onResponse(Call<StatsStatistics> call, Response<StatsStatistics> response) {

                ResponseWrap<StatsStatistics> responseWrap;
                if (response.isSuccessful()) {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), response.body());
                } else {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), getErrorMessage(response));
                }

                userRepostersAllMutableLiveData.setValue(responseWrap);
            }

            @Override
            public void onFailure(Call<StatsStatistics> call, Throwable t) {
                ResponseWrap<StatsStatistics> responseWrap;

                if (t instanceof SocketTimeoutException) {
                    responseWrap = new ResponseWrap<>(false, TIMEOUT_CODE, null, t.getMessage());
                } else {
                    responseWrap = new ResponseWrap<>(false, 0, null, t.getMessage());
                }

                userRepostersAllMutableLiveData.postValue(responseWrap);
            }
        });
    }

    @Override
    public void getInformationOfPost(String token, int postId, MutableLiveData<ResponseWrap<InformationPost>> userBookmarksAllMutableLiveData) {

        Call<InformationPost> messages = serverApi.getInformationOfPost(token, new RequestId(postId));
        messages.enqueue(new Callback<InformationPost>() {
            @Override
            public void onResponse(Call<InformationPost> call, Response<InformationPost> response) {

                ResponseWrap<InformationPost> responseWrap;
                if (response.isSuccessful()) {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), response.body());
                } else {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), getErrorMessage(response));
                }

                userBookmarksAllMutableLiveData.setValue(responseWrap);
            }

            @Override
            public void onFailure(Call<InformationPost> call, Throwable t) {
                ResponseWrap<InformationPost> responseWrap;

                if (t instanceof SocketTimeoutException) {
                    responseWrap = new ResponseWrap<>(false, TIMEOUT_CODE, null, t.getMessage());
                } else {
                    responseWrap = new ResponseWrap<>(false, 0, null, t.getMessage());
                }

                userBookmarksAllMutableLiveData.postValue(responseWrap);
            }
        });

    }


    private String getErrorMessage(Response<?> response) {
        String responseErrorMessage = null;

        try {
            APIError error = converter.convert(response.errorBody());
            if (!TextUtils.isEmpty(error.getMessage())) {
                responseErrorMessage = error.getMessage();
            }
        } catch (IOException e) {
            return UNKNOWN_ERROR + response.code();
        }

        return responseErrorMessage;
    }

}
