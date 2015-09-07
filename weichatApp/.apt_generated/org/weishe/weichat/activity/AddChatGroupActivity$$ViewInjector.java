// Generated code from Butter Knife. Do not modify!
package org.weishe.weichat.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class AddChatGroupActivity$$ViewInjector {
  public static void inject(Finder finder, final org.weishe.weichat.activity.AddChatGroupActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492954, "field 'mIphoneTreeView'");
    target.mIphoneTreeView = (org.weishe.weichat.view.IphoneTreeView) view;
    view = finder.findRequiredView(source, 2131492953, "field 'mImageView'");
    target.mImageView = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131492952, "field 'mEditText'");
    target.mEditText = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131492950, "field 'mTitleBarView'");
    target.mTitleBarView = (org.weishe.weichat.view.TitleBarView) view;
  }

  public static void reset(org.weishe.weichat.activity.AddChatGroupActivity target) {
    target.mIphoneTreeView = null;
    target.mImageView = null;
    target.mEditText = null;
    target.mTitleBarView = null;
  }
}
