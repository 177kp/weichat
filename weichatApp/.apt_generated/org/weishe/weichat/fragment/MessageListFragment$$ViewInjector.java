// Generated code from Butter Knife. Do not modify!
package org.weishe.weichat.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MessageListFragment$$ViewInjector {
  public static void inject(Finder finder, final org.weishe.weichat.fragment.MessageListFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493161, "field 'mSwipeMenuListView'");
    target.mSwipeMenuListView = (com.baoyz.swipemenulistview.SwipeMenuListView) view;
    view = finder.findRequiredView(source, 2131493154, "field 'mSwipeRefreshLayout'");
    target.mSwipeRefreshLayout = (android.support.v4.widget.SwipeRefreshLayout) view;
    view = finder.findRequiredView(source, 2131492955, "field 'mTitleBarView'");
    target.mTitleBarView = (org.weishe.weichat.view.TitleBarView) view;
    view = finder.findRequiredView(source, 2131493155, "field 'mErrorLayout'");
    target.mErrorLayout = (org.weishe.weichat.view.EmptyLayout) view;
  }

  public static void reset(org.weishe.weichat.fragment.MessageListFragment target) {
    target.mSwipeMenuListView = null;
    target.mSwipeRefreshLayout = null;
    target.mTitleBarView = null;
    target.mErrorLayout = null;
  }
}
