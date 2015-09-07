// Generated code from Butter Knife. Do not modify!
package org.weishe.weichat.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class UserInforActivity$$ViewInjector {
  public static void inject(Finder finder, final org.weishe.weichat.activity.UserInforActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493016, "field 'signatureTV'");
    target.signatureTV = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131492971, "field 'friendGroup'");
    target.friendGroup = view;
    view = finder.findRequiredView(source, 2131492976, "field 'actionButton'");
    target.actionButton = (android.widget.Button) view;
    view = finder.findRequiredView(source, 2131493013, "field 'nameTV'");
    target.nameTV = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131492989, "field 'accountTV'");
    target.accountTV = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131493014, "field 'genderTV'");
    target.genderTV = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131493012, "field 'photoIV'");
    target.photoIV = (org.weishe.weichat.view.CircularImage) view;
  }

  public static void reset(org.weishe.weichat.activity.UserInforActivity target) {
    target.signatureTV = null;
    target.friendGroup = null;
    target.actionButton = null;
    target.nameTV = null;
    target.accountTV = null;
    target.genderTV = null;
    target.photoIV = null;
  }
}
