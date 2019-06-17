package inratind.test.application;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import inratind.test.application.databinding.ActivityMainBindingImpl;
import inratind.test.application.databinding.ActivitySplashBindingImpl;
import inratind.test.application.databinding.CommentatorsRecyclerItemBindingImpl;
import inratind.test.application.databinding.FragmentStatisticsPostBindingImpl;
import inratind.test.application.databinding.LayoutProgressBarBindingImpl;
import inratind.test.application.databinding.LayoutSnackBarBindingImpl;
import inratind.test.application.databinding.LikersRecyclerItemBindingImpl;
import inratind.test.application.databinding.MentionsRecyclerItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYSPLASH = 2;

  private static final int LAYOUT_COMMENTATORSRECYCLERITEM = 3;

  private static final int LAYOUT_FRAGMENTSTATISTICSPOST = 4;

  private static final int LAYOUT_LAYOUTPROGRESSBAR = 5;

  private static final int LAYOUT_LAYOUTSNACKBAR = 6;

  private static final int LAYOUT_LIKERSRECYCLERITEM = 7;

  private static final int LAYOUT_MENTIONSRECYCLERITEM = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(inratind.test.application.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(inratind.test.application.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(inratind.test.application.R.layout.commentators_recycler_item, LAYOUT_COMMENTATORSRECYCLERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(inratind.test.application.R.layout.fragment_statistics_post, LAYOUT_FRAGMENTSTATISTICSPOST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(inratind.test.application.R.layout.layout_progress_bar, LAYOUT_LAYOUTPROGRESSBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(inratind.test.application.R.layout.layout_snack_bar, LAYOUT_LAYOUTSNACKBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(inratind.test.application.R.layout.likers_recycler_item, LAYOUT_LIKERSRECYCLERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(inratind.test.application.R.layout.mentions_recycler_item, LAYOUT_MENTIONSRECYCLERITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_COMMENTATORSRECYCLERITEM: {
          if ("layout/commentators_recycler_item_0".equals(tag)) {
            return new CommentatorsRecyclerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for commentators_recycler_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTATISTICSPOST: {
          if ("layout/fragment_statistics_post_0".equals(tag)) {
            return new FragmentStatisticsPostBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_statistics_post is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPROGRESSBAR: {
          if ("layout/layout_progress_bar_0".equals(tag)) {
            return new LayoutProgressBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_progress_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSNACKBAR: {
          if ("layout/layout_snack_bar_0".equals(tag)) {
            return new LayoutSnackBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_snack_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_LIKERSRECYCLERITEM: {
          if ("layout/likers_recycler_item_0".equals(tag)) {
            return new LikersRecyclerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for likers_recycler_item is invalid. Received: " + tag);
        }
        case  LAYOUT_MENTIONSRECYCLERITEM: {
          if ("layout/mentions_recycler_item_0".equals(tag)) {
            return new MentionsRecyclerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for mentions_recycler_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "handler");
      sKeys.put(2, "view");
      sKeys.put(3, "adapter");
      sKeys.put(4, "data");
      sKeys.put(5, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", inratind.test.application.R.layout.activity_main);
      sKeys.put("layout/activity_splash_0", inratind.test.application.R.layout.activity_splash);
      sKeys.put("layout/commentators_recycler_item_0", inratind.test.application.R.layout.commentators_recycler_item);
      sKeys.put("layout/fragment_statistics_post_0", inratind.test.application.R.layout.fragment_statistics_post);
      sKeys.put("layout/layout_progress_bar_0", inratind.test.application.R.layout.layout_progress_bar);
      sKeys.put("layout/layout_snack_bar_0", inratind.test.application.R.layout.layout_snack_bar);
      sKeys.put("layout/likers_recycler_item_0", inratind.test.application.R.layout.likers_recycler_item);
      sKeys.put("layout/mentions_recycler_item_0", inratind.test.application.R.layout.mentions_recycler_item);
    }
  }
}
