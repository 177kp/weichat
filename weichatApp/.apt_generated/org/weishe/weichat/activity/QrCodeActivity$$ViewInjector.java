// Generated code from Butter Knife. Do not modify!
package org.weishe.weichat.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class QrCodeActivity$$ViewInjector {
  public static void inject(Finder finder, final org.weishe.weichat.activity.QrCodeActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492955, "field 'titleView'");
    target.titleView = (org.weishe.weichat.view.TitleBarView) view;
    view = finder.findRequiredView(source, 2131492999, "field 'name'");
    target.name = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131493001, "field 'qrCodeImg'");
    target.qrCodeImg = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131493000, "field 'gender'");
    target.gender = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131492998, "field 'photo'");
    target.photo = (org.weishe.weichat.view.CircularImage) view;
  }

  public static void reset(org.weishe.weichat.activity.QrCodeActivity target) {
    target.titleView = null;
    target.name = null;
    target.qrCodeImg = null;
    target.gender = null;
    target.photo = null;
  }
}
