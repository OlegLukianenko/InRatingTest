package inratind.test.application.databinding;
import inratind.test.application.R;
import inratind.test.application.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentStatisticsPostBindingImpl extends FragmentStatisticsPostBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(27);
        sIncludes.setIncludes(0, 
            new String[] {"layout_progress_bar"},
            new int[] {7},
            new int[] {R.layout.layout_progress_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerBackground, 8);
        sViewsWithIds.put(R.id.headerResizer, 9);
        sViewsWithIds.put(R.id.backArrow, 10);
        sViewsWithIds.put(R.id.textPricing, 11);
        sViewsWithIds.put(R.id.viewsContainer, 12);
        sViewsWithIds.put(R.id.viewsBackground, 13);
        sViewsWithIds.put(R.id.likeContainer, 14);
        sViewsWithIds.put(R.id.likeBackground, 15);
        sViewsWithIds.put(R.id.recycleView, 16);
        sViewsWithIds.put(R.id.commentatorsContainer, 17);
        sViewsWithIds.put(R.id.commentatorsBackground, 18);
        sViewsWithIds.put(R.id.commentatorsRecycleView, 19);
        sViewsWithIds.put(R.id.mentionsContainer, 20);
        sViewsWithIds.put(R.id.mentionsBackground, 21);
        sViewsWithIds.put(R.id.mentionsRecycleView, 22);
        sViewsWithIds.put(R.id.repostersContainer, 23);
        sViewsWithIds.put(R.id.repostersBackground, 24);
        sViewsWithIds.put(R.id.bookmarksContainer, 25);
        sViewsWithIds.put(R.id.bookmarksBackground, 26);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStatisticsPostBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private FragmentStatisticsPostBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.ImageView) bindings[10]
            , (android.view.View) bindings[26]
            , (android.support.constraint.ConstraintLayout) bindings[25]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[18]
            , (android.support.constraint.ConstraintLayout) bindings[17]
            , (android.widget.TextView) bindings[3]
            , (android.support.v7.widget.RecyclerView) bindings[19]
            , (android.support.constraint.ConstraintLayout) bindings[8]
            , (android.view.View) bindings[9]
            , (inratind.test.application.databinding.LayoutProgressBarBinding) bindings[7]
            , (android.view.View) bindings[15]
            , (android.support.constraint.ConstraintLayout) bindings[14]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[21]
            , (android.support.constraint.ConstraintLayout) bindings[20]
            , (android.widget.TextView) bindings[4]
            , (android.support.v7.widget.RecyclerView) bindings[22]
            , (android.support.v7.widget.RecyclerView) bindings[16]
            , (android.view.View) bindings[24]
            , (android.support.constraint.ConstraintLayout) bindings[23]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.view.View) bindings[13]
            , (android.support.constraint.ConstraintLayout) bindings[12]
            , (android.widget.TextView) bindings[1]
            );
        this.bookmarksCount.setTag(null);
        this.commentatorsCount.setTag(null);
        this.likeCount.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mentionsCount.setTag(null);
        this.repostersCount.setTag(null);
        this.viewsCount.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        includeLayoutProgressBar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeLayoutProgressBar.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.handler == variableId) {
            setHandler((inratind.test.application.app.home.StatisticsPostFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((inratind.test.application.viewmodel.StatisticsPostFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable inratind.test.application.app.home.StatisticsPostFragment Handler) {
        this.mHandler = Handler;
    }
    public void setViewModel(@Nullable inratind.test.application.viewmodel.StatisticsPostFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includeLayoutProgressBar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGetUserLikersAllResponseMutable((android.arch.lifecycle.MutableLiveData<inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics>>) object, fieldId);
            case 1 :
                return onChangeIncludeLayoutProgressBar((inratind.test.application.databinding.LayoutProgressBarBinding) object, fieldId);
            case 2 :
                return onChangeViewModelGetInformationOfPostResponseMutable((android.arch.lifecycle.MutableLiveData<inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.InformationPost>>) object, fieldId);
            case 3 :
                return onChangeViewModelGetUserMentionsAllResponseMutable((android.arch.lifecycle.MutableLiveData<inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics>>) object, fieldId);
            case 4 :
                return onChangeViewModelGetUserCommentatorsAllResponseMutable((android.arch.lifecycle.MutableLiveData<inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics>>) object, fieldId);
            case 5 :
                return onChangeViewModelGetUserRepostersAllResponseMutable((android.arch.lifecycle.MutableLiveData<inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGetUserLikersAllResponseMutable(android.arch.lifecycle.MutableLiveData<inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics>> ViewModelGetUserLikersAllResponseMutable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeLayoutProgressBar(inratind.test.application.databinding.LayoutProgressBarBinding IncludeLayoutProgressBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetInformationOfPostResponseMutable(android.arch.lifecycle.MutableLiveData<inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.InformationPost>> ViewModelGetInformationOfPostResponseMutable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetUserMentionsAllResponseMutable(android.arch.lifecycle.MutableLiveData<inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics>> ViewModelGetUserMentionsAllResponseMutable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetUserCommentatorsAllResponseMutable(android.arch.lifecycle.MutableLiveData<inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics>> ViewModelGetUserCommentatorsAllResponseMutable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetUserRepostersAllResponseMutable(android.arch.lifecycle.MutableLiveData<inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics>> ViewModelGetUserRepostersAllResponseMutable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics> viewModelGetUserRepostersAllResponseMutableGetValue = null;
        inratind.test.application.data.retrofit.response.StatsStatistics.Meta viewModelGetUserMentionsAllResponseMutableGetValueDataMeta = null;
        java.lang.String likeCountAndroidStringLikeJavaLangStringViewModelGetUserLikersAllResponseMutableGetValueDataMetaTotal = null;
        boolean viewModelGetUserLikersAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull = false;
        inratind.test.application.data.retrofit.response.StatsStatistics viewModelGetUserCommentatorsAllResponseMutableGetValueData = null;
        inratind.test.application.data.retrofit.response.StatsStatistics.Meta viewModelGetUserRepostersAllResponseMutableGetValueDataMeta = null;
        java.lang.String viewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotalJavaLangObjectNullRepostersCountAndroidStringRepostsJavaLangString0RepostersCountAndroidStringRepostsJavaLangStringViewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotal = null;
        java.lang.String repostersCountAndroidStringRepostsJavaLangStringViewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotal = null;
        java.lang.String viewModelGetUserLikersAllResponseMutableGetValueDataMetaTotal = null;
        java.lang.String viewsCountAndroidStringViewsJavaLangStringViewModelGetInformationOfPostResponseMutableGetValueDataViewsCount = null;
        inratind.test.application.data.retrofit.response.StatsStatistics viewModelGetUserRepostersAllResponseMutableGetValueData = null;
        inratind.test.application.data.retrofit.response.StatsStatistics viewModelGetUserMentionsAllResponseMutableGetValueData = null;
        boolean viewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCountInt0 = false;
        java.lang.String mentionsCountAndroidStringMarksJavaLangStringViewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotal = null;
        inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics> viewModelGetUserLikersAllResponseMutableGetValue = null;
        int viewModelGetInformationOfPostResponseMutableGetValueDataViewsCount = 0;
        java.lang.String viewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCountInt0BookmarksCountAndroidStringBookmarksJavaLangString0BookmarksCountAndroidStringBookmarksJavaLangStringViewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCount = null;
        inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics> viewModelGetUserCommentatorsAllResponseMutableGetValue = null;
        java.lang.String viewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotal = null;
        java.lang.String commentatorsCountAndroidStringCommentatorsJavaLangStringViewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotal = null;
        boolean viewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull = false;
        boolean viewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull = false;
        inratind.test.application.data.retrofit.response.StatsStatistics.Meta viewModelGetUserCommentatorsAllResponseMutableGetValueDataMeta = null;
        java.lang.String viewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotal = null;
        inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.InformationPost> viewModelGetInformationOfPostResponseMutableGetValue = null;
        java.lang.String viewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotalJavaLangObjectNullMentionsCountAndroidStringMarksJavaLangString0MentionsCountAndroidStringMarksJavaLangStringViewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotal = null;
        int viewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCount = 0;
        java.lang.String viewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotal = null;
        java.lang.String bookmarksCountAndroidStringBookmarksJavaLangStringViewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCount = null;
        android.arch.lifecycle.MutableLiveData<inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics>> viewModelGetUserLikersAllResponseMutable = null;
        inratind.test.application.data.retrofit.response.StatsStatistics.Meta viewModelGetUserLikersAllResponseMutableGetValueDataMeta = null;
        java.lang.String viewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotalJavaLangObjectNullCommentatorsCountAndroidStringCommentatorsJavaLangString0CommentatorsCountAndroidStringCommentatorsJavaLangStringViewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotal = null;
        java.lang.String viewModelGetUserLikersAllResponseMutableGetValueDataMetaTotalJavaLangObjectNullLikeCountAndroidStringLikeJavaLangString0LikeCountAndroidStringLikeJavaLangStringViewModelGetUserLikersAllResponseMutableGetValueDataMetaTotal = null;
        boolean viewModelGetInformationOfPostResponseMutableGetValueDataViewsCountInt0 = false;
        inratind.test.application.data.retrofit.response.StatsStatistics viewModelGetUserLikersAllResponseMutableGetValueData = null;
        android.arch.lifecycle.MutableLiveData<inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.InformationPost>> viewModelGetInformationOfPostResponseMutable = null;
        android.arch.lifecycle.MutableLiveData<inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics>> viewModelGetUserMentionsAllResponseMutable = null;
        android.arch.lifecycle.MutableLiveData<inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics>> viewModelGetUserCommentatorsAllResponseMutable = null;
        boolean viewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull = false;
        inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics> viewModelGetUserMentionsAllResponseMutableGetValue = null;
        android.arch.lifecycle.MutableLiveData<inratind.test.application.data.retrofit.ResponseWrap<inratind.test.application.data.retrofit.response.StatsStatistics>> viewModelGetUserRepostersAllResponseMutable = null;
        java.lang.String viewModelGetInformationOfPostResponseMutableGetValueDataViewsCountInt0ViewsCountAndroidStringViewsJavaLangString0ViewsCountAndroidStringViewsJavaLangStringViewModelGetInformationOfPostResponseMutableGetValueDataViewsCount = null;
        inratind.test.application.viewmodel.StatisticsPostFragmentViewModel viewModel = mViewModel;
        inratind.test.application.data.retrofit.response.InformationPost viewModelGetInformationOfPostResponseMutableGetValueData = null;

        if ((dirtyFlags & 0x1bdL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getUserLikersAllResponseMutable()
                        viewModelGetUserLikersAllResponseMutable = viewModel.getUserLikersAllResponseMutable();
                    }
                    updateLiveDataRegistration(0, viewModelGetUserLikersAllResponseMutable);


                    if (viewModelGetUserLikersAllResponseMutable != null) {
                        // read viewModel.getUserLikersAllResponseMutable().getValue()
                        viewModelGetUserLikersAllResponseMutableGetValue = viewModelGetUserLikersAllResponseMutable.getValue();
                    }


                    if (viewModelGetUserLikersAllResponseMutableGetValue != null) {
                        // read viewModel.getUserLikersAllResponseMutable().getValue().data
                        viewModelGetUserLikersAllResponseMutableGetValueData = viewModelGetUserLikersAllResponseMutableGetValue.data;
                    }


                    if (viewModelGetUserLikersAllResponseMutableGetValueData != null) {
                        // read viewModel.getUserLikersAllResponseMutable().getValue().data.meta
                        viewModelGetUserLikersAllResponseMutableGetValueDataMeta = viewModelGetUserLikersAllResponseMutableGetValueData.meta;
                    }


                    if (viewModelGetUserLikersAllResponseMutableGetValueDataMeta != null) {
                        // read viewModel.getUserLikersAllResponseMutable().getValue().data.meta.total
                        viewModelGetUserLikersAllResponseMutableGetValueDataMetaTotal = viewModelGetUserLikersAllResponseMutableGetValueDataMeta.total;
                    }


                    // read viewModel.getUserLikersAllResponseMutable().getValue().data.meta.total == null
                    viewModelGetUserLikersAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull = (viewModelGetUserLikersAllResponseMutableGetValueDataMetaTotal) == (null);
                if((dirtyFlags & 0x181L) != 0) {
                    if(viewModelGetUserLikersAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getInformationOfPostResponseMutable()
                        viewModelGetInformationOfPostResponseMutable = viewModel.getInformationOfPostResponseMutable();
                    }
                    updateLiveDataRegistration(2, viewModelGetInformationOfPostResponseMutable);


                    if (viewModelGetInformationOfPostResponseMutable != null) {
                        // read viewModel.getInformationOfPostResponseMutable().getValue()
                        viewModelGetInformationOfPostResponseMutableGetValue = viewModelGetInformationOfPostResponseMutable.getValue();
                    }


                    if (viewModelGetInformationOfPostResponseMutableGetValue != null) {
                        // read viewModel.getInformationOfPostResponseMutable().getValue().data
                        viewModelGetInformationOfPostResponseMutableGetValueData = viewModelGetInformationOfPostResponseMutableGetValue.data;
                    }


                    if (viewModelGetInformationOfPostResponseMutableGetValueData != null) {
                        // read viewModel.getInformationOfPostResponseMutable().getValue().data.views_count
                        viewModelGetInformationOfPostResponseMutableGetValueDataViewsCount = viewModelGetInformationOfPostResponseMutableGetValueData.views_count;
                        // read viewModel.getInformationOfPostResponseMutable().getValue().data.bookmarks_count
                        viewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCount = viewModelGetInformationOfPostResponseMutableGetValueData.bookmarks_count;
                    }


                    // read viewModel.getInformationOfPostResponseMutable().getValue().data.views_count == 0
                    viewModelGetInformationOfPostResponseMutableGetValueDataViewsCountInt0 = (viewModelGetInformationOfPostResponseMutableGetValueDataViewsCount) == (0);
                    // read viewModel.getInformationOfPostResponseMutable().getValue().data.bookmarks_count == 0
                    viewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCountInt0 = (viewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCount) == (0);
                if((dirtyFlags & 0x184L) != 0) {
                    if(viewModelGetInformationOfPostResponseMutableGetValueDataViewsCountInt0) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }
                if((dirtyFlags & 0x184L) != 0) {
                    if(viewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCountInt0) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getUserMentionsAllResponseMutable()
                        viewModelGetUserMentionsAllResponseMutable = viewModel.getUserMentionsAllResponseMutable();
                    }
                    updateLiveDataRegistration(3, viewModelGetUserMentionsAllResponseMutable);


                    if (viewModelGetUserMentionsAllResponseMutable != null) {
                        // read viewModel.getUserMentionsAllResponseMutable().getValue()
                        viewModelGetUserMentionsAllResponseMutableGetValue = viewModelGetUserMentionsAllResponseMutable.getValue();
                    }


                    if (viewModelGetUserMentionsAllResponseMutableGetValue != null) {
                        // read viewModel.getUserMentionsAllResponseMutable().getValue().data
                        viewModelGetUserMentionsAllResponseMutableGetValueData = viewModelGetUserMentionsAllResponseMutableGetValue.data;
                    }


                    if (viewModelGetUserMentionsAllResponseMutableGetValueData != null) {
                        // read viewModel.getUserMentionsAllResponseMutable().getValue().data.meta
                        viewModelGetUserMentionsAllResponseMutableGetValueDataMeta = viewModelGetUserMentionsAllResponseMutableGetValueData.meta;
                    }


                    if (viewModelGetUserMentionsAllResponseMutableGetValueDataMeta != null) {
                        // read viewModel.getUserMentionsAllResponseMutable().getValue().data.meta.total
                        viewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotal = viewModelGetUserMentionsAllResponseMutableGetValueDataMeta.total;
                    }


                    // read viewModel.getUserMentionsAllResponseMutable().getValue().data.meta.total == null
                    viewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull = (viewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotal) == (null);
                if((dirtyFlags & 0x188L) != 0) {
                    if(viewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getUserCommentatorsAllResponseMutable()
                        viewModelGetUserCommentatorsAllResponseMutable = viewModel.getUserCommentatorsAllResponseMutable();
                    }
                    updateLiveDataRegistration(4, viewModelGetUserCommentatorsAllResponseMutable);


                    if (viewModelGetUserCommentatorsAllResponseMutable != null) {
                        // read viewModel.getUserCommentatorsAllResponseMutable().getValue()
                        viewModelGetUserCommentatorsAllResponseMutableGetValue = viewModelGetUserCommentatorsAllResponseMutable.getValue();
                    }


                    if (viewModelGetUserCommentatorsAllResponseMutableGetValue != null) {
                        // read viewModel.getUserCommentatorsAllResponseMutable().getValue().data
                        viewModelGetUserCommentatorsAllResponseMutableGetValueData = viewModelGetUserCommentatorsAllResponseMutableGetValue.data;
                    }


                    if (viewModelGetUserCommentatorsAllResponseMutableGetValueData != null) {
                        // read viewModel.getUserCommentatorsAllResponseMutable().getValue().data.meta
                        viewModelGetUserCommentatorsAllResponseMutableGetValueDataMeta = viewModelGetUserCommentatorsAllResponseMutableGetValueData.meta;
                    }


                    if (viewModelGetUserCommentatorsAllResponseMutableGetValueDataMeta != null) {
                        // read viewModel.getUserCommentatorsAllResponseMutable().getValue().data.meta.total
                        viewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotal = viewModelGetUserCommentatorsAllResponseMutableGetValueDataMeta.total;
                    }


                    // read viewModel.getUserCommentatorsAllResponseMutable().getValue().data.meta.total == null
                    viewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull = (viewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotal) == (null);
                if((dirtyFlags & 0x190L) != 0) {
                    if(viewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getUserRepostersAllResponseMutable()
                        viewModelGetUserRepostersAllResponseMutable = viewModel.getUserRepostersAllResponseMutable();
                    }
                    updateLiveDataRegistration(5, viewModelGetUserRepostersAllResponseMutable);


                    if (viewModelGetUserRepostersAllResponseMutable != null) {
                        // read viewModel.getUserRepostersAllResponseMutable().getValue()
                        viewModelGetUserRepostersAllResponseMutableGetValue = viewModelGetUserRepostersAllResponseMutable.getValue();
                    }


                    if (viewModelGetUserRepostersAllResponseMutableGetValue != null) {
                        // read viewModel.getUserRepostersAllResponseMutable().getValue().data
                        viewModelGetUserRepostersAllResponseMutableGetValueData = viewModelGetUserRepostersAllResponseMutableGetValue.data;
                    }


                    if (viewModelGetUserRepostersAllResponseMutableGetValueData != null) {
                        // read viewModel.getUserRepostersAllResponseMutable().getValue().data.meta
                        viewModelGetUserRepostersAllResponseMutableGetValueDataMeta = viewModelGetUserRepostersAllResponseMutableGetValueData.meta;
                    }


                    if (viewModelGetUserRepostersAllResponseMutableGetValueDataMeta != null) {
                        // read viewModel.getUserRepostersAllResponseMutable().getValue().data.meta.total
                        viewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotal = viewModelGetUserRepostersAllResponseMutableGetValueDataMeta.total;
                    }


                    // read viewModel.getUserRepostersAllResponseMutable().getValue().data.meta.total == null
                    viewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull = (viewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotal) == (null);
                if((dirtyFlags & 0x1a0L) != 0) {
                    if(viewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20000L) != 0) {

                // read ((@android:string/like) + (" ")) + (viewModel.getUserLikersAllResponseMutable().getValue().data.meta.total)
                likeCountAndroidStringLikeJavaLangStringViewModelGetUserLikersAllResponseMutableGetValueDataMetaTotal = ((likeCount.getResources().getString(R.string.like)) + (" ")) + (viewModelGetUserLikersAllResponseMutableGetValueDataMetaTotal);
        }
        if ((dirtyFlags & 0x200L) != 0) {

                // read ((@android:string/reposts) + (" ")) + (viewModel.getUserRepostersAllResponseMutable().getValue().data.meta.total)
                repostersCountAndroidStringRepostsJavaLangStringViewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotal = ((repostersCount.getResources().getString(R.string.reposts)) + (" ")) + (viewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotal);
        }
        if ((dirtyFlags & 0x80000L) != 0) {

                // read ((@android:string/views) + (" ")) + (viewModel.getInformationOfPostResponseMutable().getValue().data.views_count)
                viewsCountAndroidStringViewsJavaLangStringViewModelGetInformationOfPostResponseMutableGetValueDataViewsCount = ((viewsCount.getResources().getString(R.string.views)) + (" ")) + (viewModelGetInformationOfPostResponseMutableGetValueDataViewsCount);
        }
        if ((dirtyFlags & 0x2000L) != 0) {

                // read ((@android:string/marks) + (" ")) + (viewModel.getUserMentionsAllResponseMutable().getValue().data.meta.total)
                mentionsCountAndroidStringMarksJavaLangStringViewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotal = ((mentionsCount.getResources().getString(R.string.marks)) + (" ")) + (viewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotal);
        }
        if ((dirtyFlags & 0x8000L) != 0) {

                // read ((@android:string/commentators) + (" ")) + (viewModel.getUserCommentatorsAllResponseMutable().getValue().data.meta.total)
                commentatorsCountAndroidStringCommentatorsJavaLangStringViewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotal = ((commentatorsCount.getResources().getString(R.string.commentators)) + (" ")) + (viewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotal);
        }
        if ((dirtyFlags & 0x800L) != 0) {

                // read ((@android:string/bookmarks) + (" ")) + (viewModel.getInformationOfPostResponseMutable().getValue().data.bookmarks_count)
                bookmarksCountAndroidStringBookmarksJavaLangStringViewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCount = ((bookmarksCount.getResources().getString(R.string.bookmarks)) + (" ")) + (viewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCount);
        }

        if ((dirtyFlags & 0x1a0L) != 0) {

                // read viewModel.getUserRepostersAllResponseMutable().getValue().data.meta.total == null ? (@android:string/reposts) + (" 0") : ((@android:string/reposts) + (" ")) + (viewModel.getUserRepostersAllResponseMutable().getValue().data.meta.total)
                viewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotalJavaLangObjectNullRepostersCountAndroidStringRepostsJavaLangString0RepostersCountAndroidStringRepostsJavaLangStringViewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotal = ((viewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull) ? ((repostersCount.getResources().getString(R.string.reposts)) + (" 0")) : (repostersCountAndroidStringRepostsJavaLangStringViewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotal));
        }
        if ((dirtyFlags & 0x184L) != 0) {

                // read viewModel.getInformationOfPostResponseMutable().getValue().data.bookmarks_count == 0 ? (@android:string/bookmarks) + (" 0") : ((@android:string/bookmarks) + (" ")) + (viewModel.getInformationOfPostResponseMutable().getValue().data.bookmarks_count)
                viewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCountInt0BookmarksCountAndroidStringBookmarksJavaLangString0BookmarksCountAndroidStringBookmarksJavaLangStringViewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCount = ((viewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCountInt0) ? ((bookmarksCount.getResources().getString(R.string.bookmarks)) + (" 0")) : (bookmarksCountAndroidStringBookmarksJavaLangStringViewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCount));
                // read viewModel.getInformationOfPostResponseMutable().getValue().data.views_count == 0 ? (@android:string/views) + (" 0") : ((@android:string/views) + (" ")) + (viewModel.getInformationOfPostResponseMutable().getValue().data.views_count)
                viewModelGetInformationOfPostResponseMutableGetValueDataViewsCountInt0ViewsCountAndroidStringViewsJavaLangString0ViewsCountAndroidStringViewsJavaLangStringViewModelGetInformationOfPostResponseMutableGetValueDataViewsCount = ((viewModelGetInformationOfPostResponseMutableGetValueDataViewsCountInt0) ? ((viewsCount.getResources().getString(R.string.views)) + (" 0")) : (viewsCountAndroidStringViewsJavaLangStringViewModelGetInformationOfPostResponseMutableGetValueDataViewsCount));
        }
        if ((dirtyFlags & 0x188L) != 0) {

                // read viewModel.getUserMentionsAllResponseMutable().getValue().data.meta.total == null ? (@android:string/marks) + (" 0") : ((@android:string/marks) + (" ")) + (viewModel.getUserMentionsAllResponseMutable().getValue().data.meta.total)
                viewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotalJavaLangObjectNullMentionsCountAndroidStringMarksJavaLangString0MentionsCountAndroidStringMarksJavaLangStringViewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotal = ((viewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull) ? ((mentionsCount.getResources().getString(R.string.marks)) + (" 0")) : (mentionsCountAndroidStringMarksJavaLangStringViewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotal));
        }
        if ((dirtyFlags & 0x190L) != 0) {

                // read viewModel.getUserCommentatorsAllResponseMutable().getValue().data.meta.total == null ? (@android:string/commentators) + (" 0") : ((@android:string/commentators) + (" ")) + (viewModel.getUserCommentatorsAllResponseMutable().getValue().data.meta.total)
                viewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotalJavaLangObjectNullCommentatorsCountAndroidStringCommentatorsJavaLangString0CommentatorsCountAndroidStringCommentatorsJavaLangStringViewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotal = ((viewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull) ? ((commentatorsCount.getResources().getString(R.string.commentators)) + (" 0")) : (commentatorsCountAndroidStringCommentatorsJavaLangStringViewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotal));
        }
        if ((dirtyFlags & 0x181L) != 0) {

                // read viewModel.getUserLikersAllResponseMutable().getValue().data.meta.total == null ? (@android:string/like) + (" 0") : ((@android:string/like) + (" ")) + (viewModel.getUserLikersAllResponseMutable().getValue().data.meta.total)
                viewModelGetUserLikersAllResponseMutableGetValueDataMetaTotalJavaLangObjectNullLikeCountAndroidStringLikeJavaLangString0LikeCountAndroidStringLikeJavaLangStringViewModelGetUserLikersAllResponseMutableGetValueDataMetaTotal = ((viewModelGetUserLikersAllResponseMutableGetValueDataMetaTotalJavaLangObjectNull) ? ((likeCount.getResources().getString(R.string.like)) + (" 0")) : (likeCountAndroidStringLikeJavaLangStringViewModelGetUserLikersAllResponseMutableGetValueDataMetaTotal));
        }
        // batch finished
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.bookmarksCount, viewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCountInt0BookmarksCountAndroidStringBookmarksJavaLangString0BookmarksCountAndroidStringBookmarksJavaLangStringViewModelGetInformationOfPostResponseMutableGetValueDataBookmarksCount);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.viewsCount, viewModelGetInformationOfPostResponseMutableGetValueDataViewsCountInt0ViewsCountAndroidStringViewsJavaLangString0ViewsCountAndroidStringViewsJavaLangStringViewModelGetInformationOfPostResponseMutableGetValueDataViewsCount);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.commentatorsCount, viewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotalJavaLangObjectNullCommentatorsCountAndroidStringCommentatorsJavaLangString0CommentatorsCountAndroidStringCommentatorsJavaLangStringViewModelGetUserCommentatorsAllResponseMutableGetValueDataMetaTotal);
        }
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            this.includeLayoutProgressBar.setViewModel(viewModel);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.likeCount, viewModelGetUserLikersAllResponseMutableGetValueDataMetaTotalJavaLangObjectNullLikeCountAndroidStringLikeJavaLangString0LikeCountAndroidStringLikeJavaLangStringViewModelGetUserLikersAllResponseMutableGetValueDataMetaTotal);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mentionsCount, viewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotalJavaLangObjectNullMentionsCountAndroidStringMarksJavaLangString0MentionsCountAndroidStringMarksJavaLangStringViewModelGetUserMentionsAllResponseMutableGetValueDataMetaTotal);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.repostersCount, viewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotalJavaLangObjectNullRepostersCountAndroidStringRepostsJavaLangString0RepostersCountAndroidStringRepostsJavaLangStringViewModelGetUserRepostersAllResponseMutableGetValueDataMetaTotal);
        }
        executeBindingsOn(includeLayoutProgressBar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.getUserLikersAllResponseMutable()
        flag 1 (0x2L): includeLayoutProgressBar
        flag 2 (0x3L): viewModel.getInformationOfPostResponseMutable()
        flag 3 (0x4L): viewModel.getUserMentionsAllResponseMutable()
        flag 4 (0x5L): viewModel.getUserCommentatorsAllResponseMutable()
        flag 5 (0x6L): viewModel.getUserRepostersAllResponseMutable()
        flag 6 (0x7L): handler
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
        flag 9 (0xaL): viewModel.getUserRepostersAllResponseMutable().getValue().data.meta.total == null ? (@android:string/reposts) + (" 0") : ((@android:string/reposts) + (" ")) + (viewModel.getUserRepostersAllResponseMutable().getValue().data.meta.total)
        flag 10 (0xbL): viewModel.getUserRepostersAllResponseMutable().getValue().data.meta.total == null ? (@android:string/reposts) + (" 0") : ((@android:string/reposts) + (" ")) + (viewModel.getUserRepostersAllResponseMutable().getValue().data.meta.total)
        flag 11 (0xcL): viewModel.getInformationOfPostResponseMutable().getValue().data.bookmarks_count == 0 ? (@android:string/bookmarks) + (" 0") : ((@android:string/bookmarks) + (" ")) + (viewModel.getInformationOfPostResponseMutable().getValue().data.bookmarks_count)
        flag 12 (0xdL): viewModel.getInformationOfPostResponseMutable().getValue().data.bookmarks_count == 0 ? (@android:string/bookmarks) + (" 0") : ((@android:string/bookmarks) + (" ")) + (viewModel.getInformationOfPostResponseMutable().getValue().data.bookmarks_count)
        flag 13 (0xeL): viewModel.getUserMentionsAllResponseMutable().getValue().data.meta.total == null ? (@android:string/marks) + (" 0") : ((@android:string/marks) + (" ")) + (viewModel.getUserMentionsAllResponseMutable().getValue().data.meta.total)
        flag 14 (0xfL): viewModel.getUserMentionsAllResponseMutable().getValue().data.meta.total == null ? (@android:string/marks) + (" 0") : ((@android:string/marks) + (" ")) + (viewModel.getUserMentionsAllResponseMutable().getValue().data.meta.total)
        flag 15 (0x10L): viewModel.getUserCommentatorsAllResponseMutable().getValue().data.meta.total == null ? (@android:string/commentators) + (" 0") : ((@android:string/commentators) + (" ")) + (viewModel.getUserCommentatorsAllResponseMutable().getValue().data.meta.total)
        flag 16 (0x11L): viewModel.getUserCommentatorsAllResponseMutable().getValue().data.meta.total == null ? (@android:string/commentators) + (" 0") : ((@android:string/commentators) + (" ")) + (viewModel.getUserCommentatorsAllResponseMutable().getValue().data.meta.total)
        flag 17 (0x12L): viewModel.getUserLikersAllResponseMutable().getValue().data.meta.total == null ? (@android:string/like) + (" 0") : ((@android:string/like) + (" ")) + (viewModel.getUserLikersAllResponseMutable().getValue().data.meta.total)
        flag 18 (0x13L): viewModel.getUserLikersAllResponseMutable().getValue().data.meta.total == null ? (@android:string/like) + (" 0") : ((@android:string/like) + (" ")) + (viewModel.getUserLikersAllResponseMutable().getValue().data.meta.total)
        flag 19 (0x14L): viewModel.getInformationOfPostResponseMutable().getValue().data.views_count == 0 ? (@android:string/views) + (" 0") : ((@android:string/views) + (" ")) + (viewModel.getInformationOfPostResponseMutable().getValue().data.views_count)
        flag 20 (0x15L): viewModel.getInformationOfPostResponseMutable().getValue().data.views_count == 0 ? (@android:string/views) + (" 0") : ((@android:string/views) + (" ")) + (viewModel.getInformationOfPostResponseMutable().getValue().data.views_count)
    flag mapping end*/
    //end
}