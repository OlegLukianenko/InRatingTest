package inratind.test.application.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import inratind.test.application.app.home.adapter.MentionsRecyclerAdapter;
import inratind.test.application.data.retrofit.response.StatsStatistics;

public abstract class MentionsRecyclerItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView Temp;

  @NonNull
  public final ConstraintLayout headerResizer;

  @NonNull
  public final ImageView image;

  @Bindable
  protected StatsStatistics.Data mData;

  @Bindable
  protected MentionsRecyclerAdapter mAdapter;

  protected MentionsRecyclerItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView Temp, ConstraintLayout headerResizer, ImageView image) {
    super(_bindingComponent, _root, _localFieldCount);
    this.Temp = Temp;
    this.headerResizer = headerResizer;
    this.image = image;
  }

  public abstract void setData(@Nullable StatsStatistics.Data data);

  @Nullable
  public StatsStatistics.Data getData() {
    return mData;
  }

  public abstract void setAdapter(@Nullable MentionsRecyclerAdapter adapter);

  @Nullable
  public MentionsRecyclerAdapter getAdapter() {
    return mAdapter;
  }

  @NonNull
  public static MentionsRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static MentionsRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<MentionsRecyclerItemBinding>inflate(inflater, inratind.test.application.R.layout.mentions_recycler_item, root, attachToRoot, component);
  }

  @NonNull
  public static MentionsRecyclerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static MentionsRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<MentionsRecyclerItemBinding>inflate(inflater, inratind.test.application.R.layout.mentions_recycler_item, null, false, component);
  }

  public static MentionsRecyclerItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static MentionsRecyclerItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (MentionsRecyclerItemBinding)bind(component, view, inratind.test.application.R.layout.mentions_recycler_item);
  }
}
