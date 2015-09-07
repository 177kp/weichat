// Generated code from Butter Knife. Do not modify!
package org.weishe.weichat.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class SearchActivity$$ViewInjector {
  public static void inject(Finder finder, final org.weishe.weichat.activity.SearchActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493008, "field 'searchFriendsTitle'");
    target.searchFriendsTitle = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131492955, "field 'mTitleBarView'");
    target.mTitleBarView = (org.weishe.weichat.view.TitleBarView) view;
    view = finder.findRequiredView(source, 2131493011, "field 'mViewPager'");
    target.mViewPager = (android.support.v4.view.ViewPager) view;
    view = finder.findRequiredView(source, 2131493009, "field 'searchGroupTitle'");
    target.searchGroupTitle = (android.widget.TextView) view;
  }

  public static void reset(org.weishe.weichat.activity.SearchActivity target) {
    target.searchFriendsTitle = null;
    target.mTitleBarView = null;
    target.mViewPager = null;
    target.searchGroupTitle = null;
  }
}
