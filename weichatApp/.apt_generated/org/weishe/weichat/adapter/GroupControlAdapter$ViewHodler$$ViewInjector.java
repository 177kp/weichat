// Generated code from Butter Knife. Do not modify!
package org.weishe.weichat.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class GroupControlAdapter$ViewHodler$$ViewInjector {
  public static void inject(Finder finder, final org.weishe.weichat.adapter.GroupControlAdapter.ViewHodler target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493208, "field 'friendsGroupName'");
    target.friendsGroupName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131493209, "field 'deleteBtn'");
    target.deleteBtn = (android.widget.Button) view;
    view = finder.findRequiredView(source, 2131493207, "field 'groupDeleteIcon'");
    target.groupDeleteIcon = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131492875, "field 'moveBtn'");
    target.moveBtn = (android.widget.ImageView) view;
  }

  public static void reset(org.weishe.weichat.adapter.GroupControlAdapter.ViewHodler target) {
    target.friendsGroupName = null;
    target.deleteBtn = null;
    target.groupDeleteIcon = null;
    target.moveBtn = null;
  }
}
