// Generated by view binder compiler. Do not edit!
package com.example.gabble.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.gabble.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentStorySlidePageBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ScrollView content;

  @NonNull
  public final TextView storyContentText;

  private FragmentStorySlidePageBinding(@NonNull ScrollView rootView, @NonNull ScrollView content,
      @NonNull TextView storyContentText) {
    this.rootView = rootView;
    this.content = content;
    this.storyContentText = storyContentText;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentStorySlidePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentStorySlidePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_story_slide_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentStorySlidePageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ScrollView content = (ScrollView) rootView;

      id = R.id.story_content_text;
      TextView storyContentText = ViewBindings.findChildViewById(rootView, id);
      if (storyContentText == null) {
        break missingId;
      }

      return new FragmentStorySlidePageBinding((ScrollView) rootView, content, storyContentText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}