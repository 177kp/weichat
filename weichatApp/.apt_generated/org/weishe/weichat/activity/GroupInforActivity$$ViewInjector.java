// Generated code from Butter Knife. Do not modify!
package org.weishe.weichat.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class GroupInforActivity$$ViewInjector {
  public static void inject(Finder finder, final org.weishe.weichat.activity.GroupInforActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492970, "field 'slogan'");
    target.slogan = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131492974, "field 'memberCount'");
    target.memberCount = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131492966, "field 'createBy'");
    target.createBy = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131492962, "field 'chatGroupAccount'");
    target.chatGroupAccount = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131492975, "field 'groupMember'");
    target.groupMember = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131492976, "field 'actionButton'");
    target.actionButton = (android.widget.Button) view;
    view = finder.findRequiredView(source, 2131492963, "field 'chatGroupName'");
    target.chatGroupName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131492968, "field 'groupClass'");
    target.groupClass = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131492961, "field 'groupPhoto'");
    target.groupPhoto = (android.widget.ImageView) view;
  }

  public static void reset(org.weishe.weichat.activity.GroupInforActivity target) {
    target.slogan = null;
    target.memberCount = null;
    target.createBy = null;
    target.chatGroupAccount = null;
    target.groupMember = null;
    target.actionButton = null;
    target.chatGroupName = null;
    target.groupClass = null;
    target.groupPhoto = null;
  }
}
