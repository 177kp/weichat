// Generated code from Butter Knife. Do not modify!
package org.weishe.weichat.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class FriendListFragment$$ViewInjector {
  public static void inject(Finder finder, final org.weishe.weichat.fragment.FriendListFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493160, "field 'tubiao'");
    target.tubiao = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131493154, "field 'mSwipeRefreshLayout'");
    target.mSwipeRefreshLayout = (android.support.v4.widget.SwipeRefreshLayout) view;
    view = finder.findRequiredView(source, 2131493159, "field 'group_content'");
    target.group_content = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131493155, "field 'mErrorLayout'");
    target.mErrorLayout = (org.weishe.weichat.view.EmptyLayout) view;
    view = finder.findRequiredView(source, 2131492954, "field 'mExpandableListView'");
    target.mExpandableListView = (org.weishe.weichat.view.IphoneTreeView) view;
    view = finder.findRequiredView(source, 2131493156, "field 'view_flotage'");
    target.view_flotage = (android.widget.LinearLayout) view;
  }

  public static void reset(org.weishe.weichat.fragment.FriendListFragment target) {
    target.tubiao = null;
    target.mSwipeRefreshLayout = null;
    target.group_content = null;
    target.mErrorLayout = null;
    target.mExpandableListView = null;
    target.view_flotage = null;
  }
}
