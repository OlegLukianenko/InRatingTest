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
import inratind.test.application.app.home.adapter.LikersRecyclerAdapter;
import inratind.test.application.data.retrofit.response.StatsStatistics;

public abstract class LikersRecyclerItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView Temp;

  @NonNull
  public final ConstraintLayout headerResizer;

  @NonNull
  public final ImageView image;

  @Bindable
  protected StatsStatistics.Data mData;

  @Bindable
  protected LikersRecyclerAdapter mAdapter;

  protected LikersRecyclerItemBinding(DataBindingComponent _bindingComponent, View _root,
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

  public abstract void setAdapter(@Nullable LikersRecyclerAdapter adapter);

  @Nullable
  public LikersRecyclerAdapter getAdapter() {
    return mAdapter;
  }

  @NonNull
  public static LikersRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LikersRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LikersRecyclerItemBinding>inflate(inflater, inratind.test.application.R.layout.likers_recycler_item, root, attachToRoot, component);
  }

  @NonNull
  public static LikersRecyclerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LikersRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LikersRecyclerItemBinding>inflate(inflater, inratind.test.application.R.layout.likers_recycler_item, null, false, component);
  }

  public static LikersRecyclerItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LikersRecyclerItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LikersRecyclerItemBinding)bind(component, view, inratind.test.application.R.layout.likers_recycler_item);
  }
}
