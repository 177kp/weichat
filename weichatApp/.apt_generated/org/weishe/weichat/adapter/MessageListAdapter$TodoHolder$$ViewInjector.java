// Generated code from Butter Knife. Do not modify!
package org.weishe.weichat.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MessageListAdapter$TodoHolder$$ViewInjector {
  public static void inject(Finder finder, final org.weishe.weichat.adapter.MessageListAdapter.TodoHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493012, "field 'avatarView'");
    target.avatarView = (org.weishe.weichat.view.CircularImage) view;
    view = finder.findRequiredView(source, 2131493287, "field 'requestMsgView'");
    target.requestMsgView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131493286, "field 'subjectView'");
    target.subjectView = (android.widget.TextView) view;
  }

  public static void reset(org.weishe.weichat.adapter.MessageListAdapter.TodoHolder target) {
    target.avatarView = null;
    target.requestMsgView = null;
    target.subjectView = null;
  }
}
