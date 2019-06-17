package inratind.test.application.app.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import inratind.test.application.R;
import inratind.test.application.app.home.adapter.CommentatorsRecyclerAdapter;
import inratind.test.application.app.home.adapter.LikersRecyclerAdapter;

import inratind.test.application.app.home.adapter.MentionsRecyclerAdapter;
import inratind.test.application.base.BaseFragment;
import inratind.test.application.databinding.FragmentStatisticsPostBinding;
import inratind.test.application.di.viewmodel.Injectable;
import inratind.test.application.utils.NetworkHelper;
import inratind.test.application.viewmodel.StatisticsPostFragmentViewModel;

public class StatisticsPostFragment extends BaseFragment<FragmentStatisticsPostBinding> implements
        Injectable {

    @Inject
    StatisticsPostFragmentViewModel viewModel;

    @Inject
    protected NetworkHelper networkHelper;

    @Inject
    LikersRecyclerAdapter userRecyclerAdapter;

    @Inject
    CommentatorsRecyclerAdapter commentatorsRecyclerAdapter;

    @Inject
    MentionsRecyclerAdapter mentionsRecyclerAdapter;

    public static final int TIMEOUT_CODE = 408;
    public static final int ID = 2722;
    public static final String TOKEN  = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjJmNGU5ZDA1MzU3MDI3MmFlMGZhZTMzM2Y4ZTY4ZWVlMWNiMzc0NmM0Mjg5NzI0ZTExNzJjM2Q4ODYzNDNkNDkyY2ZjZjI4Njg0NzQ0MGEwIn0.eyJhdWQiOiIyIiwianRpIjoiMmY0ZTlkMDUzNTcwMjcyYWUwZmFlMzMzZjhlNjhlZWUxY2IzNzQ2YzQyODk3MjRlMTE3MmMzZDg4NjM0M2Q0OTJjZmNmMjg2ODQ3NDQwYTAiLCJpYXQiOjE1MzY4MzE4ODcsIm5iZiI6MTUzNjgzMTg4NywiZXhwIjoxNTY4MzY3ODg3LCJzdWIiOiIzOCIsInNjb3BlcyI6W119.dRitRnoqNFS3xUgtLdLiDjDVVe7ZFNrh24Qm2ML9m-V7kZpgQgajArYoS44kMa1dz_MHUhq3pqk8SnAYIsULgfrOvewTUzmH1C92-yL64Uqnv7lqWizldX2fbJ2IbB8khOCtQ-CCNA_fGY_zEBJXLsOqr4Z00tbZE6fa0PX4Mu0SsuUakLeygXbXnKOmFyZmLJZWoXKpbqiSBU239nrcyqJftBon8DL1BAUuFiadap-gpVSXj8h6BX-FsJx5cgPHFiijIalcEgzOq4VCMkwbQE8xbTsmmxkZUOnM7oKab5inzl8EV5iUgcExeSbHT6k_phOkA7XUaR6PhVoKrSQTPcfdijhME1IHfPVDPGO0vhd6hKszRrhjEPEpoothBoB8ss0lmuCFURdxFv17q97rfpDn1OfO_Y3wYuRW2lqFAnw7sLd92CHjfONwQKswLDzwE4hiQhB8iS_UEbuL_UamNOiCLfjNnVWbVc9BvoReEa8jG4coc0Kv9VNJVWh3D_hGf8dLRZBd1a7zB6-nSpKGf0eAzB0_rBXsyBepjudC-5EFDjloJOxy1Mdruoq6mQa_tFcO99JRteUSd0CXHZO-CN4Bp4xND9kstdutjBn2UWT5xhNq_QRBmBsBDAwp647dUCyQofutN9GUlu2LxmhL0ojydazdND_d9rHtY9t-ndw";


    @Override
    protected int getLayout() {
        return R.layout.fragment_statistics_post;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.setViewModel(viewModel);
        binding.setHandler(this);
        binding.setLifecycleOwner(this);

        viewModel.sendInformationRequest();
        viewModel.sendUserLikersAllRequest();
        viewModel.sendCommentatorsAllPostRequest();
        viewModel.sendMentionsAllPostRequest();
        viewModel.sendRepostersAllPostRequest();

        viewModel.getProgressBarEvent().postValue(true);
        initSubscribers();
        initUserAdapter();

    }

    private void initUserAdapter() {

        binding.recycleView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.recycleView.setAdapter(userRecyclerAdapter);

        binding.commentatorsRecycleView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.commentatorsRecycleView.setAdapter(commentatorsRecyclerAdapter);

        binding.mentionsRecycleView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.mentionsRecycleView.setAdapter(mentionsRecyclerAdapter);

    }

    private void initSubscribers() {

        viewModel.getInformationOfPostResponseMutable().observe(this, informationOfPostResponseWrap ->
        {
            if (informationOfPostResponseWrap.status) {
                viewModel.getProgressBarEvent().postValue(false);
            } else {
                if (informationOfPostResponseWrap.statusCode == TIMEOUT_CODE) {
                    if (networkHelper.isNetworkAvailable()) {
                        showToast(getString(R.string.poor_internet_connection), Toast.LENGTH_LONG);
                    }
                } else {
                    showToast(informationOfPostResponseWrap.message, Toast.LENGTH_LONG);
                }
            }
        });

        viewModel.getUserLikersAllResponseMutable().observe(this, likersResponseWrap ->
        {
            if (likersResponseWrap.status) {

                userRecyclerAdapter.setItems(likersResponseWrap.data.data);
                viewModel.getProgressBarEvent().postValue(false);
            } else {
                if (likersResponseWrap.statusCode == TIMEOUT_CODE) {
                    if (networkHelper.isNetworkAvailable()) {
                        showToast(getString(R.string.poor_internet_connection), Toast.LENGTH_LONG);
                    }
                } else {
                    showToast(likersResponseWrap.message, Toast.LENGTH_LONG);
                }
            }
        });

        viewModel.getUserCommentatorsAllResponseMutable().observe(this, commentatorsResponseWrap ->
        {
            if (commentatorsResponseWrap.status) {

                commentatorsRecyclerAdapter.setItems(commentatorsResponseWrap.data.data);
                viewModel.getProgressBarEvent().postValue(false);
            } else {
                if (commentatorsResponseWrap.statusCode == TIMEOUT_CODE) {
                    if (networkHelper.isNetworkAvailable()) {
                        showToast(getString(R.string.poor_internet_connection), Toast.LENGTH_LONG);
                    }
                } else {
                    showToast(commentatorsResponseWrap.message, Toast.LENGTH_LONG);
                }
            }
        });


        viewModel.getUserMentionsAllResponseMutable().observe(this, mentionsResponseWrap ->
        {
            if (mentionsResponseWrap.status) {

                mentionsRecyclerAdapter.setItems(mentionsResponseWrap.data.data);
                viewModel.getProgressBarEvent().postValue(false);
            } else {
                if (mentionsResponseWrap.statusCode == TIMEOUT_CODE) {
                    if (networkHelper.isNetworkAvailable()) {
                        showToast(getString(R.string.poor_internet_connection), Toast.LENGTH_LONG);
                    }
                } else {
                    showToast(mentionsResponseWrap.message, Toast.LENGTH_LONG);
                }
            }
        });


        viewModel.getUserRepostersAllResponseMutable().observe(this, repostersResponseWrap ->
        {
            if (repostersResponseWrap.status) {
                viewModel.getProgressBarEvent().postValue(false);
            } else {
                if (repostersResponseWrap.statusCode == TIMEOUT_CODE) {
                    if (networkHelper.isNetworkAvailable()) {
                        showToast(getString(R.string.poor_internet_connection), Toast.LENGTH_LONG);
                    }
                } else {
                    showToast(repostersResponseWrap.message, Toast.LENGTH_LONG);
                }
            }
        });
    }

}
