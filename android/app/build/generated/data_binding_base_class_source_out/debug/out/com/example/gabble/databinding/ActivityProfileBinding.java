// Generated by view binder compiler. Do not edit!
package com.example.gabble.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.gabble.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText profileAbout;

  @NonNull
  public final AppCompatImageView profileDiscard;

  @NonNull
  public final RoundedImageView profileImage;

  @NonNull
  public final EditText profileName;

  @NonNull
  public final Button saveProfile;

  @NonNull
  public final FloatingActionButton updateImage;

  private ActivityProfileBinding(@NonNull ConstraintLayout rootView, @NonNull EditText profileAbout,
      @NonNull AppCompatImageView profileDiscard, @NonNull RoundedImageView profileImage,
      @NonNull EditText profileName, @NonNull Button saveProfile,
      @NonNull FloatingActionButton updateImage) {
    this.rootView = rootView;
    this.profileAbout = profileAbout;
    this.profileDiscard = profileDiscard;
    this.profileImage = profileImage;
    this.profileName = profileName;
    this.saveProfile = saveProfile;
    this.updateImage = updateImage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.profile_about;
      EditText profileAbout = ViewBindings.findChildViewById(rootView, id);
      if (profileAbout == null) {
        break missingId;
      }

      id = R.id.profileDiscard;
      AppCompatImageView profileDiscard = ViewBindings.findChildViewById(rootView, id);
      if (profileDiscard == null) {
        break missingId;
      }

      id = R.id.profile_image;
      RoundedImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.profile_name;
      EditText profileName = ViewBindings.findChildViewById(rootView, id);
      if (profileName == null) {
        break missingId;
      }

      id = R.id.save_profile;
      Button saveProfile = ViewBindings.findChildViewById(rootView, id);
      if (saveProfile == null) {
        break missingId;
      }

      id = R.id.updateImage;
      FloatingActionButton updateImage = ViewBindings.findChildViewById(rootView, id);
      if (updateImage == null) {
        break missingId;
      }

      return new ActivityProfileBinding((ConstraintLayout) rootView, profileAbout, profileDiscard,
          profileImage, profileName, saveProfile, updateImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
