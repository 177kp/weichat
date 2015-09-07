// Generated code from Butter Knife. Do not modify!
package org.weishe.weichat.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class FriendsGroupAdapter$ViewHodler$$ViewInjector {
  public static void inject(Finder finder, final org.weishe.weichat.adapter.FriendsGroupAdapter.ViewHodler target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493211, "field 'fgMove'");
    target.fgMove = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131493208, "field 'friendsGroupName'");
    target.friendsGroupName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131493212, "field 'checkBox'");
    target.checkBox = (android.widget.RadioButton) view;
  }

  public static void reset(org.weishe.weichat.adapter.FriendsGroupAdapter.ViewHodler target) {
    target.fgMove = null;
    target.friendsGroupName = null;
    target.checkBox = null;
  }
}
