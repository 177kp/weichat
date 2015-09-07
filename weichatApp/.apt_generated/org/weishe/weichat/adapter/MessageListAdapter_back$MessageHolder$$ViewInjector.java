// Generated code from Butter Knife. Do not modify!
package org.weishe.weichat.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MessageListAdapter_back$MessageHolder$$ViewInjector {
  public static void inject(Finder finder, final org.weishe.weichat.adapter.MessageListAdapter_back.MessageHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493259, "field 'nameView'");
    target.nameView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131493012, "field 'avatarView'");
    target.avatarView = (org.weishe.weichat.view.CircularImage) view;
    view = finder.findRequiredView(source, 2131493260, "field 'dateView'");
    target.dateView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131493261, "field 'messageView'");
    target.messageView = (android.widget.TextView) view;
  }

  public static void reset(org.weishe.weichat.adapter.MessageListAdapter_back.MessageHolder target) {
    target.nameView = null;
    target.avatarView = null;
    target.dateView = null;
    target.messageView = null;
  }
}
