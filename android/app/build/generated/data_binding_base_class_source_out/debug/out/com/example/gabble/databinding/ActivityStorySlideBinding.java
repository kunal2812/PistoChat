// Generated by view binder compiler. Do not edit!
package com.example.gabble.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.example.gabble.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivityStorySlideBinding implements ViewBinding {
  @NonNull
  private final ViewPager2 rootView;

  @NonNull
  public final ViewPager2 storyPager;

  private ActivityStorySlideBinding(@NonNull ViewPager2 rootView, @NonNull ViewPager2 storyPager) {
    this.rootView = rootView;
    this.storyPager = storyPager;
  }

  @Override
  @NonNull
  public ViewPager2 getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityStorySlideBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityStorySlideBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_story_slide, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityStorySlideBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    ViewPager2 storyPager = (ViewPager2) rootView;

    return new ActivityStorySlideBinding((ViewPager2) rootView, storyPager);
  }
}
