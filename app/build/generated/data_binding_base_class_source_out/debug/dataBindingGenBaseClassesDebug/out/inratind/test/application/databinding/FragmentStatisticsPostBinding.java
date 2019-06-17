package inratind.test.application.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import inratind.test.application.app.home.StatisticsPostFragment;
import inratind.test.application.viewmodel.StatisticsPostFragmentViewModel;

public abstract class FragmentStatisticsPostBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final View bookmarksBackground;

  @NonNull
  public final ConstraintLayout bookmarksContainer;

  @NonNull
  public final TextView bookmarksCount;

  @NonNull
  public final View commentatorsBackground;

  @NonNull
  public final ConstraintLayout commentatorsContainer;

  @NonNull
  public final TextView commentatorsCount;

  @NonNull
  public final RecyclerView commentatorsRecycleView;

  @NonNull
  public final ConstraintLayout headerBackground;

  @NonNull
  public final View headerResizer;

  @NonNull
  public final LayoutProgressBarBinding includeLayoutProgressBar;

  @NonNull
  public final View likeBackground;

  @NonNull
  public final ConstraintLayout likeContainer;

  @NonNull
  public final TextView likeCount;

  @NonNull
  public final View mentionsBackground;

  @NonNull
  public final ConstraintLayout mentionsContainer;

  @NonNull
  public final TextView mentionsCount;

  @NonNull
  public final RecyclerView mentionsRecycleView;

  @NonNull
  public final RecyclerView recycleView;

  @NonNull
  public final View repostersBackground;

  @NonNull
  public final ConstraintLayout repostersContainer;

  @NonNull
  public final TextView repostersCount;

  @NonNull
  public final TextView textPricing;

  @NonNull
  public final View viewsBackground;

  @NonNull
  public final ConstraintLayout viewsContainer;

  @NonNull
  public final TextView viewsCount;

  @Bindable
  protected StatisticsPostFragmentViewModel mViewModel;

  @Bindable
  protected StatisticsPostFragment mHandler;

  protected FragmentStatisticsPostBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView backArrow, View bookmarksBackground,
      ConstraintLayout bookmarksContainer, TextView bookmarksCount, View commentatorsBackground,
      ConstraintLayout commentatorsContainer, TextView commentatorsCount,
      RecyclerView commentatorsRecycleView, ConstraintLayout headerBackground, View headerResizer,
      LayoutProgressBarBinding includeLayoutProgressBar, View likeBackground,
      ConstraintLayout likeContainer, TextView likeCount, View mentionsBackground,
      ConstraintLayout mentionsContainer, TextView mentionsCount, RecyclerView mentionsRecycleView,
      RecyclerView recycleView, View repostersBackground, ConstraintLayout repostersContainer,
      TextView repostersCount, TextView textPricing, View viewsBackground,
      ConstraintLayout viewsContainer, TextView viewsCount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backArrow = backArrow;
    this.bookmarksBackground = bookmarksBackground;
    this.bookmarksContainer = bookmarksContainer;
    this.bookmarksCount = bookmarksCount;
    this.commentatorsBackground = commentatorsBackground;
    this.commentatorsContainer = commentatorsContainer;
    this.commentatorsCount = commentatorsCount;
    this.commentatorsRecycleView = commentatorsRecycleView;
    this.headerBackground = headerBackground;
    this.headerResizer = headerResizer;
    this.includeLayoutProgressBar = includeLayoutProgressBar;
    setContainedBinding(this.includeLayoutProgressBar);;
    this.likeBackground = likeBackground;
    this.likeContainer = likeContainer;
    this.likeCount = likeCount;
    this.mentionsBackground = mentionsBackground;
    this.mentionsContainer = mentionsContainer;
    this.mentionsCount = mentionsCount;
    this.mentionsRecycleView = mentionsRecycleView;
    this.recycleView = recycleView;
    this.repostersBackground = repostersBackground;
    this.repostersContainer = repostersContainer;
    this.repostersCount = repostersCount;
    this.textPricing = textPricing;
    this.viewsBackground = viewsBackground;
    this.viewsContainer = viewsContainer;
    this.viewsCount = viewsCount;
  }

  public abstract void setViewModel(@Nullable StatisticsPostFragmentViewModel viewModel);

  @Nullable
  public StatisticsPostFragmentViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setHandler(@Nullable StatisticsPostFragment handler);

  @Nullable
  public StatisticsPostFragment getHandler() {
    return mHandler;
  }

  @NonNull
  public static FragmentStatisticsPostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentStatisticsPostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentStatisticsPostBinding>inflate(inflater, inratind.test.application.R.layout.fragment_statistics_post, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentStatisticsPostBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentStatisticsPostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentStatisticsPostBinding>inflate(inflater, inratind.test.application.R.layout.fragment_statistics_post, null, false, component);
  }

  public static FragmentStatisticsPostBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentStatisticsPostBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentStatisticsPostBinding)bind(component, view, inratind.test.application.R.layout.fragment_statistics_post);
  }
}
