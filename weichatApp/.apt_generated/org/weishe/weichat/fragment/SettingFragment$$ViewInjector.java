// Generated code from Butter Knife. Do not modify!
package org.weishe.weichat.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class SettingFragment$$ViewInjector {
  public static void inject(Finder finder, final org.weishe.weichat.fragment.SettingFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492999, "field 'name'");
    target.name = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131492998, "field 'photo'");
    target.photo = (org.weishe.weichat.view.CircularImage) view;
    view = finder.findRequiredView(source, 2131493170, "field 'updateRl'");
    target.updateRl = (android.widget.RelativeLayout) view;
    view = finder.findRequiredView(source, 2131493000, "field 'gender'");
    target.gender = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131493166, "field 'qrCodeRl'");
    target.qrCodeRl = (android.widget.RelativeLayout) view;
    view = finder.findRequiredView(source, 2131492997, "field 'mCanversLayout'");
    target.mCanversLayout = (android.widget.RelativeLayout) view;
    view = finder.findRequiredView(source, 2131493015, "field 'signature'");
    target.signature = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131492955, "field 'mTitleBarView'");
    target.mTitleBarView = (org.weishe.weichat.view.TitleBarView) view;
    view = finder.findRequiredView(source, 2131493172, "field 'setRl'");
    target.setRl = (android.widget.RelativeLayout) view;
  }

  public static void reset(org.weishe.weichat.fragment.SettingFragment target) {
    target.name = null;
    target.photo = null;
    target.updateRl = null;
    target.gender = null;
    target.qrCodeRl = null;
    target.mCanversLayout = null;
    target.signature = null;
    target.mTitleBarView = null;
    target.setRl = null;
  }
}
