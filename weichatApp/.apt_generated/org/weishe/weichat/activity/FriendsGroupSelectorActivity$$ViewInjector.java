// Generated code from Butter Knife. Do not modify!
package org.weishe.weichat.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class FriendsGroupSelectorActivity$$ViewInjector {
  public static void inject(Finder finder, final org.weishe.weichat.activity.FriendsGroupSelectorActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492977, "field 'mTitleBarView'");
    target.mTitleBarView = (org.weishe.weichat.view.TitleBarView) view;
    view = finder.findRequiredView(source, 2131492978, "field 'listView'");
    target.listView = (android.widget.ListView) view;
  }

  public static void reset(org.weishe.weichat.activity.FriendsGroupSelectorActivity target) {
    target.mTitleBarView = null;
    target.listView = null;
  }
}
